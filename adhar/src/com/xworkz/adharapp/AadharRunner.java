package com.xworkz.adharapp;

import com.xworkz.adharapp.dto.AadharDto;
import com.xworkz.adharapp.service.AadharSeva;

public class AadharRunner {
    public static void main(String[] args) {
        AadharDto dto = new AadharDto();

        dto.setFullName("Raghav Sharma");
        dto.setBirthYear("1995");
        dto.setAddress("Sector 10, Gurugram, Haryana");
        dto.setMobileNumber("9123456789");
        dto.setOtp("894561");

        AadharSeva seva = new AadharSeva();
        boolean done = seva.registerAadhar(dto);
        seva.userDetails();

        if(done == true) {
            System.out.println("You will receive your Aadhar card soon.");
        }
    }
}
