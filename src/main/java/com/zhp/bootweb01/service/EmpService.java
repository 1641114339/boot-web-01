package com.zhp.bootweb01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhp.bootweb01.bean.Emp;
import org.springframework.stereotype.Service;

public interface EmpService extends IService<Emp> {
    public Emp getEmp(Integer eid);
//    public Emp getByAge(Integer age);
}
