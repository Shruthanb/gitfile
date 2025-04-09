package com.xworkz.snapchatapp;

import com.xworkz.snapchatapp.dto.SnapchatDto;
import com.xworkz.snapchatapp.service.SnapchatSeva;

public class SnapchatRunner {
    public static void main(String[] args) {
        SnapchatDto dto = new SnapchatDto();

        dto.setUserName("snap_star24");
        dto.setMobileNo("9090909090");
        dto.setEmail("snap24@gmail.com");
        dto.setDob("2001-06-14");
        dto.setPassword("Snap@123");
        dto.setConfirmPassword("Snap@123");
        dto.setDisplayName("SnapStar");

        SnapchatSeva seva = new SnapchatSeva();
        boolean status = seva.createSnapchatAccount(dto);
        seva.userDetails();

        if(status == true) {
            System.out.println("User Registered on Snapchat");
        }
    }
}
