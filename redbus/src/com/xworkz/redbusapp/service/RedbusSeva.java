package com.xworkz.redbusapp.service;
import com.xworkz.redbusapp.dto.RedbusDto;

public class RedbusSeva {
    public boolean doRegistration(RedbusDto dto) {
        boolean isRegistered = false;
        boolean isValid = verifyDetails(dto);

        if(isValid == true) {
            isRegistered = true;
            System.out.println("Redbus Registration Successful");
        } else {
            System.out.println("Redbus Registration Failed");
        }

        return isRegistered;
    }

    public boolean verifyDetails(RedbusDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isContact = false;
        boolean isEmail = false;
        boolean isPwd = false;
        boolean isConfirm = false;

        if(dto.getUserName() != null && !dto.getUserName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid User Name");

        if(dto.getContactNumber() != null && !dto.getContactNumber().isEmpty()) {
            isContact = true;
        } else System.out.println("Invalid Contact Number");

        if(dto.getEmailAddress() != null && !dto.getEmailAddress().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email Address");

        if(dto.getPassword() != null) {
            isPwd = true;
        } else System.out.println("Password is required");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
            isConfirm = true;
        } else System.out.println("Confirm Password must match Password");

        if(isName && isContact && isEmail && isPwd && isConfirm) {
            isValid = true;
        }

        return isValid;
    }
}
