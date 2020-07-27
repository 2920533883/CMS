package com.itzhang.mapper;

import com.itzhang.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUser();
    List<User> getUserByName(String name);

}
