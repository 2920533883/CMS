package com.itzhang.service;

import com.itzhang.mapper.UserMapper;
import com.itzhang.pojo.JsonRes;
import com.itzhang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 用户服务接口实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    /**
     * 获取所有用户类
     * @return 能被Lay_ui识别的json格式字符串
     */
    @Override
    public JsonRes getAllUser() {
        List<User> allUser = userMapper.getAllUser();
        return new JsonRes(0, "成功", allUser);
    }
}
