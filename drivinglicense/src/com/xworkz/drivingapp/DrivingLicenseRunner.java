package com.xworkz.drivingapp;

import com.xworkz.drivingapp.dto.DrivingLicenseDto;
import com.xworkz.drivingapp.service.DrivingLicenseSeva;

public class DrivingLicenseRunner {
    public static void main(String[] args) {
        DrivingLicenseDto dto = new DrivingLicenseDto();

        dto.setApplicantName("Kiran Kumar");
        dto.setDob("12-03-1996");
        dto.setAddress("Mysore, Karnataka");
        dto.setVehicleCategory("MCWG");
        dto.setIdProof("Voter ID");

        DrivingLicenseSeva seva = new DrivingLicenseSeva();
        boolean approved = seva.startRegistration(dto);
        seva.userDetails();

        if(approved == true) {
            System.out.println("DL Application Submitted!");
        }
    }
}
