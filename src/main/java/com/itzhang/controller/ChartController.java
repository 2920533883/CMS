package com.itzhang.controller;

import com.itzhang.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @program: CMS
 * @description: 图表控制类
 * @author: zhang rui feng
 * @create: 2020-07-20 10:37
 */
@Controller
@RequestMapping("/views")
public class ChartController {

    @Autowired
    ChartService chartService;
    @RequestMapping("/chart")
    public String chartPageController(Model model){
        int manNum = chartService.getManNum();
        int womanNum = chartService.getWomanNum();
        ArrayList<Integer> sex = new ArrayList<>();
        sex.add(manNum);
        sex.add(womanNum);
        model.addAttribute("sex", sex);
        return "views/chart";
    }
}
