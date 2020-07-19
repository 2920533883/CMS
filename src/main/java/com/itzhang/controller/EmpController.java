package com.itzhang.controller;

import com.itzhang.bean.Emp;
import com.itzhang.bean.EmpSearch;
import com.itzhang.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: CMS
 * @description: 管理员工Controller
 * @author: zhang rui feng
 * @create: 2020-07-18 09:12
 */
@Controller
@RequestMapping("/views")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/memp")
    public String mempControll(Model model){
        List<Emp> allEmp = empService.getAllEmp();
        model.addAttribute("emps", allEmp);
        return "views/memp";
    }
    @RequestMapping("/searchEmp")
    public String searchEmp(Model model, EmpSearch empSearch){
        List<Emp> emps = empService.searchEmps(empSearch);
        model.addAttribute("emps", emps);
        return "views/memp";
    }
    @RequestMapping("/changeEmp")
    public String changEmp(Emp emp){
        empService.updateEmp(emp);
        return "redirect:/views/memp";
    }
    @RequestMapping("/deleteEmp")
    public String deleteEmp(int id){
        empService.deleteEmp(id);
        return "redirect:/views/memp";
    }
    @RequestMapping("/insertEmp")
    public String insertEmp(Emp emp){
        empService.insertEmp(emp);
        return "redirect:/views/memp";
    }
}
