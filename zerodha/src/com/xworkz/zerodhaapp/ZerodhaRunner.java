package com.xworkz.zerodhaapp;

import com.xworkz.zerodhaapp.dto.ZerodhaDto;
import com.xworkz.zerodhaapp.service.ZerodhaSeva;

public class ZerodhaRunner {
    public static void main(String[] args) {
        ZerodhaDto dto = new ZerodhaDto();

        dto.setFullName("Shubman Gill");
        dto.setMobileNumber("9012345678");
        dto.setEmail("shubman@zerodha.com");
        dto.setPanCard("ABCPG1234Z");
        dto.setAadharCard("123456789012");
        dto.setDob("08-09-1999");
        dto.setLoginId("gill99");
        dto.setPassword("Zerodha@123");
        dto.setConfirmPassword("Zerodha@123");

        ZerodhaSeva seva = new ZerodhaSeva();
        boolean result = seva.openAccount(dto);

        if(result == true){
            System.out.println("Zerodha Account Created Successfully");
        }
    }
}
