package com.itzhang.controller;

import com.itzhang.pojo.JsonRes;
import com.itzhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制类
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 请求 /user 资源，跳转到用户信息页
     * @return 用户信息页资源路径
     */
    @RequestMapping("/user")
    public String toUserPage(){
        return "views/userInfo";
    }


    /**
     * 请求 /user/getAllUser 资源， 配合Lay_ui数据表格显示数据
     * @return Lay_ui能识别的Json格式字符串
     */
    @ResponseBody
    @RequestMapping("/user/getAllUser")
    public JsonRes getAllUser(){
        return userService.getAllUser();
    }
}
