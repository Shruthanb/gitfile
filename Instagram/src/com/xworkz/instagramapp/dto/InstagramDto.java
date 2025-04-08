package com.xworkz.instagramapp.dto;

public class InstagramDto {
    private String fullName;
    private String userName;
    private String mobileNumberOrEmail;
    private String password;
    private String confirmPassword;
    private String dateOfBirth;
    private String gender;

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    public void setMobileNumberOrEmail(String mobileNumberOrEmail){
        this.mobileNumberOrEmail = mobileNumberOrEmail;
    }
    public String getMobileNumberOrEmail(){
        return mobileNumberOrEmail;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
}
