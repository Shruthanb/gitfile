package com.xworkz.upstoxapp;

import com.xworkz.upstoxapp.dto.UpstoxDto;
import com.xworkz.upstoxapp.service.UpstoxSeva;

public class UpstoxRunner {
    public static void main(String[] args) {
        UpstoxDto dto = new UpstoxDto();

        dto.setFullName("Smriti Mandhana");
        dto.setMobile("9876543210");
        dto.setEmail("smriti@upstox.com");
        dto.setDob("18-07-1996");
        dto.setPanNumber("SMRTP1234K");
        dto.setLoginId("mandhana18");
        dto.setPassword("Upstox@2025");
        dto.setConfirmPassword("Upstox@2025");
        dto.setBrokeragePlan("Basic");
        dto.setNomineeName("Anjali Mandhana");

        UpstoxSeva seva = new UpstoxSeva();
        boolean result = seva.processAccount(dto);

        if(result == true){
            System.out.println("Upstox Account Created Successfully");
        }
    }
}
