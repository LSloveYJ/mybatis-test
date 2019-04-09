package com.mybatis.common;

/**
 * @Author : liushuai10
 * @Description :
 * @Date : 2019/4/9
 */
public enum StudentEnum {

    GOOD("优等生", 90);


    private String name;

    private int ordinal;


    StudentEnum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }
}
