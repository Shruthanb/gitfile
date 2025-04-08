package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.dto.ZomatoDto;
import com.xworkz.zomatoapp.service.ZomatoSeva;

public class ZomatoRunner {
    public static void main(String[] args) {
        ZomatoDto dto = new ZomatoDto();

        dto.setFullName("Ayesha Rao");
        dto.setMobile("9876543210");
        dto.setEmail("ayesha@zomato.com");
        dto.setUserPassword("Zomato@2025");
        dto.setRetypePassword("Zomato@2025");

        ZomatoSeva seva = new ZomatoSeva();
        boolean success = seva.performSignup(dto);

        if(success == true) {
            System.out.println("You can now order delicious food!");
        }
    }
}
