package com.itzhang.controller;


import com.itzhang.pojo.Manager;
import com.itzhang.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping({"/", "/login"})
    public String toLoginPage(){
        return "/login";
    }

    @RequestMapping("/register")
    public String toRegisterPage(){
        return "/register";
    }

    @PostMapping("/doRegister")
    public String doRegister(String name, String password, String phone, String authentication, Model model){
        if ("houjie".equals(authentication)) {
            loginService.doRegister(new Manager(null, name, phone, password, phone));
            model.addAttribute("msg", "注册成功");
            return "/login";
        }
        else {
            model.addAttribute("msg", "注册失败");
            return "/register";
        }
    }
    @PostMapping("/doLogin")
    public String doLogin(String phone, String password, Model model){
        try{
            System.out.println(phone + password);
            loginService.doLogin(phone, password);
            model.addAttribute("msg", "登陆成功");
            return "redirect:/manager";
        } catch (UnknownAccountException e){
            model.addAttribute("msg", "手机号错误");
            return "login";
        } catch (IncorrectCredentialsException e){
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }


    @RequestMapping("doLogout")
    public String doLogout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";
    }
}
