package com.zhp.bootweb01.controller;

import com.zhp.bootweb01.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Value("${person.name:hi}")
    public String name;
    @GetMapping("/profile")
    public String testprofile(){
        return name;
    }
    @RequestMapping("/心甘情愿.jpg")
    public String hello(){
        return "haha";
    }

    @GetMapping("/user")
    public String getUser(){
        return "GET-张三";
    }

    @PostMapping("/user")
    public String saveUser(){
        return "POST-张三";
    }

    @PutMapping("/user")
    public String putUser(){
        return "PUT-张三";
    }

    @DeleteMapping("/user")
    public String deleteUser(){
        return "DELETE-张三";
    }

    @PostMapping("/person1")
    public Person getPerson(Person person){
        return person;
    }

}
