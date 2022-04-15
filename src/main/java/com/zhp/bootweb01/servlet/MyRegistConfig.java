package com.zhp.bootweb01.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//true单实例
@Configuration(proxyBeanMethods = true)
public class MyRegistConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean(myServlet,"/my");
    }
    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter = new MyFilter();
        return new FilterRegistrationBean(myFilter,myServlet());
    }
    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyContextListener myContextListener = new MyContextListener();
        return new ServletListenerRegistrationBean(myContextListener);

    }

}
