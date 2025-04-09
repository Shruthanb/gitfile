package com.xworkz.ajioapp;

import com.xworkz.ajioapp.constant.Days;
import com.xworkz.ajioapp.dto.AjioDto;
import com.xworkz.ajioapp.service.AjioSeva;

public class AjioRunner {
    public static void main(String[] args) {
        AjioDto ref=new AjioDto();
       ref.setName(null);
       ref.setPhonenumber(7485745L);
       ref.setPassword(" ");
       ref.setDays(Days.monday);

        AjioSeva ajioSeva = new AjioSeva();
        ajioSeva.registeruser(ref);
        ajioSeva.userDetails();
    }
}
