package com.lancq.mongo.morphia.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/5
 **/
public class Member {
    @Id
    private ObjectId id;
    private String name;
    private int age;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
