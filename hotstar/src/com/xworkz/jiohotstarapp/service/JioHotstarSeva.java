package com.xworkz.jiohotstarapp.service;

import com.xworkz.jiohotstarapp.dto.JioHotstarDto;

public class JioHotstarSeva {
    public boolean registerAccount(JioHotstarDto dto) {
        boolean isRegistered = false;
        boolean valid = validateInput(dto);

        if(valid == true) {
            isRegistered = true;
            System.out.println("Jio Hotstar Registration Successful");
        } else {
            System.out.println("Jio Hotstar Registration Failed");
        }

        return isRegistered;
    }

    public boolean validateInput(JioHotstarDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPlan = false;
        boolean isDevice = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Full Name");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email ID");

        if(dto.getSubscriptionPlan() != null && !dto.getSubscriptionPlan().isEmpty()) {
            isPlan = true;
        } else System.out.println("Invalid Subscription Plan");

        if(dto.getDeviceType() != null && !dto.getDeviceType().isEmpty()) {
            isDevice = true;
        } else System.out.println("Invalid Device Type");

        if(isName && isMobile && isEmail && isPlan && isDevice) {
            isValid = true;
        }

        return isValid;
    }
}
