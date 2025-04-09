package com.xworkz.meeshoapp.dto;

import com.xworkz.meeshoapp.constant.Gender;

public class Meeshodto {

    private int id;
    private String name;
    private  String password;
    private  long phonenumber;
    private Gender gender;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }
}
