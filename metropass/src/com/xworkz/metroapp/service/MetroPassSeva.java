package com.xworkz.metroapp.service;

import com.xworkz.metroapp.dto.MetroPassDto;

public class MetroPassSeva {
    public boolean applyMetroPass(MetroPassDto dto) {
        boolean isApplied = false;
        boolean validForm = validateMetroInfo(dto);

        if(validForm == true) {
            isApplied = true;
            System.out.println("Metro Pass Registration Successful");
        } else {
            System.out.println("Metro Pass Registration Failed");
        }

        return isApplied;
    }

    public boolean validateMetroInfo(MetroPassDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isGender = false;
        boolean isDob = false;
        boolean isStart = false;
        boolean isEnd = false;
        boolean isProof = false;
        boolean isDuration = false;

        if(dto.getPassengerName() != null && !dto.getPassengerName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Passenger Name");

        if(dto.getGender() != null && !dto.getGender().isEmpty()) {
            isGender = true;
        } else System.out.println("Invalid Gender");

        if(dto.getDob() != null && !dto.getDob().isEmpty()) {
            isDob = true;
        } else System.out.println("Invalid DOB");

        if(dto.getStartStation() != null && !dto.getStartStation().isEmpty()) {
            isStart = true;
        } else System.out.println("Invalid Start Station");

        if(dto.getEndStation() != null && !dto.getEndStation().isEmpty()) {
            isEnd = true;
        } else System.out.println("Invalid End Station");

        if(dto.getIdProof() != null && !dto.getIdProof().isEmpty()) {
            isProof = true;
        } else System.out.println("Invalid ID Proof");

        if(dto.getTravelDuration() != null && !dto.getTravelDuration().isEmpty()) {
            isDuration = true;
        } else System.out.println("Invalid Travel Duration");

        if(isName && isGender && isDob && isStart && isEnd && isProof && isDuration) {
            isValid = true;
        }

        return isValid;
    }
}
