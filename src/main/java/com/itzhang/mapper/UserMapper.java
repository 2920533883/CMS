package com.itzhang.mapper;

import com.itzhang.pojo.User;
import java.util.List;


/**
 * 用户Mapper
 */
public interface UserMapper {
    // 获取所有用户
    List<User> getAllUser();
}
