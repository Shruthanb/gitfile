package com.xworkz.pancardapp;

import com.xworkz.pancardapp.dto.PanCardDto;
import com.xworkz.pancardapp.service.PanCardSeva;

public class PancardRunner {
    public static void main(String[] args) {
        PanCardDto dto = new PanCardDto();

        dto.setApplicantName("Rajesh Kumar");
        dto.setFatherName("Mahesh Kumar");
        dto.setDob("15-06-1990");
        dto.setGender("Male");
        dto.setAadhaarNumber("987612345678");
        dto.setMobile("9876543210");
        dto.setEmail("rajesh.kumar@gmail.com");
        dto.setAddress("4th Main Road, Jayanagar, Bengaluru");
        dto.setPanType("Individual");

        PanCardSeva seva = new PanCardSeva();
        boolean result = seva.applyPan(dto);

        if(result == true) {
            System.out.println("PAN Card will be delivered soon");
        }
    }
}
