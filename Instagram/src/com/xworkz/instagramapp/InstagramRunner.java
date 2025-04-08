package com.xworkz.instagramapp;

import com.xworkz.instagramapp.dto.InstagramDto;
import com.xworkz.instagramapp.service.InstagramSeva;

public class InstagramRunner {
    public static void main(String[] args){
        InstagramDto dto = new InstagramDto();

        dto.setFullName("Priya Sharma");
        dto.setUserName("priya_sharma");
        dto.setMobileNumberOrEmail("priya@gmail.com");
        dto.setPassword("Priya@123");
        dto.setConfirmPassword("Priya@123");
        dto.setDateOfBirth("10-05-2000");
        dto.setGender("Female");

        InstagramSeva seva = new InstagramSeva();
        boolean result = seva.registerUser(dto);

        if(result == true){
            System.out.println("Instagram Account Created Successfully");
        }
    }
}
