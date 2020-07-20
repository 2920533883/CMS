package com.itzhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: CMS
 * @description: 退出控制类
 * @author: zhang rui feng
 * @create: 2020-07-19 19:20
 */
@Controller
public class LogoutController {
    @RequestMapping("/logout")
    public String logoutController(HttpSession session, Model model){
        session.removeAttribute("user");
        model.addAttribute("msg", "已退出");
        return "login";
    }
}
