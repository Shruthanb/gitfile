package com.xworkz.adharapp.service;

import com.xworkz.adharapp.dto.AadharDto;

public class AadharSeva {
     public AadharDto ref;
    public boolean registerAadhar(AadharDto dto) {
        boolean isAadharRegistered = false;
        boolean isValidDetails = verifyAadharDetails(dto);

        if(isValidDetails == true) {
            isAadharRegistered = true;
            System.out.println("Aadhar Registration Successful");
            ref=dto;
        } else {
            System.out.println("Aadhar Registration Failed");
        }

        return isAadharRegistered;
    }

    public boolean verifyAadharDetails(AadharDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isBirth = false;
        boolean isAddress = false;
        boolean isMobile = false;
        boolean isOtp = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Full Name");

        if(dto.getBirthYear() != null && !dto.getBirthYear().isEmpty()) {
            isBirth = true;
        } else System.out.println("Invalid Birth Year");

        if(dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            isAddress = true;
        } else System.out.println("Invalid Address");

        if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getOtp() != null && !dto.getOtp().isEmpty()) {
            isOtp = true;
        } else System.out.println("Invalid OTP");

        if(isName && isBirth && isAddress && isMobile && isOtp) {
            isValid = true;
        }

        return isValid;
    }
    public void userDetails(){
        System.out.println(" the name is="+ref.getFullName());
        System.out.println(" the birth is="+ref.getBirthYear());
        System.out.println(" the address is="+ref.getAddress());
        System.out.println(" the mobile  is="+ref.getMobileNumber());
        System.out.println(" the otp  is="+ref.getOtp());
    }
}
