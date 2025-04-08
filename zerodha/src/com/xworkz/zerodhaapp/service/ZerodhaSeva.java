package com.xworkz.zerodhaapp.service;

import com.xworkz.zerodhaapp.dto.ZerodhaDto;

public class ZerodhaSeva {
    public boolean openAccount(ZerodhaDto dto){
        boolean isRegistered = false;
        boolean isValid = checkDetails(dto);

        if(isValid == true){
            isRegistered = true;
            System.out.println("Zerodha Account Registration Successful");
        }
        else{
            System.out.println("Zerodha Account Registration Failed");
        }

        return isRegistered;
    }

    public boolean checkDetails(ZerodhaDto dto){
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPan = false;
        boolean isAadhar = false;
        boolean isDob = false;
        boolean isLoginId = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isName = true;
        }
        else System.out.println("Invalid Name");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()){
            isMobile = true;
        }
        else System.out.println("Invalid Mobile Number");

        if(dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isEmail = true;
        }
        else System.out.println("Invalid Email");

        if(dto.getPanCard() != null && !dto.getPanCard().isEmpty()){
            isPan = true;
        }
        else System.out.println("Invalid PAN");

        if(dto.getAadharCard() != null && !dto.getAadharCard().isEmpty()){
            isAadhar = true;
        }
        else System.out.println("Invalid Aadhar");

        if(dto.getDob() != null && !dto.getDob().isEmpty()){
            isDob = true;
        }
        else System.out.println("Invalid DOB");

        if(dto.getLoginId() != null && !dto.getLoginId().isEmpty()){
            isLoginId = true;
        }
        else System.out.println("Invalid Login ID");

        if(dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPassword = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())){
            isConfirmPassword = true;
        }
        else System.out.println("Passwords Do Not Match");

        if(isName && isMobile && isEmail && isPan && isAadhar && isDob && isLoginId && isPassword && isConfirmPassword){
            isValid = true;
        }

        return isValid;
    }
}
