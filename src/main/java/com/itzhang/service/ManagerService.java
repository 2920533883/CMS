package com.itzhang.service;

import com.itzhang.pojo.JsonRes;
import com.itzhang.pojo.Manager;

/**
 * 管理员服务接口
 */
public interface ManagerService {
    JsonRes getAllManager();
    // 用于登录
    Manager getManagerByPhone(String phone);
}
