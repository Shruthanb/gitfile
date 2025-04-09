package com.xworkz.phonepeapp;
import com.xworkz.phonepeapp.dto.PhonePeDto;
import com.xworkz.phonepeapp.service.PhonePeSeva;

public class PhonePeRunner {
    public static void main(String[] args) {
        PhonePeDto dto = new PhonePeDto();

        dto.setFullName("Sneha Mehra");
        dto.setMobileNumber("9876543210");
        dto.setEmailId("sneha@gmail.com");
        dto.setUpiPin("1234");
        dto.setConfirmPin("1234");
        dto.setBankName("HDFC");
        dto.setReferralCode("SNEHA2025");

        PhonePeSeva seva = new PhonePeSeva();
        boolean status = seva.registerUserPhonePe(dto);
         seva.userDetails();

        if(status == true) {
            System.out.println("Welcome to PhonePe!");
        }
    }
}

