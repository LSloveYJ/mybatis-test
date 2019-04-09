package com.mybatis.dao;

import com.mybatis.bean.Student;

import java.util.List;

/**
 * @Author : liushuai10
 * @Description :
 * @Date : 2019/4/8
 */
public interface StudentMapper {

    List<Student> getList();

    int insert(Student student);

}
