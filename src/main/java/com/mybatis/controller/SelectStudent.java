package com.mybatis.controller;

import com.mybatis.bean.Student;
import com.mybatis.dao.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author : liushuai10
 * @Description :
 * @Date : 2019/4/8
 */
public class SelectStudent {

    public static void main(String[] args) {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> list = mapper.getList();
            List<Student> list2 = mapper.getList();
            List<Student> list3 = mapper.getList();
            if (list != null) {
                System.out.println(list);
            }
            if (list2 != null) {
                System.out.println(list2);
            }
            if (list3 != null) {
                System.out.println(list3);
            }
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
