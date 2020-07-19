package com.itzhang.mapper;

import com.itzhang.bean.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: CMS
 * @description: 登陆检查
 * @author: zhang rui feng
 * @create: 2020-07-19 10:45
 */
public interface LoginMapper {
    public Emp loginCheck(String username);
}
