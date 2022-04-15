package com.zhp.bootweb01.controller;

import com.zhp.bootweb01.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ArgController {
    @ResponseBody
    @GetMapping("/testperson")
    public Person gePerson(Person person){
        person.setAge(14);
        person.setUserName("xiaozhang");
        return person;
    }



}
