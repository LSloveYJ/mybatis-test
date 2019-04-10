package com.mybatis.proxy;

/**
 * Created by slovej on 2019/4/10.
 */
public class Test {

    public static void main(String[] args) throws Exception {

        BaseService build = ProxyFactory.build(Person.class);
//        build.eat();
        build.wc();

    }
}
