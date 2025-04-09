package com.xworkz.redbusapp;

import com.xworkz.redbusapp.dto.RedbusDto;
import com.xworkz.redbusapp.service.RedbusSeva;


public class RedbusRunner {
    public static void main(String[] args) {
        RedbusDto dto = new RedbusDto();

        dto.setUserName("nikhil_rider");
        dto.setContactNumber("9988776655");
        dto.setEmailAddress("nikhil@redbus.com");
        dto.setPassword("Bus@321");
        dto.setConfirmPassword("Bus@321");

        RedbusSeva seva = new RedbusSeva();
        boolean result = seva.doRegistration(dto);
        seva.userdetails();

        if(result == true) {
            System.out.println("Welcome to Redbus Booking Platform!");
        }
    }
}
