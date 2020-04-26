package com.zhouyq.spring.ba02;

/**
 * @Description TODO
 * @Date 2020/4/26 21:39
 * @Author zhouyq
 */
public class School {
    private String name;
    private String address;

    public School setName(String name) {
        this.name = name;
        return this;
    }

    public School setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
