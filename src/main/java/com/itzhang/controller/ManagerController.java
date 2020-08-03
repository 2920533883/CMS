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

/**
 * 员工控制类
 */
@Controller
public class ManagerController {
    @Autowired
    ManagerService managerService;

    /**
     * /manager 跳转到员工列表页
     * @return 员工列表的资源路径
     */
    @RequestMapping("/manager")
    public String goManagerPage(){
        return "views/managerInfo";
    }

    /**
     * 访问 /manager/getAllManager 返回json数据，结合Lay_ui数据表格显示数据
     * @return 能被Lay_ui识别的json格式数据
     */
    @ResponseBody
    @RequestMapping("/manager/getAllManager")
    public JsonRes getAllManager(){
        return managerService.getAllManager();
    }
}
