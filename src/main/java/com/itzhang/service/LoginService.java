package com.itzhang.service;

import com.itzhang.bean.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: CMS
 * @description: 登陆检查接口
 * @author: zhang rui feng
 * @create: 2020-07-19 10:48
 */

public interface LoginService {
    Emp loginCheck(String username);
}
