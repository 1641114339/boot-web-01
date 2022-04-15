package com.zhp.bootweb01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {
    @GetMapping("/goto")
    public String toGet(HttpServletRequest request){
        request.setAttribute("msg","goto success");
        return "forward:/success";

    }
    @ResponseBody
    @GetMapping("/success")
    public Map toSuccess(@RequestAttribute("msg") String msg,
                         HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        Object msg1 = request.getAttribute("msg");
        map.put("req_msg",msg1);
        map.put("at_msg",msg);
        return map;

    }
}
