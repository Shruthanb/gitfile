package com.xworkz.pancardapp.service;

import com.xworkz.pancardapp.dto.PanCardDto;

public class PanCardSeva {
    public boolean applyPan(PanCardDto dto) {
        boolean isPanIssued = false;
        boolean isValid = validateDetails(dto);

        if (isValid == true) {
            isPanIssued = true;
            System.out.println("PAN Application Submitted Successfully");
        } else {
            System.out.println("PAN Application Failed");
        }

        return isPanIssued;
    }

    public boolean validateDetails(PanCardDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isFather = false;
        boolean isDob = false;
        boolean isGender = false;
        boolean isAadhaar = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isAddress = false;
        boolean isType = false;

        if(dto.getApplicantName() != null && !dto.getApplicantName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Name");

        if(dto.getFatherName() != null && !dto.getFatherName().isEmpty()) {
            isFather = true;
        } else System.out.println("Invalid Father's Name");

        if(dto.getDob() != null && !dto.getDob().isEmpty()) {
            isDob = true;
        } else System.out.println("Invalid DOB");

        if(dto.getGender() != null && !dto.getGender().isEmpty()) {
            isGender = true;
        } else System.out.println("Invalid Gender");

        if(dto.getAadhaarNumber() != null && !dto.getAadhaarNumber().isEmpty()) {
            isAadhaar = true;
        } else System.out.println("Invalid Aadhaar Number");

        if(dto.getMobile() != null && !dto.getMobile().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile");

        if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isEmail = true;
        } else System.out.println("Invalid Email");

        if(dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            isAddress = true;
        } else System.out.println("Invalid Address");

        if(dto.getPanType() != null && !dto.getPanType().isEmpty()) {
            isType = true;
        } else System.out.println("Invalid PAN Type");

        if(isName && isFather && isDob && isGender && isAadhaar && isMobile && isEmail && isAddress && isType) {
            isValid = true;
        }

        return isValid;
    }
}
