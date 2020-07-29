package com.itzhang.mapper;

import com.itzhang.pojo.Manager;
import java.util.List;

/**
 * 管理员Mapper
 */
public interface ManagerMapper {
    // 获取所有管理员信息
    List<Manager> getAllManager();
    // 用于登录
    Manager getManagerByPhone(String phone);
    // 注册
    int addManager(Manager manager);
}
