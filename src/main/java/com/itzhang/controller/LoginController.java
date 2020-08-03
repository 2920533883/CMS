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

/**
 * 登录、注册、注销控制类
 */
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    /**
     * 通过 /, /login 跳转到登陆页面
     * @return 登陆页面资源路径
     */
    @RequestMapping({"/", "/login"})
    public String toLoginPage(){
        return "login";
    }

    /**
     * 通过 /register 跳转到注册页面
     * @return 注册页面资源路径
     */
    @RequestMapping("/register")
    public String toRegisterPage(){
        return "register";
    }

    /**
     * 注册页面点击提交按钮，调用该方法，通过model传参方式提示用户是否注册成功
     * @param name 姓名
     * @param password 密码
     * @param phone 电话号(账号)
     * @param authentication 认证码
     * @param model 模型
     * @return 注册成功：登录页面资源路径  注册失败：注册页面资源路径
     */
    @PostMapping("/doRegister")
    public String doRegister(String name, String password, String phone, String authentication, Model model){
        if ("houjie".equals(authentication)) {
            loginService.doRegister(new Manager(null, name, phone, password, phone));
            model.addAttribute("msg", "注册成功");
            return "login";
        }
        else {
            model.addAttribute("msg", "注册失败");
            return "register";
        }
    }

    /**
     * 登陆页面点击登录按钮，调用该方法，通过model传参方式提示用户是否登录成功
     * @param phone 电话号
     * @param password 密码
     * @param model 模型
     * @return 登陆成功：重定向访问 /manager 资源；登陆失败：登陆页面资源路径
     */
    @PostMapping("/doLogin")
    public String doLogin(String phone, String password, Model model){
        try{
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

    /**
     * 在后台管理系统点击退出，调用该方法
     * @return 重定向访问 /login 资源
     */
    @RequestMapping("doLogout")
    public String doLogout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";
    }
}
