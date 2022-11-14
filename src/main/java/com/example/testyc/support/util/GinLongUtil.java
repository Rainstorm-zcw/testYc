package com.example.testyc.support.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.testyc.persistence.entity.vo.CollectorDetail;
import com.example.testyc.persistence.entity.vo.StationList;
import com.google.common.collect.Maps;
import com.squareup.okhttp.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
@Service
public class GinLongUtil {

    //@Value("${keyId}")  1300386381676537060
    public static String keyId = "1300386381676699592";

    //@Value("${secretKey}")
   // @Value("${registry.address}") 2c2594c8ab4a4859a56125574e9a7168
    public static String secretKey = "c4521e83c63b44ecb08a9afafbb24c96";

    //@Value("${url}")
    //@Value("${registry.address}")
    public static String urls = "https://api.ginlong.com:13333";

    //@Value("${registry.address}")
    public String address;

    private final static Logger logger = LoggerFactory.getLogger(GinLongUtil.class);

    /**
     * //todo  1、查询户用电站 中国风电的列表
     * //todo  2、按列表的 otherStationId 调用 锦浪采集器接口 查询锦浪电站id，更新中国风电列表对应id
     * //todo  3、按锦浪电站id 调用电站详情数据  更新本地日电量
     * @param args
     */
    public static void main(String[] args) {
        //userStationList();
         //collectorDetail();

        stationDetail();
        //syncStationDayEnergy();

        //stationDay();
    }


    /**
     * 电站详情
     * @return
     */
    public static String stationDetail(){
        Map<String, Object> map = new HashMap();
        map.put("id","1299184320438123834" );
        map.put("id","1299184320438141909" );
        String path = "/v1/api/inveterDetail";
        String resultString = postGinLong(map, path);
        return resultString;
    }

    /**
     * 采集器详情
     * @return
     */
    public static CollectorDetail collectorDetail(){
        Map<String, Object> map = new HashMap();
        //map.put("id","1299184320438175627" );
        //map.put("userId", keyId);
        map.put("sn", "0436714619");
        String path = "/v1/api/inveterDetail";
        String resultString = postGinLong(map, path);
        CollectorDetail collectorDetail = null;
        JSONObject jsonObject = JSONObject.parseObject(resultString);
        if(jsonObject.get("success").equals(true)){
            collectorDetail = JSON.parseObject(jsonObject.get("data").toString(), CollectorDetail.class);
        }
        logger.info("输出解析采集器:{}", JSON.toJSONString(collectorDetail));
        return collectorDetail;
    }

    /**
     * 1、循环日期   从某个日期一直到当天，判断新增的数据直接插入  存在的不操作
     * 2、循环分页  获取每天的每个电站的日电量  用于更新
     * 3、
     */
    public static void syncStationDayEnergy(){
        JSONObject jsonObject = stationDayEnergyList(4, "2020-08-01");
        if(Objects.isNull(jsonObject)){
            return;
        }
        String data = jsonObject.get("data").toString();
        JSONObject jsonData = JSONObject.parseObject(data);
        Integer pages = jsonData.getInteger("pages");
        while (pages>0) {
            try {
                Thread.sleep(2000L);
            }catch (Exception ex){
                ex.printStackTrace();
            }
            JSONObject jsonObject1 = stationDayEnergyList(pages, "2020-09-27");
            log.info("测试日电量:{}", JSON.toJSONString(jsonObject1));
            log.info("pages分页第:{}页",pages);
            pages--;
        }

    }

    public static JSONObject stationDayEnergyList(Integer pageNo, String time){
        Map<String, Object> map = Maps.newHashMap();
        map.put("pageNo",pageNo);
        map.put("pageSize", 100);
        map.put("time", time);
        String path = "/v1/api/stationDayEnergyList";
        String resultString = postGinLong(map, path);
        JSONObject jsonObject = JSONObject.parseObject(resultString);
        logger.info("输出jsonObject:{}", JSON.toJSONString(jsonObject));
        if(Objects.nonNull(jsonObject) && jsonObject.get("success").equals(true) && Objects.nonNull(jsonObject.get("data"))){
            return jsonObject;
        }
        return null;
    }

    public static String stationDay(){
        Map<String, Object> map = Maps.newHashMap();
        map.put("id",1299184320438133156L);
        map.put("time", "2020-09-27");
        map.put("timeZone", 8L);
        map.put("money", "CNY");
        String path = "/v1/api/stationDay";
        String resultString = postGinLong(map, path);
        JSONObject jsonObject = JSONObject.parseObject(resultString);
        logger.info("输出jsonObject11111:{}", JSON.toJSONString(jsonObject));
        if(jsonObject.get("success").equals(true) && Objects.nonNull(jsonObject.get("data"))){

        }
        return "";
    }

    /**
     * 锦浪电站列表
     * @return
     */
    public static List<StationList> userStationList(){
        Map<String, Object> map = new HashMap();
            map.put("pageNo", 10);
            map.put("pageSize", 20);
       /* map.put("id","1299184320438175627" );
        //map.put("userId", keyId);
        map.put("sn", "1325493672");*/
        String path = "/v1/api/userStationList";
        String resultString = postGinLong(map, path);
        JSONObject jsonObject = JSONObject.parseObject(resultString);
        String data = jsonObject.get("data").toString();
        JSONObject jsonData = JSONObject.parseObject(data);
        String page = jsonData.get("page").toString();
        JSONObject jsonPage = JSONObject.parseObject(page);
        List<StationList> stationLists = JSON.parseArray(jsonPage.get("records").toString(), StationList.class);
        logger.info("输出锦浪云电站列表:{}", JSON.toJSONString(stationLists));
        return stationLists;
    }

    public static String postGinLong(Map<String, Object> paramMap, String urlParam){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse httpResponse = null;
        String result = "";
        try {
            String body = JSON.toJSONString(paramMap);
            log.info("body:{}", body);
            String ContentMd5 = getDigest(body);
            String Date = getGMTTime();
            String path = urlParam;
            String param = "POST" + "\n" + ContentMd5 + "\n" + "application/json" + "\n" + Date + "\n" + path;
            String sign = HmacSHA1Encrypt(param, secretKey);
            String url = urls + path;
          /*  OkHttpClient client = new OkHttpClient();
            MediaType xmlType = MediaType.parse("application/json;charset=UTF-8");
            RequestBody requestBody = RequestBody.create(xmlType,body);
            Request request = new Request.Builder()
                    .url(url)
                    .addHeader("Content-type", "application/json;charset=UTF-8")
                    .addHeader("Authorization","API "+keyId+":"+sign)
                    .addHeader("Content-MD5",ContentMd5)
                    .addHeader("Date",Date)
                    .post(requestBody)
                    .build();
            log.info(ContentMd5);
            log.info(Date);
            log.info("API "+keyId+":"+sign);
            Response response = client.newCall(request).execute();
            String resultString = response.body().string();
            System.out.println(resultString);*/
            String resultString = "";
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-type", "application/json;charset=UTF-8");
            httpPost.addHeader("Authorization", "API " + keyId + ":" + sign);
            httpPost.addHeader("Content-MD5", ContentMd5);
            httpPost.addHeader("Date", Date);
            StringEntity stringEntity = new StringEntity(body, ContentType.APPLICATION_JSON);
            httpPost.setEntity(stringEntity);
            //log.info("输出httpPost:{}",JSON.toJSONString(httpPost));
            httpResponse = httpClient.execute(httpPost);
            HttpEntity entity = httpResponse.getEntity();
            resultString = EntityUtils.toString(entity, "utf-8");
            EntityUtils.consume(entity);
            System.out.println("===============================");
            System.out.println(resultString);
            result = resultString;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpResponse.close();
                httpClient.close();
            } catch (IOException e) {
                log.error("关闭流错误", e);
            }
        }
        return result;
    }

    public static String HmacSHA1Encrypt(String encryptText, String KeySecret) throws Exception {
        byte[] data = KeySecret.getBytes("UTF-8");
        //根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
        SecretKey secretKey = new SecretKeySpec(data, "HmacSHA1");
        //生成一个指定 Mac 算法 的 Mac 对象
        Mac mac = Mac.getInstance("HmacSHA1");
        //用给定密钥初始化 Mac 对象
        mac.init(secretKey);

        byte[] text = encryptText.getBytes("UTF-8");
        //完成 Mac 操作
        byte[] result = mac.doFinal(text);
        return Base64.getEncoder().encodeToString(result);
    }

    public static String getGMTTime() {

        Calendar cd = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT")); // 设置时区为GMT
        String str = sdf.format(cd.getTime());
        return str;
    }

    public static String getDigest(String test) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(test.getBytes());
            byte[] b = md.digest();
            result = Base64.getEncoder().encodeToString(b);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
