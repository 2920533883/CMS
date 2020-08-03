package com.itzhang.controller;

import com.itzhang.pojo.Message;
import com.itzhang.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 留言板控制类
 */
@Controller
public class MessageBoardController {

    @Autowired
    MessageBoardService messageBoardService;

    @RequestMapping("/messageBoard")
    public String goMessageBoardPage(Model model){
        List<Message> allMessage = messageBoardService.getAllMessage();
        model.addAttribute("messages", allMessage);
        return "views/messageBoard";
    }

    @RequestMapping("/messageBoard/confirmMessage")
    public String confirmMessage(Integer id){
        messageBoardService.confirmMessage(id);
        return "redirect:/messageBoard";
    }
}
