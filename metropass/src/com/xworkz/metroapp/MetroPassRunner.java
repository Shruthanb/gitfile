package com.xworkz.metroapp;

import com.xworkz.metroapp.dto.MetroPassDto;
import com.xworkz.metroapp.service.MetroPassSeva;

public class MetroPassRunner {
    public static void main(String[] args) {
        MetroPassDto dto = new MetroPassDto();

        dto.setPassengerName("Rahul Singh");
        dto.setGender("Male");
        dto.setDob("01-01-2000");
        dto.setStartStation("Rajajinagar");
        dto.setEndStation("Majestic");
        dto.setIdProof("PAN Card");
        dto.setTravelDuration("3 Months");

        MetroPassSeva seva = new MetroPassSeva();
        boolean result = seva.applyMetroPass(dto);
         seva.userdetails();

        if(result == true) {
            System.out.println("Metro Pass Ready to Use!");
        }
    }
}
