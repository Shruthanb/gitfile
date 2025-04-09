package com.xworkz.amazonapp.service;

import com.xworkz.amazonapp.dto.AmazonDto;

public class AmazonSeva {
     public AmazonDto ref;
    public boolean processRegistration(AmazonDto dto){
        boolean isRegistered = false;
        boolean detailsValid = checkDetails(dto);

        if(detailsValid == true){
            isRegistered = true;
            System.out.println("Amazon Registration Successful");
            ref=dto;
        }
        else{
            System.out.println("Amazon Registration Failed");
        }

        return isRegistered;
    }

    public boolean checkDetails(AmazonDto dto){
        boolean isValid = false;

        boolean isUserName = false;
        boolean isMobileOrEmail = false;
        boolean isPassword = false;
        boolean isRetypePassword = false;
        boolean isAddress = false;
        boolean isCountry = false;
        boolean isOtp = false;

        if(dto.getUserName() != null && !dto.getUserName().isEmpty()){
            isUserName = true;
        }
        else System.out.println("Invalid User Name");

        if(dto.getMobileNumberOrEmail() != null && !dto.getMobileNumberOrEmail().isEmpty()){
            isMobileOrEmail = true;
        }
        else System.out.println("Invalid Mobile or Email");

        if(dto.getCreatePassword() != null && !dto.getCreatePassword().isEmpty()){
            isPassword = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getRetypePassword() != null && dto.getRetypePassword().equals(dto.getCreatePassword())){
            isRetypePassword = true;
        }
        else System.out.println("Password does not match");

        if(dto.getAddress() != null && !dto.getAddress().isEmpty()){
            isAddress = true;
        }
        else System.out.println("Invalid Address");

        if(dto.getCountry() != null && !dto.getCountry().isEmpty()){
            isCountry = true;
        }
        else System.out.println("Invalid Country");

        if(dto.getOtp() != null && !dto.getOtp().isEmpty()){
            isOtp = true;
        }
        else System.out.println("Invalid OTP");

        if(isUserName && isMobileOrEmail && isPassword && isRetypePassword && isAddress && isCountry && isOtp){
            isValid = true;
        }

        return isValid;
    }
    public void userDetails(){

        System.out.println(" the user name is="+ref.getUserName());
        System.out.println(" the mobile is="+ref.getMobileNumberOrEmail());
        System.out.println(" the password is="+ref.getCreatePassword());
        System.out.println(" the confirm password is="+ref.getRetypePassword());
        System.out.println(" the address is="+ref.getAddress());
        System.out.println(" the country is="+ref.getCountry());
        System.out.println(" the otp is= "+ref.getOtp());
    }
}
