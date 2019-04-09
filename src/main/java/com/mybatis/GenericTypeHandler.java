package com.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author : liushuai10
 * @Description :
 * @Date : 2019/4/8
 */
public class GenericTypeHandler<E extends Object> extends BaseTypeHandler<E> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {
        if (e instanceof Boolean) {
            if ((Boolean) e) {
                preparedStatement.setInt(i, 1);
            } else {
                preparedStatement.setInt(i, 0);
            }
        }
    }

    @Override
    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
