package com.xworkz.amazonapp.service;

import com.xworkz.amazonapp.dto.AmazonDto;

public class AmazonSeva {
    public boolean processRegistration(AmazonDto dto){
        boolean isRegistered = false;
        boolean detailsValid = checkDetails(dto);

        if(detailsValid == true){
            isRegistered = true;
            System.out.println("Amazon Registration Successful");
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
}
