package com.mybatis.controller;

import com.mybatis.bean.Student;
import com.mybatis.common.StudentEnum;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author : liushuai10
 * @Description :
 * @Date : 2019/4/8
 */
public class InsertStudent {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("小明");
        student.setAge(15);
        student.setStatus(true);
        student.setSchoolNo("500");
        student.setLevel(StudentEnum.GOOD);
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession sqlSession = sqlSessionFactory.openSession();
            sqlSession.insert("insert", student);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
