package com.xworkz.fastagapp.service;

import com.xworkz.fastagapp.dto.FastagDto;

public class FastagSeva {
    public boolean processFastag(FastagDto dto) {
        boolean isProcessed = false;
        boolean validInfo = checkFastagInfo(dto);

        if(validInfo == true) {
            isProcessed = true;
            System.out.println("FASTag Registered Successfully");
        } else {
            System.out.println("FASTag Registration Failed");
        }

        return isProcessed;
    }

    public boolean checkFastagInfo(FastagDto dto) {
        boolean isValid = false;

        boolean isVehicle = false;
        boolean isOwner = false;
        boolean isType = false;
        boolean isMobile = false;
        boolean isKyc = false;

        if(dto.getVehicleNumber() != null && !dto.getVehicleNumber().isEmpty()) {
            isVehicle = true;
        } else System.out.println("Invalid Vehicle Number");

        if(dto.getOwnerName() != null && !dto.getOwnerName().isEmpty()) {
            isOwner = true;
        } else System.out.println("Invalid Owner Name");

        if(dto.getVehicleType() != null && !dto.getVehicleType().isEmpty()) {
            isType = true;
        } else System.out.println("Invalid Vehicle Type");

        if(dto.getMobileNo() != null && !dto.getMobileNo().isEmpty()) {
            isMobile = true;
        } else System.out.println("Invalid Mobile Number");

        if(dto.getKycDocument() != null && !dto.getKycDocument().isEmpty()) {
            isKyc = true;
        } else System.out.println("Invalid KYC Document");

        if(isVehicle && isOwner && isType && isMobile && isKyc) {
            isValid = true;
        }

        return isValid;
    }
}
