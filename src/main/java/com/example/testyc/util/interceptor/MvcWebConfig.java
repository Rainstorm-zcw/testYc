package com.example.testyc.util.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.util.List;

/**
 *  implements WebMvcConfigurer
 *  一些教程使用的WebMvcConfigurationSupport，
 *  我使用后发现，classpath:/META/resources/，classpath:/resources/，classpath:/static/，classpath:/public/）不生效。
 *  具体可以原因，大家可以看下源码因为：WebMvcAutoConfiguration上有个条件注解： @ConditionalOnMissingBean(WebMvcConfigurationSupport.class)
 *
 */
@Configuration
public class MvcWebConfig extends WebMvcConfigurationSupport {
    @Autowired
    private AuthorizationInterceptor authorizationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationInterceptor).addPathPatterns("/rabbitMQ/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");
        // 解决 SWAGGER 404报错
        //究其原因,是因为 MVC 没有找到 swagger-ui 包中的 swagger-ui.html 文件
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
        //静态文件
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

/*
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/public/");
        super.addResourceHandlers(registry);
*/

    }

    /**
     * 解决响应中文乱码问题
     * @return
     */
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        /**
         * StringHttpMessageConverter的作用:负责读取字符串格式的数据和写出二进制格式的数据(当返回值时或者接受值是String类型时，是由这个处理)
         */
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
        //MappingJacksonHttpMessageConverter:  负责读取和写入json格式的数据；(当返回值是对象或者List，就由这个处理)
        converters.add(new MappingJackson2HttpMessageConverter());
    }
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false); //支持后缀匹配
    }
}
