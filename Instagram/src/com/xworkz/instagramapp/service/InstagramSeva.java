package com.xworkz.instagramapp.service;

import com.xworkz.instagramapp.dto.InstagramDto;

public class InstagramSeva {

    public boolean registerUser(InstagramDto dto){
        boolean isUserRegistered = false;
        boolean isUserValid = validateUser(dto);

        if(isUserValid == true){
            isUserRegistered = true;
            System.out.println("Registration Successful");
        }
        else{
            System.out.println("Registration Failed");
        }
        return isUserRegistered;
    }

    public boolean validateUser(InstagramDto dto){
        boolean isValidUser = false;

        boolean isFullName = false;
        boolean isUserName = false;
        boolean isMobileOrEmail = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;
        boolean isDateOfBirth = false;
        boolean isGender = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isFullName = true;
        }
        else System.out.println("Invalid Full Name");

        if(dto.getUserName() != null && !dto.getUserName().isEmpty()){
            isUserName = true;
        }
        else System.out.println("Invalid Username");

        if(dto.getMobileNumberOrEmail() != null && !dto.getMobileNumberOrEmail().isEmpty()){
            isMobileOrEmail = true;
        }
        else System.out.println("Invalid Mobile or Email");

        if(dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPassword = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())){
            isConfirmPassword = true;
        }
        else System.out.println("Confirm Password must match Password");

        if(dto.getDateOfBirth() != null && !dto.getDateOfBirth().isEmpty()){
            isDateOfBirth = true;
        }
        else System.out.println("Invalid Date of Birth");

        if(dto.getGender() != null && !dto.getGender().isEmpty()){
            isGender = true;
        }
        else System.out.println("Invalid Gender");

        if(isFullName && isUserName && isMobileOrEmail && isPassword && isConfirmPassword && isDateOfBirth && isGender){
            isValidUser = true;
        }

        return isValidUser;
    }
}
