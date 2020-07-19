package com.itzhang.service.Impl;

import com.itzhang.bean.Emp;
import com.itzhang.mapper.LoginMapper;
import com.itzhang.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: CMS
 * @description: 登陆检查实现
 * @author: zhang rui feng
 * @create: 2020-07-19 10:48
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    @Override
    public Emp loginCheck(String username) {
        return loginMapper.loginCheck(username);
    }
}
