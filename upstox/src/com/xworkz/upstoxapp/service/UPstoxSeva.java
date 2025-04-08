package com.xworkz.upstoxapp.service;

import com.xworkz.upstoxapp.dto.UpstoxDto;

public class UPstoxSeva {
    public boolean processAccount(UpstoxDto dto){
        boolean isAccountOpened = false;
        boolean isValid = validateInputs(dto);

        if(isValid == true){
            isAccountOpened = true;
            System.out.println("Upstox account registration successful");
        } else {
            System.out.println("Upstox account registration failed");
        }

        return isAccountOpened;
    }

    public boolean validateInputs(UpstoxDto dto){
        boolean isValid = false;

        boolean isName = false;
        boolean isMobile = false;
        boolean isEmail = false;
        boolean isDob = false;
        boolean isPan = false;
        boolean isLoginId = false;
        boolean isPwd = false;
        boolean isConfirmPwd = false;
        boolean isBrokerPlan = false;
        boolean isNominee = false;

        if(dto.getFullName() != null && !dto.getFullName().isEmpty()){
            isName = true;
        } else System.out.println("Invalid Full Name");

        if(dto.getMobile() != null && !dto.getMobile().isEmpty()){
            isMobile = true;
        } else System.out.println("Invalid Mobile");

        if(dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isEmail = true;
        } else System.out.println("Invalid Email");

        if(dto.getDob() != null && !dto.getDob().isEmpty()){
            isDob = true;
        } else System.out.println("Invalid DOB");

        if(dto.getPanNumber() != null && !dto.getPanNumber().isEmpty()){
            isPan = true;
        } else System.out.println("Invalid PAN");

        if(dto.getLoginId() != null && !dto.getLoginId().isEmpty()){
            isLoginId = true;
        } else System.out.println("Invalid Login ID");

        if(dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPwd = true;
        } else System.out.println("Invalid Password");

        if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())){
            isConfirmPwd = true;
        } else System.out.println("Password mismatch");

        if(dto.getBrokeragePlan() != null && !dto.getBrokeragePlan().isEmpty()){
            isBrokerPlan = true;
        } else System.out.println("Invalid Brokerage Plan");

        if(dto.getNomineeName() != null && !dto.getNomineeName().isEmpty()){
            isNominee = true;
        } else System.out.println("Invalid Nominee Name");

        if(isName && isMobile && isEmail && isDob && isPan && isLoginId && isPwd && isConfirmPwd && isBrokerPlan && isNominee){
            isValid = true;
        }

        return isValid;
    }
}

