package com.itzhang.controller;

import com.alibaba.fastjson.JSON;
import com.itzhang.pojo.JsonRes;
import com.itzhang.pojo.Manager;
import com.itzhang.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.jar.JarEntry;

@Controller
public class ManagerController {
    @Autowired
    ManagerService managerService;


    @RequestMapping("/manager")
    public String goManagerPage(){
        return "/views/managerInfo";
    }

    @ResponseBody
    @RequestMapping("/manager/getAllManager")
    public JsonRes getAllManager(){
        List<Manager> allManager = managerService.getAllManager();
        return new JsonRes(0, "成功", allManager);
    }
}
