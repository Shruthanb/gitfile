package com.xworkz.facebookapp.service;

import com.xworkz.facebookapp.dto.FacebookDto;

public class FacebookSeva {
     public FacebookDto ref;
    public boolean registerUser(FacebookDto dto){
        boolean isRegistered = false;
        boolean isValid = validateUser(dto);

        if(isValid == true){
            isRegistered = true;
            System.out.println("Facebook Registration Successful");
            ref=dto;
        }
        else{
            System.out.println("Facebook Registration Failed");
        }

        return isRegistered;
    }

    public boolean validateUser(FacebookDto dto){
        boolean isValidUser = false;

        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isMobileOrEmail = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;
        boolean isBirthDate = false;
        boolean isGender = false;

        if(dto.getFirstName() != null && !dto.getFirstName().isEmpty()){
            isFirstName = true;
        }
        else System.out.println("Invalid First Name");

        if(dto.getLastName() != null && !dto.getLastName().isEmpty()){
            isLastName = true;
        }
        else System.out.println("Invalid Last Name");

        if(dto.getMobileOrEmail() != null && !dto.getMobileOrEmail().isEmpty()){
            isMobileOrEmail = true;
        }
        else System.out.println("Invalid Mobile or Email");

        if(dto.getNewPassword() != null && !dto.getNewPassword().isEmpty()){
            isPassword = true;
        }
        else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getNewPassword())){
            isConfirmPassword = true;
        }
        else System.out.println("Confirm Password doesn't match");

        if(dto.getBirthDate() != null && !dto.getBirthDate().isEmpty()){
            isBirthDate = true;
        }
        else System.out.println("Invalid Birth Date");

        if(dto.getGender() != null && !dto.getGender().isEmpty()){
            isGender = true;
        }
        else System.out.println("Invalid Gender");

        if(isFirstName && isLastName && isMobileOrEmail && isPassword && isConfirmPassword && isBirthDate && isGender){
            isValidUser = true;
        }

        return isValidUser;
    }
    public void userDetails(){
        System.out.println(" the fullname  is="+ref.getFirstName());
        System.out.println(" the  last name is="+ref.getLastName());
        System.out.println(" the mobile is="+ref.getMobileOrEmail());
        System.out.println(" the password is="+ref.getNewPassword());
        System.out.println(" the confirm password is="+ref.getConfirmPassword());
        System.out.println(" the date of birth is="+ref.getBirthDate());
        System.out.println(" the gender is="+ref.getGender());
    }
}
