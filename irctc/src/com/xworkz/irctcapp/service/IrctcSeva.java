package com.xworkz.irctcapp.service;

import com.xworkz.irctcapp.dto.IrctcDto;

public class IrctcSeva {
    public IrctcDto ref;
    public boolean initiateRegistration(IrctcDto dto) {
        boolean isRegistered = false;
        boolean valid = checkDetails(dto);

        if(valid == true) {
            isRegistered = true;
            System.out.println("IRCTC Account Created Successfully");
            ref=dto;
        } else {
            System.out.println("IRCTC Registration Failed");
        }

        return isRegistered;
    }

    public boolean checkDetails(IrctcDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPwd = false;
        boolean isConfirm = false;

        if(dto.getUserName() != null && !dto.getUserName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Username");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email ID");

        if(dto.getPassword() != null) {
            isPwd = true;
        } else System.out.println("Password Required");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
            isConfirm = true;
        } else System.out.println("Confirm Password doesn't match");

        if(isName && isMobile && isEmail && isPwd && isConfirm) {
            isValid = true;
        }

        return isValid;
    }
    public void userDetails(){
        System.out.println(" the name is="+ref.getUserName());
        System.out.println(" the mobile is="+ref.getMobileNumber());
        System.out.println(" the email is="+ref.getEmailId());
        System.out.println(" the password is="+ref.getPassword());
        System.out.println(" the confirm is="+ref.getConfirmPassword());
    }
}
