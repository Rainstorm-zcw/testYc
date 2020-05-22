package com.example.testyc.util.interceptor;

import com.example.testyc.support.annotation.RabbitMQApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限(Token)验证
 *
 * @author zcw
 * @date 2020-01-09
 */
@Slf4j
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        RabbitMQApi annotation;
        if (handler instanceof HandlerMethod) {
            annotation = ((HandlerMethod) handler).getMethodAnnotation(RabbitMQApi.class);
        } else {
            return true;
        }
        // 这写你拦截需要干的事儿，比如取缓存，SESSION，权限判断等
        if (annotation != null) {
            request.getHeader("token");
            log.info("拦截器启动");
        }
        return true;
    }
}
