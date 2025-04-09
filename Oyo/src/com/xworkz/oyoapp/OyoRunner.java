package com.xworkz.oyoapp;

import com.xworkz.oyoapp.dto.OyoDto;
import com.xworkz.oyoapp.service.OyoSeva;


public class OyoRunner {
    public static void main(String[] args) {
        OyoDto dto = new OyoDto();

        dto.setFullName("Aman Singh");
        dto.setMobileNumber("9876543210");
        dto.setEmailId("aman.oyo@gmail.com");
        dto.setPassword("Oyo@123");
        dto.setConfirmPassword("Oyo@123");

        OyoSeva seva = new OyoSeva();
        boolean response = seva.registerCustomer(dto);
        seva.userdetails();

        if(response == true) {
            System.out.println("Welcome to OYO Rooms!");
        }
    }
}
