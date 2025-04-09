package com.xworkz.amazonapp;

import com.xworkz.amazonapp.dto.AmazonDto;
import com.xworkz.amazonapp.service.AmazonSeva;

public class AmazonRunner {
    public static void main(String[] args){
        AmazonDto dto = new AmazonDto();

        dto.setUserName("Anjali");
        dto.setMobileNumberOrEmail("anjali.k@amazonmail.com");
        dto.setCreatePassword("Anjali@789");
        dto.setRetypePassword("Anjali@789");
        dto.setAddress("123, JP Nagar, Bangalore");
        dto.setCountry("India");
        dto.setOtp("A1B2C3");

        AmazonSeva seva = new AmazonSeva();
        boolean status = seva.processRegistration(dto);
        seva.userDetails();

        if(status == true){
            System.out.println("Amazon Account Created Successfully");
        }
    }
}
