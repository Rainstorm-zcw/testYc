package com.example.testyc.util.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理实现InvocationHandler接口
 */
@Slf4j
public class JdkProxy implements InvocationHandler {

    private Object object;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("JDK动态代理，监听开始！");
        Object result = method.invoke(object, args);
        log.info("JDK动态代理，监听结束！");
        return result;
    }

    /**
     * 定义获取代理的方法
     */
    private Object getJdkProxy(Object targetObject) {
        //为目标对象target赋值
        this.object = targetObject;
        //JDK动态代理只能针对实现了接口的类进行代理，newProxyInstance 函数所需参数就可看出
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        //实例化jdkProxy对象
        JdkProxy jdkProxy = new JdkProxy();

        UserService userService = (UserService) jdkProxy.getJdkProxy(new UserServiceImpl());

        userService.addUser("呵呵","123456");


        UserNoImplement userNoImplement = (UserNoImplement) jdkProxy.getJdkProxy(new UserNoImplement());
        userNoImplement.testInfo();

    }



}
