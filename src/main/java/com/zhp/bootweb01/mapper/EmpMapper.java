package com.zhp.bootweb01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhp.bootweb01.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {
    public Emp getEmp(Integer eid);
//
//    @Select("select * from t_emp where age=#{age}")
//    public Emp getByAge(Integer age);

}
