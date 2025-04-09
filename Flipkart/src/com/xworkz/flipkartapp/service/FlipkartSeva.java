package com.xworkz.flipkartapp.service;

import com.xworkz.flipkartapp.dto.FlipkartDto;

public class FlipkartSeva {
    public FlipkartDto ref;
    public boolean beginRegistration(FlipkartDto dto){
        boolean isRegistered = false;
        boolean isValid = validateInfo(dto);

        if(isValid == true){
            isRegistered = true;
            System.out.println("Flipkart Registration Successful");
            ref=dto;
        }
        else{
            System.out.println("Flipkart Registration Failed");
        }

        return isRegistered;
    }

    public boolean validateInfo(FlipkartDto dto){
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPass = false;
        boolean isConfirmPass = false;
        boolean isAddress = false;
        boolean isPin = false;
        boolean isOtp = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isName = true;
        }
        else System.out.println("Invalid Full Name");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()){
            isMobile = true;
        }
        else System.out.println("Invalid Mobile Number");

        if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()){
            isEmail = true;
        }
        else System.out.println("Invalid Email");

        if(dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPass = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())){
            isConfirmPass = true;
        }
        else System.out.println("Passwords do not match");

        if(dto.getDeliveryAddress() != null && !dto.getDeliveryAddress().isEmpty()){
            isAddress = true;
        }
        else System.out.println("Invalid Address");

        if(dto.getPinCode() != null && !dto.getPinCode().isEmpty()){
            isPin = true;
        }
        else System.out.println("Invalid Pin Code");

        if(dto.getOtp() != null && !dto.getOtp().isEmpty()){
            isOtp = true;
        }
        else System.out.println("Invalid OTP");

        if(isName && isMobile && isEmail && isPass && isConfirmPass && isAddress && isPin && isOtp){
            isValid = true;
        }

        return isValid;
    }
    public  void userDetails(){
        System.out.println(" the user name is="+ref.getFullName());
        System.out.println(" the mobile is="+ref.getMobileNumber());
        System.out.println(" the email is = "+ref.getEmailId());
        System.out.println(" the password is="+ref.getPassword());
        System.out.println(" the confirm password is="+ref.getConfirmPassword());
        System.out.println(" the address is="+ref.getDeliveryAddress());
        System.out.println(" the pincode  is="+ref.getPinCode());
        System.out.println(" the otp  is = "+ref.getOtp());
    }
}
