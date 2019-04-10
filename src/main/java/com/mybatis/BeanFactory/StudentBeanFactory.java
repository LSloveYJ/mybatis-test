package com.mybatis.BeanFactory;

import com.mybatis.bean.Student;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

/**
 * Created by slovej on 2019/4/9.
 */
public class StudentBeanFactory extends DefaultObjectFactory {

    @Override
    public Object create(Class type) {

        if (type == Student.class) {
            Student student = (Student) super.create(type);
            student.setCity("中国");
            return student;
        }
        return super.create(type);
    }
}
