package com.mybatis.bean;

import com.mybatis.common.StudentEnum;
import lombok.Data;

import java.util.List;

/**
 * @Author : liushuai10
 * @Description :
 * @Date : 2019/4/8
 */
@Data
public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private boolean status;

    private String schoolNo;

    private List<Course> courses;

    private StudentEnum level;

    private String city;

}
