package com.zhp.bootweb01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
@MapperScan("com.zhp.bootweb01.mapper")
@ServletComponentScan(basePackages = "com.zhp.bootweb01")
@SpringBootApplication(exclude = RedisAutoConfiguration.class)
public class BootWeb01Application {

    public static void main(String[] args) {
        SpringApplication.run(BootWeb01Application.class, args);
    }

}
