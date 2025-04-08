package com.xworkz.facebookapp.dto;

public class FacebookDto {
    private String firstName;
    private String lastName;
    private String mobileOrEmail;
    private String newPassword;
    private String confirmPassword;
    private String birthDate;
    private String gender;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setMobileOrEmail(String mobileOrEmail){
        this.mobileOrEmail = mobileOrEmail;
    }
    public String getMobileOrEmail(){
        return mobileOrEmail;
    }

    public void setNewPassword(String newPassword){
        this.newPassword = newPassword;
    }
    public String getNewPassword(){
        return newPassword;
    }

    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public String getBirthDate(){
        return birthDate;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
}
