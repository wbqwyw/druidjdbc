package com.wbq.druid.entity;

import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author Administrator
 * @Date 2020/12/10 16:27
 * @Version 1.0
 */
public class User {
    private int id;
    private String usercode;
    private String username;
    private int age;
    private Date borndate;
    private String address;

    public User() {
    }

    public User(int id, String usercode, String username, int age, Date borndate, String address) {
        this.id = id;
        this.usercode = usercode;
        this.username = username;
        this.age = age;
        this.borndate = borndate;
        this.address = address;
    }

    public User(String usercode, String username, int age, Date borndate, String address) {
        this.usercode = usercode;
        this.username = username;
        this.age = age;
        this.borndate = borndate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usercode='" + usercode + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", borndate=" + borndate +
                ", address='" + address + '\'' +
                '}';
    }
}
