package com.xworkz.olaapp;

import com.xworkz.olaapp.dto.OlaUserDto;
import com.xworkz.olaapp.service.OlaService;

public class OlaRunner {
    public static void main(String[] args) {
        OlaUserDto ref=new OlaUserDto();
        ref.setId(2);
        ref.setName("shivu");
        ref.setGmail("shruthan@gmail");
        ref.setPhoneNumber(0L);
        ref.setPassword("1223shruthan");

        OlaService ref2=new OlaService();
         ref2.userregister(ref);
         ref2.userDetails();

    }
}
