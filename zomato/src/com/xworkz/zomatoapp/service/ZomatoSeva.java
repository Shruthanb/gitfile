package com.xworkz.zomatoapp.service;

import com.xworkz.zomatoapp.dto.ZomatoDto;

public class ZomatoSeva {
    public ZomatoDto dto;
    public boolean performSignup(ZomatoDto dto) {
        boolean isSignupDone = false;
        boolean validated = validateSignup(dto);

        if(validated == true) {
            isSignupDone = true;
            System.out.println("Zomato Signup Completed");
            this.dto=dto;
        } else {
            System.out.println("Zomato Signup Failed");
        }

        return isSignupDone;
    }

    public boolean validateSignup(ZomatoDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPassword = false;
        boolean isRetype = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Full Name");

        if(dto.getMobile() != null && !dto.getMobile().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email Address");

        if(dto.getUserPassword() != null) {
            isPassword = true;
        } else System.out.println("Password is required");

        if(dto.getRetypePassword() != null && dto.getRetypePassword().equals(dto.getUserPassword())) {
            isRetype = true;
        } else System.out.println("Retyped Password must match");

        if(isName && isMobile && isEmail && isPassword && isRetype) {
            isValid = true;
        }

        return isValid;
    }
    public void userDetails(){
        System.out.println(" the name is="+this.dto.getFullName());
        System.out.println(" the mobile is="+this.dto.getMobile());
        System.out.println(" the email is="+this.dto.getEmail());
        System.out.println(" the password is="+this.dto.getUserPassword());
        System.out.println(" the retype is="+this.dto.getRetypePassword());
    }
}
