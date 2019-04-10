package com.mybatis.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * Created by slovej on 2019/4/9.
 */
@Intercepts(
        @Signature(
                type = Executor.class, method = "query",
                args = {MappedStatement.class,
                        Object.class,
                        RowBounds.class,
                        ResultHandler.class}
        )
)
public class MyInterceptor implements Interceptor {
    /**
     * 拦截执行
     *
     * @param invocation
     * @return
     * @throws Throwable
     */
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("拦截前执行");
        Object proceed = invocation.proceed();
        System.out.println("拦截后执行");
        return proceed;
    }

    /**
     * 判断是否代理
     *
     * @param o
     * @return
     */
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    public void setProperties(Properties properties) {

    }
}
