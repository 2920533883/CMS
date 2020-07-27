package com.itzhang.controller;

import com.itzhang.pojo.JsonRes;
import com.itzhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String toUserPage(){
        return "views/userInfo";
    }
    @ResponseBody
    @RequestMapping("/user/getAllUser")
    public JsonRes getAllUser(){
        return userService.getAllUser();
    }
}
