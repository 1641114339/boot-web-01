package com.zhp.bootweb01.controller;

import com.zhp.bootweb01.bean.Emp;
import com.zhp.bootweb01.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@Controller
public class FormController {
    @Autowired
    EmpService empService;
    @GetMapping("/form_layouts")
    public String toform(){
        return "/form/form_layouts";
    }
    @ResponseBody
    @PostMapping("/toCount")
    public Emp toCount(){
        return empService.getEmp(1);
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("photo") MultipartFile[] photos) throws IOException {

    log.info("上传的信息： "+email+"__"+photos.length+"__"+photos[0].getSize());
    if(photos.length>0){
        for (MultipartFile photo : photos) {
            if(!photo.isEmpty()){
                String originalFilename = photo.getOriginalFilename();
                photo.transferTo(new File("E:\\cache\\"+originalFilename));
            }
        }
    }
    return "main";
    }
}
