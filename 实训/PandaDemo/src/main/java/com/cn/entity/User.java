package com.cn.entity;
/*
用户实体类
 */

public class User {
    private int id;
    private String usrename;
    private String password;
    private String realname = "";
    private String phone = "";
    private String idcard = "";
    private int gender = 0;
    private int role = 0;

    public User() {
    }

    public User(int id, String usrename, String password, String realname, String phone, String idcard, int gender, int role) {
        this.id = id;
        this.usrename = usrename;
        this.password = password;
        this.realname = realname;
        this.phone = phone;
        this.idcard = idcard;
        this.gender = gender;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usrename='" + usrename + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", phone='" + phone + '\'' +
                ", idcard='" + idcard + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsrename() {
        return usrename;
    }

    public void setUsrename(String usrename) {
        this.usrename = usrename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
