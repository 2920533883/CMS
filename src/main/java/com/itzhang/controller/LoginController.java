package com.itzhang.controller;

import com.itzhang.bean.Emp;
import com.itzhang.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: CMS
 * @description: 其他控制
 * @author: zhang rui feng
 * @create: 2020-07-18 22:40
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }
    @PostMapping("/login")
    public String loginCheck(String username, String password, HttpSession session, Model model){
        Emp user = loginService.loginCheck(username);
        if (user.getPassword().equals(password)){
            session.setAttribute("user", user);
            return "redirect:/views/memp";
        }
        model.addAttribute("msg","用户名密码不匹配");
        return "login";
    }
}
