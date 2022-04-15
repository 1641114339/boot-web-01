package com.zhp.bootweb01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhp.bootweb01.bean.Emp;
import com.zhp.bootweb01.mapper.EmpMapper;
import com.zhp.bootweb01.service.EmpService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper,Emp> implements EmpService {
    @Autowired
    EmpMapper empMapper;

    Counter counter;
    public EmpServiceImpl(MeterRegistry meterRegistry){
        counter = meterRegistry.counter("计数器");

    }
    public Emp getEmp(Integer eid) {
        counter.increment();
        return empMapper.getEmp(eid);
    }
//
//    public Emp getByAge(Integer age) {
//        return empMapper.getByAge(age);
//    }

}