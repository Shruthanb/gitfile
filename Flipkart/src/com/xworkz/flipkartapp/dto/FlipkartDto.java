package com.xworkz.flipkartapp.dto;

public class FlipkartDto {
    private String fullName;
    private String mobileNumber;
    private String emailId;
    private String password;
    private String confirmPassword;
    private String deliveryAddress;
    private String pinCode;
    private String otp;

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    public String getEmailId(){
        return emailId;
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

    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }
    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    }
    public String getPinCode(){
        return pinCode;
    }

    public void setOtp(String otp){
        this.otp = otp;
    }
    public String getOtp(){
        return otp;
    }
}
