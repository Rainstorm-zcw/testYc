package com.example.testyc.util.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

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
    }
}
