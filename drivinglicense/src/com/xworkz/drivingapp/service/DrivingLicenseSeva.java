package com.xworkz.drivingapp.service;

import com.xworkz.drivingapp.dto.DrivingLicenseDto;

public class DrivingLicenseSeva {

    public DrivingLicenseDto dto;
    public boolean startRegistration(DrivingLicenseDto dto) {
        boolean isRegistered = false;
        boolean isEligible = validateDrivingDetails(dto);

        if(isEligible == true) {
            isRegistered = true;
            System.out.println("Driving License Registration Successful");
            this.dto=dto;
        } else
        {
            System.out.println("Driving License Registration Failed");
        }

        return isRegistered;
    }

    public boolean validateDrivingDetails(DrivingLicenseDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isDob = false;
        boolean isAddress = false;
        boolean isVehicleType = false;
        boolean isProof = false;

        if(dto.getApplicantName() != null && !dto.getApplicantName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Applicant Name");

        if(dto.getDob() != null && !dto.getDob().isEmpty()) {
            isDob = true;
        } else System.out.println("Invalid DOB");

        if(dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            isAddress = true;
        } else System.out.println("Invalid Address");

        if(dto.getVehicleCategory() != null && !dto.getVehicleCategory().isEmpty()) {
            isVehicleType = true;
        } else System.out.println("Invalid Vehicle Category");

        if(dto.getIdProof() != null && !dto.getIdProof().isEmpty()) {
            isProof = true;
        } else System.out.println("Invalid ID Proof");

        if(isName && isDob && isAddress && isVehicleType && isProof) {
            isValid = true;
        }

        return isValid;
    }
    public void  userDetails(){

        System.out.println("the user name is ="+this.dto.getApplicantName());
        System.out.println("the user dob is ="+this.dto.getDob());
        System.out.println("the user address is ="+this.dto.getAddress());
        System.out.println("the user vehicle type is ="+this.dto.getVehicleCategory());
        System.out.println("the user proof is ="+this.dto.getIdProof());
    }
}
