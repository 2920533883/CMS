package com.itzhang.controller;

import com.itzhang.bean.Emp;
import com.itzhang.service.ChangeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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
    ChangeItemService changeItemService;

    @RequestMapping("/changePassPage")
    public String changPassController(){
        return "views/changePass";
    }

    @RequestMapping("/changeInfoPage")
    public String changeInfoController(Model model, HttpSession session){
        return "views/changeInfo";
    }

    @PostMapping("/changePass")
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public String changePass(String username, String newPass, String oldPass, Model model){
        String pass = changeItemService.checkPassword(username);
        if (Objects.equals(pass, oldPass)){
            changeItemService.changePassword(username, newPass);
            model.addAttribute("msg", "修改完成,请重新登陆");
            return "login";
        }
        else {
            model.addAttribute("msg", "修改错误，请检查输入");
            return "views/changePass";
        }
    }
    @RequestMapping("/changeInfo")
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public String changeInfo(String username, String realName, String img, int id, HttpSession session){
        changeItemService.updateInfo(username, realName, img, id);
        Emp userInfo = changeItemService.getUserInfo(id);
        session.setAttribute("user", userInfo);
        return "redirect:/views/changeInfoPage";
    }

}
