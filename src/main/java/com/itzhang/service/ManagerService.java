package com.itzhang.service;

import com.itzhang.pojo.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> getAllManager();
    // 用于查询
    List<Manager> getManagerByName(String name);
    // 用于登录
    Manager getManagerByPhone(String phone);
}
