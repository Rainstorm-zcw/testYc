package com.example.testyc;

import com.example.testyc.support.annotation.OuyeelApi;
import com.example.testyc.support.annotation.RabbitMQApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zcw
 * @date 2019-09-24
 * @decription Swagger配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket innerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("云仓接口api")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(OuyeelApi.class))
                .build()
                .apiInfo(innerApiInfo());
    }

    public ApiInfo innerApiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")
                .description("服务端通用接口")
                .contact(new Contact("zcw", "null", "zhaochengwei968@163.com"))
                .licenseUrl("http://localhost:8888/doc.html")
                .version("1.0")
                .description("测试云仓服务接口")
                .termsOfServiceUrl("http://localhost:8888/doc.html")
                .build();
    }

    @Bean
    public Docket rabbitMQApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("rabbitMQ实例")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RabbitMQApi.class))
                .build()
                .apiInfo(innerApiInfo());
    }

    public ApiInfo rabbitMQInfo() {
        return new ApiInfoBuilder()
                .title("rabbitMQ实例")
                .description("springBoot整合rabbitMQ用法")
                .contact(new Contact("zcw", "null", "zhaochengwei968@163.com"))
                .licenseUrl("http://localhost:8888/doc.html")
                .version("1.0")
                .description("测试云仓服务接口")
                .termsOfServiceUrl("http://localhost:8888/doc.html")
                .build()
                ;
    }


}
