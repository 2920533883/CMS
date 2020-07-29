package com.itzhang.service;

import com.itzhang.pojo.Manager;

/**
 * 登陆服务接口
 */
public interface LoginService {
    void doRegister(Manager manager);
    void doLogin(String phone, String name);
}
