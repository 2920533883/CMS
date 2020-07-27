package com.itzhang.mapper;

import com.itzhang.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 管理员Mapper
 */
@Mapper
public interface ManagerMapper {
    List<Manager> getAllManager();
    // 用于查询
    List<Manager> getManagerByName(String name);
    // 用于登录
    Manager getManagerByPhone(String phone);
    // 注册
    int addManager(Manager manager);
}
