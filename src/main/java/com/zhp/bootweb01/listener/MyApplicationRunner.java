package com.zhp.bootweb01.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("跑起来了");
    }
}
