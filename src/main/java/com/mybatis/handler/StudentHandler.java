package com.mybatis.handler;

import com.mybatis.common.StudentEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author : liushuai10
 * @Description :
 * @Date : 2019/4/9
 */
public class StudentHandler implements TypeHandler<StudentEnum> {


    public void setParameter(PreparedStatement ps, int i, StudentEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, parameter.getOrdinal());
    }

    public StudentEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return (StudentEnum) rs.getObject(columnName);

    }

    public StudentEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return (StudentEnum) rs.getObject(columnIndex);
    }

    public StudentEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return (StudentEnum) cs.getObject(columnIndex);
    }
}
