package com.xworkz.irctcapp;

import com.xworkz.irctcapp.dto.IrctcDto;
import com.xworkz.irctcapp.service.IrctcSeva;

public class IrctcRunner {
    public static void main(String[] args) {
        IrctcDto dto = new IrctcDto();

        dto.setUserName("trainlover92");
        dto.setMobileNumber("9994432100");
        dto.setEmailId("trainlover@irctc.in");
        dto.setPassword("Train@123");
        dto.setConfirmPassword("Train@123");

        IrctcSeva seva = new IrctcSeva();
        boolean result = seva.initiateRegistration(dto);
        seva.userDetails();

        if(result == true) {
            System.out.println("Enjoy booking with IRCTC!");
        }
    }
}
