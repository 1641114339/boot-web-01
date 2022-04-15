package com.zhp.bootweb01.controller;

import com.zhp.bootweb01.service.EmpService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AtController {

    @GetMapping("/car/{id}/user/{username}/list")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("sec-ch-ua") String scu,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inter") ArrayList inters,
                                     @RequestParam Map<String,String> ageinter){
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);
//        map.put("scu",scu);
//        map.put("requestheader",header);
        map.put("age",age);
        map.put("inter",inters);
        map.put("ageinter",ageinter);

        return map;
    }
    @PostMapping("/save")
    public Map postMethod(@RequestBody String post){
        Map<String,Object> map = new HashMap<>();
        map.put("postbody",post);
        return map;
    }

    @GetMapping("/countMetrics")
    public void toCountMetrics(){

    }
}
