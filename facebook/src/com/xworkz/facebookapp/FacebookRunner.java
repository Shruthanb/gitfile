package com.xworkz.facebookapp;

import com.xworkz.facebookapp.dto.FacebookDto;
import com.xworkz.facebookapp.service.FacebookSeva;

public class FacebookRunner {
    public static void main(String[] args){
        FacebookDto dto = new FacebookDto();

        dto.setFirstName("Rahul");
        dto.setLastName("Verma");
        dto.setMobileOrEmail("rahul.verma@gmail.com");
        dto.setNewPassword("Rahul@123");
        dto.setConfirmPassword("Rahul@123");
        dto.setBirthDate("15-03-1995");
        dto.setGender("Male");

        FacebookSeva seva = new FacebookSeva();
        boolean result = seva.registerUser(dto);
        seva.userDetails();

        if(result == true){
            System.out.println("Facebook Account Created Successfully");
        }
    }
}
