package com.xworkz.amazonapp.dto;

public class AmazonDto {
    private String userName;
    private String mobileNumberOrEmail;
    private String createPassword;
    private String retypePassword;
    private String address;
    private String country;
    private String otp;

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

    public void setCreatePassword(String createPassword){
        this.createPassword = createPassword;
    }
    public String getCreatePassword(){
        return createPassword;
    }

    public void setRetypePassword(String retypePassword){
        this.retypePassword = retypePassword;
    }
    public String getRetypePassword(){
        return retypePassword;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

    public void setOtp(String otp){
        this.otp = otp;
    }
    public String getOtp(){
        return otp;
    }
}
