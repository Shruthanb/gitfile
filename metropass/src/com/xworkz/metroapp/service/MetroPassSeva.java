package com.xworkz.metroapp.service;

import com.xworkz.metroapp.dto.MetroPassDto;

public class MetroPassSeva {
    public MetroPassDto dto;
    public boolean applyMetroPass(MetroPassDto dto) {
        boolean isApplied = false;
        boolean validForm = validateMetroInfo(dto);

        if(validForm == true) {
            isApplied = true;
            System.out.println("Metro Pass Registration Successful");
            this.dto=dto;
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
    public void userdetails(){
        System.out.println(" the name  is="+this.dto.getPassengerName());
        System.out.println(" the  gender is="+this.dto.getGender());
        System.out.println(" the  dob is="+this.dto.getDob());
        System.out.println(" the  start is="+this.dto.getStartStation());
        System.out.println(" the end  is="+this.dto.getEndStation());
        System.out.println(" the  proof is="+this.dto.getIdProof());
        System.out.println(" the duration is="+this.dto.getTravelDuration());

    }
}
