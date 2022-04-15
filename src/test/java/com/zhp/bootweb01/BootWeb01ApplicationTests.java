package com.zhp.bootweb01;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhp.bootweb01.bean.Emp;
import com.zhp.bootweb01.mapper.EmpMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
@EnableAutoConfiguration
class BootWeb01ApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Autowired
    EmpMapper empMapper;
    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_emp ", Long.class);
        log.info("数目"+aLong);
        log.info("class_"+dataSource.getClass());

    }
    @Test
    void empTest(){
        Emp emp = empMapper.selectById(1);
        log.info("print"+emp);
    }

}
