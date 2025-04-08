package com.xworkz.passport.passport;

import com.xworkz.passport.constants.Cpvlocation;
import com.xworkz.passport.constants.Dcd;

public class PassportDto {

    private Cpvlocation cpvlocation;
     private Dcd dcd;
    private String givenname;
    private String surename;
    private String dob;
    private String email;
    private  boolean Emailissame;
    private String loginid;
    private String password;
    private String hintques;
    private String hintans;
    private String captcha;


    public void setCpvlocation(Cpvlocation cpvlocation) {
        this.cpvlocation = cpvlocation;
    }

    public Cpvlocation getCpvlocation() {
        return cpvlocation;
    }

    public void setDcd(Dcd dcd) {
        this.dcd = dcd;
    }

    public Dcd getDcd() {
        return dcd;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getSurename() {
        return surename;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmailissame(boolean emailissame) {
        Emailissame = emailissame;
    }
    public Boolean getEmailissame(){
        return Emailissame;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setHintques(String hintques) {
        this.hintques = hintques;
    }

    public String getHintques() {
        return hintques;
    }

    public void setHintans(String hintans) {
        this.hintans = hintans;
    }

    public String getHintans() {
        return hintans;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
