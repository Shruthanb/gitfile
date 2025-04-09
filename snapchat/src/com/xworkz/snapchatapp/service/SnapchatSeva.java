package com.xworkz.snapchatapp.service;

import com.xworkz.snapchatapp.dto.SnapchatDto;

public class SnapchatSeva {
     public SnapchatDto dto;
    public boolean createSnapchatAccount(SnapchatDto dto) {
        boolean isCreated = false;
        boolean isValid = verifySnapchatDetails(dto);

        if(isValid == true) {
            isCreated = true;
            System.out.println("Snapchat Account Created Successfully");
            this.dto=dto;
        } else {
            System.out.println("Snapchat Account Creation Failed");
        }

        return isCreated;
    }

    public boolean verifySnapchatDetails(SnapchatDto dto) {
        boolean isValid = false;

        boolean isUserName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isDob = false;
        boolean isPwd = false;
        boolean isConfirm = false;
        boolean isDisplay = false;

        if(dto.getUserName() != null && !dto.getUserName().isEmpty()) {
            isUserName = true;
        } else System.out.println("Invalid Username");

        if(dto.getMobileNo() != null && !dto.getMobileNo().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email");

        if(dto.getDob() != null && !dto.getDob().isEmpty()) {
            isDob = true;
        } else System.out.println("Invalid Date of Birth");

        if(dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            isPwd = true;
        } else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
            isConfirm = true;
        } else System.out.println("Passwords do not match");

        if(dto.getDisplayName() != null && !dto.getDisplayName().isEmpty()) {
            isDisplay = true;
        } else System.out.println("Invalid Display Name");

        if(isUserName && isMobile && isEmail && isDob && isPwd && isConfirm && isDisplay) {
            isValid = true;
        }

        return isValid;
    }
    public void userDetails(){
        System.out.println("the user name is ="+this.dto.getUserName());
        System.out.println("the user mobile is ="+this.dto.getMobileNo());
        System.out.println("the user email is ="+this.dto.getEmail());
        System.out.println("the user dob is ="+this.dto.getDob());
        System.out.println("the user pwd is ="+this.dto.getPassword());
        System.out.println("the user confirm password is ="+this.dto.getConfirmPassword());
        System.out.println("the user display is ="+this.dto.getDisplayName());
    }
}
