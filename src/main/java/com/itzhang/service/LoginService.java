package com.itzhang.service;

import com.itzhang.pojo.Manager;

public interface LoginService {
    void doRegister(Manager manager);
    void doLogin(String phone, String name);
}
