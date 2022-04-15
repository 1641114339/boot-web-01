package com.zhp.bootweb01.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("t_emp")

public class Emp  {
    @TableId
    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;

}
