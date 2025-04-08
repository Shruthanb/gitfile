package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.dto.FlipkartDto;
import com.xworkz.flipkartapp.service.FlipkartSeva;

public class FlipkartRunner {
    public static void main(String[] args){
        FlipkartDto dto = new FlipkartDto();

        dto.setFullName("Rohit Sharma");
        dto.setMobileNumber("9876543210");
        dto.setEmailId("rohit.sharma@flipkart.com");
        dto.setPassword("Hitman@45");
        dto.setConfirmPassword("Hitman@45");
        dto.setDeliveryAddress("Dadar, Mumbai");
        dto.setPinCode("400014");
        dto.setOtp("X5Y6Z7");

        FlipkartSeva seva = new FlipkartSeva();
        boolean result = seva.beginRegistration(dto);

        if(result == true){
            System.out.println("Flipkart Account Created Successfully");
        }
    }
}
