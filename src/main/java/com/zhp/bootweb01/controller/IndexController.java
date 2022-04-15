package com.zhp.bootweb01.controller;

import com.zhp.bootweb01.bean.User;
import com.zhp.bootweb01.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    EmpService empService;
//    @ResponseBody
//    @GetMapping("/emp")
//    public Emp getEmp(@RequestParam("eid") Integer eid){
//        return empService.getEmp(eid);
//    }
//    @ResponseBody
//    @GetMapping("/empage")
//    public Emp getByAge(@RequestParam("age") Integer age){
//        return empService.getByAge(age);
//    }
//    @ResponseBody
//    @GetMapping("/sql")
//    public String queryDb(){
//        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_emp ", Long.class);
//        return aLong.toString();
//    }
    @GetMapping("/")
    public String toIndex(){
        return "login";
    }

    @PostMapping("/login")
    public String toLogin(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUsername())&&"123456".equals(user.getPassword())){
            session.setAttribute("loginuser",user);
            return "redirect:/main";
        }else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }

//        重定向到请求localhost8080/main,下面的get请求处理器处理该请求，跳转到main页面，注意template模板里面的文件是不能直接请求访问的，要通过controller中的方法跳转
    }

    @GetMapping("/main")
    public String login(HttpSession session,Model model){
//        Object loginuser = session.getAttribute("loginuser");
//        if(loginuser!=null){
//            return "main";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
        return "main";
    }
}
