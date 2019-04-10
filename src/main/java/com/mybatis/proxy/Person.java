package com.mybatis.proxy;

/**
 * Created by slovej on 2019/4/10.
 * 接口实现类
 */
public class Person implements BaseService {
    public void eat() {
        System.out.println("吃饭");
    }

    public void wc() {
        System.out.println("上厕所");
    }
}
