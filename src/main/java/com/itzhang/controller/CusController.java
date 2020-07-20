package com.itzhang.controller;

import com.itzhang.bean.Cus;
import com.itzhang.bean.CusSearch;
import com.itzhang.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: CMS
 * @description: 客户管理类
 * @author: zhang rui feng
 * @create: 2020-07-18 17:30
 */
@Controller
@RequestMapping("/views")
public class CusController {
    @Autowired
    private CusService cusService;
    @RequestMapping("/mcus")
    public String mcusController(Model model){
        List<Cus> allCus = cusService.getAllCus();
        model.addAttribute("cuss", allCus);
        return "views/mcus";
    }
    @RequestMapping("/searchCus")
    public String searchCus(CusSearch cusSearch, Model model){
        List<Cus> cuss = cusService.searchCuss(cusSearch);
        model.addAttribute("cuss", cuss);
        return "views/mcus";
    }

    @RequestMapping("/insertCus")
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public String insertCus(Cus cus){
        cusService.insertCus(cus);
        return "redirect:/views/mcus";
    }

    @RequestMapping("/updateCus")
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public String updateCus(Cus cus){
        cusService.updateCus(cus);
        return "redirect:/views/mcus";
    }

    @RequestMapping("/deleteCus")
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public String deleteCus(int id){
        cusService.deleteCus(id);
        return "redirect:/views/mcus";
    }
}
