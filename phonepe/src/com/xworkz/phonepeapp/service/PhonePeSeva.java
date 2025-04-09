package com.xworkz.phonepeapp.service;

import com.xworkz.phonepeapp.dto.PhonePeDto;

public class PhonePeSeva {
     public PhonePeDto dto;
    public boolean registerUserPhonePe(PhonePeDto dto) {
        boolean isRegistered = false;
        boolean isValidated = validatePhonePeDetails(dto);

        if(isValidated == true) {
            isRegistered = true;
            System.out.println("PhonePe Registration Successful");
            this.dto=dto;
        } else {
            System.out.println("PhonePe Registration Failed");
        }

        return isRegistered;
    }

    public boolean validatePhonePeDetails(PhonePeDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isPin = false;
        boolean isConfirm = false;
        boolean isBank = false;
        boolean isReferral = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Full Name");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email ID");

        if(dto.getUpiPin() != null && !dto.getUpiPin().isEmpty()) {
            isPin = true;
        } else System.out.println("Invalid UPI PIN");

        if(dto.getConfirmPin() != null && dto.getConfirmPin().equals(dto.getUpiPin())) {
            isConfirm = true;
        } else System.out.println("UPI PIN and Confirm PIN must match");

        if(dto.getBankName() != null && !dto.getBankName().isEmpty()) {
            isBank = true;
        } else System.out.println("Invalid Bank Name");

        if(dto.getReferralCode() != null) {
            isReferral = true;
        }

        if(isName && isMobile && isEmail && isPin && isConfirm && isBank && isReferral) {
            isValid = true;
        }

        return isValid;
    }
    public void userDetails(){
        System.out.println(" the name  is="+this.dto.getFullName());
        System.out.println(" the  mobile is="+this.dto.getMobileNumber());
        System.out.println(" the email is="+this.dto.getEmailId());
        System.out.println(" the pin  is="+this.dto.getUpiPin());
        System.out.println(" the confirm is="+this.dto.getConfirmPin());
        System.out.println(" the bank is="+this.dto.getBankName());
        System.out.println(" the referral is="+this.dto.getReferralCode());
    }
}
