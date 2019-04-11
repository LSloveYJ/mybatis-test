package com.mybatis.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by slovej on 2019/4/10.
 * 代理工厂
 */
public class ProxyFactory {

    public static BaseService build(Class c) throws Exception {

        BaseService bs = (BaseService) c.newInstance();

        Invocate invocate = new Invocate(bs);

        return (BaseService) Proxy.newProxyInstance(bs.getClass().getClassLoader(), bs.getClass().getInterfaces(), invocate);
    }
}
