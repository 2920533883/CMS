package com.itzhang.controller;

import com.itzhang.service.ChangeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Objects;

/**
 * @program: CMS
 * @description: 更改密码控制类
 * @author: zhang rui feng
 * @create: 2020-07-19 15:06
 */
@Controller
@RequestMapping("/views")
public class ChangeItemController {
    @Autowired
    ChangeItemService changePassService;
    @RequestMapping("/changePassPage")
    public String changPassController(){
        return "views/changePass";
    }
    @PostMapping("/changePass")
    public String changePass(String username, String newPass, String oldPass, Model model){
        String pass = changePassService.checkPassword(username);
        if (Objects.equals(pass, oldPass)){
            changePassService.changePassword(username, newPass);
            model.addAttribute("msg", "修改完成,请重新登陆");
            return "login";
        }
        else {
            model.addAttribute("msg", "修改错误，请检查输入");
            return "views/changePass";
        }
    }

}
