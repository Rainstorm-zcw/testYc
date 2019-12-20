package com.example.testyc.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zcw
 * @Date: 2018-09-07
 * @Description httpClient 工具类
 */
@Component
public class HttpClientSender {

    private static final Logger log = LoggerFactory.getLogger(HttpClientSender.class);

    private static PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = null;

    private static Map<String, CloseableHttpClient> httpClients = new HashMap<>();

    private static Object o = new Object();

    private final static String REQ_CHARSET = "UTF-8";

    private final static String GB2312 = "GB2312";

    private final static String SPD_SIGN = "INFOSEC_SIGN/1.0d";

    private final static String SPD_SIGN_VERIFY = "INFOSEC_VERIFY_SIGN/1.0d";


    public static String postForm(String url, Map<String, String> data) {
        CloseableHttpClient httpClient = getHttpClient(url);
        return sendPostForm(httpClient, url, data);
    }

    public static String postFile(String url, Map<String, Object> data, File file) {
        CloseableHttpClient httpClient = getHttpClient(url);
        return sendPostFile(httpClient, url, data, file);
    }

    public static String sendHttpPost(String host, String method, String urlParams, String sendData, Map<String,String> map) throws IOException {

        String requestUrl = host + method + urlParams;


        Map<String, Object> response = request("POST", requestUrl, sendData, map, map.get("Content-Type"));
        int responseCode = Integer.parseInt(response.get("responseCode").toString());
        byte[] responseBytes = (byte[]) response.get("responseData");
        String responseString;
        try {
            responseString = new String(responseBytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            responseString = new String(responseBytes);
        }
        //请求返回结果无论成功失败，http-status均为200
        if (responseCode == 200) {
            //返回结果
            return responseString;
        } else {
            throw new IOException(responseCode + ":" + responseString);
        }
    }

    public static byte[] sendHttpGet(String host, String method, String urlParams,Map<String,String> headers) throws IOException {
        String requestUrl = host + method + urlParams;
        Map<String, Object> response = request("GET", requestUrl, null, headers , headers.get("Content-Type"));
        int responseCode = Integer.parseInt(response.get("responseCode").toString());
        byte[] responseBytes = (byte[]) response.get("responseData");
        //请求返回结果无论成功失败，http-status均为200
        if (responseCode == 200) {
            //返回结果
            return responseBytes;
        } else {
            throw new IOException(responseCode + "");
        }
    }

    public static String urlEncode(String data) {
        return urlEncode(data, "UTF-8");
    }

    private static String urlEncode(String data, String charset) {
        try {
            return URLEncoder.encode(data, charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private static Map<String, Object> request(String method, String url, Object sendData, Map<String, String> headers, String contentType) throws IOException {


        String requestPath;
        try {
            requestPath = new URL(url).getPath();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        CloseableHttpClient httpClient = getHttpClient(requestPath);

        Map<String, Object> response;
        if ("POST".equals(method)) {
            response = sendPost(httpClient, url, headers, sendData, contentType);
        } else {
            response = sendGet(httpClient, url, headers);
        }
        return response;
    }

    private static String sendPostFile(CloseableHttpClient httpClient, String url, Map<String, Object> requestBody, File file) {
        log.info("[HttpRequester] [POST {}]", url);
        int responseCode;
        String result = null;
        HttpPost request = new HttpPost(url);
        if (!CollectionUtils.isEmpty(requestBody)) {
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.addBinaryBody("file", file);
            builder.setCharset(Charset.defaultCharset());
            ContentType contentType = ContentType.create("multipart/form-data", UtilConstant.DEFAULT_CHARSET_UTF8);
            requestBody.keySet().forEach(key -> {
                StringBody stringBody = new StringBody(requestBody.get(key).toString(), contentType);
                builder.addPart(key, stringBody);
            });
            request.setEntity(builder.build());
            HttpEntity httpEntity;
            try {
                CloseableHttpResponse response = httpClient.execute(request);
                responseCode = response.getStatusLine().getStatusCode();
                httpEntity = response.getEntity();
                result = EntityUtils.toString(httpEntity, UtilConstant.DEFAULT_CHARSET_UTF8);
                log.info("HttpRequester success responseCode[{}]", responseCode);
                httpEntity = response.getEntity();
                result = EntityUtils.toString(httpEntity, UtilConstant.DEFAULT_CHARSET_UTF8);
            } catch (IOException e) {
                log.info("HttpRequester exception message[{}]", e.getMessage());
            }
        }
        return result;
    }

    /**
     * 发送post请求
     *
     * @param httpClient
     * @param url
     * @param headers
     * @param sendData
     * @return
     * @throws IOException
     */
    private static Map<String, Object> sendPost(CloseableHttpClient httpClient, String url,
                                                Map<String, String> headers, Object sendData, String contentType) throws IOException {
        log.info("[HttpRequester] [POST {} ]", url);
        int responseCode = -1;
        byte[] responseBytes = null;

        HttpPost request = new HttpPost(url);
        //添加请求头部信息
        if (!CollectionUtils.isEmpty(headers)) {
            headers.keySet().forEach(name -> {
                String value = headers.get(name);
                request.setHeader(name, value);
            });
        }

        if (sendData != null) {
            String CHARSET;
            if(contentType == SPD_SIGN || contentType == SPD_SIGN_VERIFY){
                CHARSET = GB2312;
            }else{
                CHARSET = REQ_CHARSET;
            }
            StringEntity entity = new StringEntity((String) sendData, CHARSET);
            entity.setContentType(contentType);
            request.setEntity(entity);

            HttpEntity httpEntity = null;
            IOException exception = null;

            for (int i = 0; i < 3; i++) {
                try {
                    CloseableHttpResponse response = httpClient.execute(request);
                    responseCode = response.getStatusLine().getStatusCode();
                    httpEntity = response.getEntity();
                        String responseBody = EntityUtils.toString(httpEntity, "GB2312");
                    if (Strings.isNotBlank(responseBody)) {
                        responseBytes = responseBody.getBytes();
                    } else {
                        InputStream respStream = null;

                        try {
                            respStream = httpEntity.getContent();
                            int respBodySize = respStream.available();
                            if (respBodySize <= 0) {
                                throw new IOException("Invalid respBodySize: " + respBodySize);
                            }
                            responseBytes = new byte[respBodySize];
                            if (respStream.read(responseBytes) != respBodySize) {
                                throw new IOException("Read respBody Error");
                            }
                        } catch (Exception e) {

                        } finally {
                            if (null != respStream) {
                                respStream.close();
                            }
                        }
                    }
                    exception = null;
                    break;
                } catch (UnsupportedOperationException e) {
                    try {
                        EntityUtils.consume(httpEntity);
                    } catch (IOException e1) {

                    }
                    throw new RuntimeException(e.getMessage(), e);
                } catch (IOException e) {
                    e.printStackTrace();
                    exception = e;
                    try {
                        EntityUtils.consume(httpEntity);
                    } catch (IOException e1) {

                    }
                }
            }
            if (null != exception) {
                throw exception;
            }
        }
        Map<String, Object> response = new HashMap<>();
        response.put("responseCode", responseCode);
        response.put("responseData", responseBytes);
        return response;
    }

    private static Map<String, Object> sendGet(CloseableHttpClient httpClient, String url, Map<String, String> headers) throws IOException {
        String tag = "[HttpRequester] [GET " + url + "]";
        int responseCode = -1;
        byte[] responseBytes = null;

        HttpGet request = new HttpGet(url);
        if (headers != null && headers.size() > 0) {
            for (String name : headers.keySet()) {
                String value = headers.get(name);
                request.setHeader(name, value);
            }
        }
        HttpEntity httpEntity = null;
        IOException exception = null;
        for (int i = 0; i < 3; i++) {
            try {
                CloseableHttpResponse response = httpClient.execute(request);
                responseCode = response.getStatusLine().getStatusCode();
                httpEntity = response.getEntity();

                byte[] responseBody = EntityUtils.toByteArray(httpEntity);
                if (responseBody != null) {
                    responseBytes = responseBody;
                } else {
                    InputStream respStream = null;
                    try {
                        respStream = httpEntity.getContent();
                        int respBodySize = respStream.available();
                        if (respBodySize <= 0){ throw new IOException("Invalid respBodySize: " + respBodySize);}
                        responseBytes = new byte[respBodySize];
                        if (respStream.read(responseBytes) != respBodySize){throw new IOException("Read respBody Error");}

                    } catch (Exception e) {
                    } finally {
                        if (respStream != null) {
                            respStream.close();
                        }
                    }
                }

                exception = null;
                break;
            } catch (UnsupportedOperationException e) {
                try {
                    EntityUtils.consume(httpEntity);
                } catch (IOException e2) {

                }
                throw new RuntimeException(e.getMessage(), e);
            } catch (IOException e) {
                e.printStackTrace();
                exception = e;
                try {
                    EntityUtils.consume(httpEntity);
                } catch (IOException e2) {

                }

            }
        }
        if (exception != null) {
            throw exception;
        }
        Map<String, Object> response = Maps.newHashMap();
        response.put("responseCode", responseCode);
        response.put("responseData", responseBytes);
        return response;
    }

    private static String getLoggerString(final byte[] data, int maxLength) {
        String loggerString;
        if (data.length > maxLength) {
            byte[] shortData = new byte[maxLength];
            System.arraycopy(data, 0, shortData, 0, shortData.length);
            try {
                loggerString = new String(shortData, "UTF-8") + "...";
            } catch (UnsupportedEncodingException e) {
                loggerString = new String(shortData) + "...";
            }
        } else {
            try {
                loggerString = new String(data, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                loggerString = new String(data);
            }
        }

        char[] chars = new char[loggerString.length()];
        loggerString.getChars(0, loggerString.length(), chars, 0);
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '\n' || c == '\r') {
                chars[i] = ' ';
            }
        }
        return new String(chars);
    }

    private static CloseableHttpClient getHttpClient(String requestPath) {
        if (httpClients.containsKey(requestPath)) {
            return httpClients.get(requestPath);
        }
        if (poolingHttpClientConnectionManager == null) {
            synchronized (o) {
                if (poolingHttpClientConnectionManager == null) {
                    poolingHttpClientConnectionManager = HttpClientUtils.createHttpClientConnectionManager();
                }
            }
        }
        synchronized (httpClients) {
            if (httpClients.containsKey(requestPath)) {
                return httpClients.get(requestPath);
            }
            CloseableHttpClient httpClient = HttpClientUtils.createHttpClient(poolingHttpClientConnectionManager);
            httpClients.put(requestPath, httpClient);
            return httpClient;
        }
    }

    private static class HttpClientUtils {
        //默认链接超时
        private static int defaultConnectionTimeout = 60000;
        //默认读取超时
        private static int defaultReadTimeout = 60000;

        /**
         * 获取httpClient
         *
         * @param connManager
         * @return
         */
        public static CloseableHttpClient createHttpClient(PoolingHttpClientConnectionManager connManager) {
            return HttpClients.custom()
                    .setConnectionManager(connManager)
                    .disableContentCompression()
                    .setSSLContext(getSslContext())
                    .setDefaultRequestConfig(getRequestConfig())
                    .build();
        }

        /**
         * @return
         */
        public static PoolingHttpClientConnectionManager createHttpClientConnectionManager() {
            SSLConnectionSocketFactory sslConnectionSocketFactory = null;
            try {
                sslConnectionSocketFactory = new SSLConnectionSocketFactory(getSslContext(), SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("https", sslConnectionSocketFactory)
                    .register("http", new PlainConnectionSocketFactory())
                    .build();
            PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
            cm.setMaxTotal(500);
            cm.setDefaultMaxPerRoute(500);
            return cm;
        }

        /**
         * 请求默认配置
         *
         * @return
         */
        private static RequestConfig getRequestConfig() {
            return RequestConfig.custom()
                    .setConnectionRequestTimeout(defaultConnectionTimeout)
                    .setSocketTimeout(defaultReadTimeout)
                    .build();
        }

        /**
         * https 绕过证书验证
         *
         * @return
         */
        private static SSLContext getSslContext() {
            SSLContext sslContext = null;
            try {
                sslContext = SSLContext.getInstance("TLS");
                TrustManager tm = new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                    }

                    @Override
                    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                    }

                    @Override
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                };
                sslContext.init(null, new TrustManager[]{tm}, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return sslContext;
        }
    }

    private static String sendPostForm(CloseableHttpClient httpClient, String url, Map<String, String> data) {
        String result = null;
        HttpPost post = new HttpPost(url);
        if (!CollectionUtils.isEmpty(data)) {
            List<NameValuePair> params = Lists.newArrayList();
            data.keySet().forEach(key -> {
                params.add(new BasicNameValuePair(key, data.get(key)));
            });
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, Charset.forName("UTF-8"));
            post.setEntity(entity);
            try {
                CloseableHttpResponse response = httpClient.execute(post);
                result = EntityUtils.toString(response.getEntity(), Charset.forName("UTF-8"));
                log.info("HttpRequester success result[{}]", result);
            } catch (IOException e) {
                log.info("HttpRequester exception message[{}]", e.getMessage());
            }
        }
        return result;
    }
}
