package com.zhp.bootweb01.listener;

import org.springframework.boot.CommandLineRunner;

public class MyCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("conmand跑起来了");
    }
}
