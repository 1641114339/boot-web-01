package com.zhp.bootweb01.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhp.bootweb01.bean.Emp;
import com.zhp.bootweb01.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TableController {
    @Autowired
    EmpService empService;
    @GetMapping("/basic_table")
    public  String basictable(){
        return "/table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public  String dynamictable(@RequestParam(value = "pn",defaultValue ="1")Integer pn, Model model){
//        List<User> users = asList(new User("123", "adadr"),
//                new User("12233", "adawedr"),
//                new User("1423", "adadsdr"),
//                new User("11223", "adaqqdr"));

//        List<Emp> list = empService.list();
        Page<Emp> empPage = new Page<>(pn,2);
        Page<Emp> page = empService.page(empPage, null);
        model.addAttribute("pages",page);
        return "/table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public  String edittable(){
        return "/table/editable_table";
    }

    @GetMapping("/pricing_table")
    public  String pricingtable(){
        return "/table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public  String responsivetable(){
        return "/table/responsive_table";
    }

}
