package com.example.testyc.util.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(String name, String password) {
        log.info("调用添加用户方法参数为:{},{}", name, password);
    }

    @Override
    public void delUser(String name) {
        log.info("调用删除用户方法參數为:{}", name);
    }
}
