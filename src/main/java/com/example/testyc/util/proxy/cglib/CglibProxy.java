package com.example.testyc.util.proxy.cglib;

import com.example.testyc.util.proxy.jdk.UserNoImplement;
import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 */
@Slf4j
public class CglibProxy implements MethodInterceptor {

    /**
     * 需要代理对象
     */
    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("cglib动态代理开始");
        //方法执行，参数：target 目标对象 arr参数数组
        Object invoke = method.invoke(target, objects);
        log.info("cglib动态代理结束");
        return invoke;
    }

    public Object getCglibProxy(Object objectTarget){
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类，因为cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        //设置回调
        enhancer.setCallback(this);
        Object result = enhancer.create();
        return result;
    }

    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        UserNoImplement userNoImplement = (UserNoImplement) cglibProxy.getCglibProxy(new UserNoImplement());
        userNoImplement.testInfo();
    }
}
