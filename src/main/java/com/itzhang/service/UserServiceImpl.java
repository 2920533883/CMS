package com.itzhang.service;

import com.itzhang.mapper.UserMapper;
import com.itzhang.pojo.JsonRes;
import com.itzhang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public JsonRes getAllUser() {
        List<User> allUser = userMapper.getAllUser();
        return new JsonRes(0, "成功", allUser);
    }
}
