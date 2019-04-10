package com.mybatis.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by slovej on 2019/4/10.
 * 通知类
 */
public class Invocate implements InvocationHandler {

    private BaseService bs;

    public Invocate(BaseService bs) {
        this.bs = bs;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj;
        if ("eat".equals(method.getName())) {
            wash();
            obj = method.invoke(bs, args);
        } else {
            obj = method.invoke(bs, args);
            wash();
        }
        return obj;
    }


    public void wash() {
        System.out.println("洗手");
    }

}
