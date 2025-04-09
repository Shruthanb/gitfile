package com.xworkz.jiohotstarapp;

import com.xworkz.jiohotstarapp.dto.JioHotstarDto;
import com.xworkz.jiohotstarapp.service.JioHotstarSeva;

public class JioHotstarRunner {
    public static void main(String[] args) {
        JioHotstarDto dto = new JioHotstarDto();

        dto.setFullName("Sneha Reddy");
        dto.setMobileNumber("9123456780");
        dto.setEmailId("sneha.reddy@gmail.com");
        dto.setSubscriptionPlan("Premium");
        dto.setDeviceType("Smart TV");

        JioHotstarSeva seva = new JioHotstarSeva();
        boolean result = seva.registerAccount(dto);
        seva.userDetails();

        if(result == true) {
            System.out.println("Access Granted to Jio Hotstar");
        }
    }
}
