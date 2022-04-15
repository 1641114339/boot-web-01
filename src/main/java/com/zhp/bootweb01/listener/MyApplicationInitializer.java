package com.zhp.bootweb01.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("我是初始化");
        System.out.println("我是初始化2");
        System.out.println("我是初始化3");
        System.out.println("我是初始化4");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("ssh push");
    }
}
