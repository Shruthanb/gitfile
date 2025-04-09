package com.xworkz.blinkitapp;

import com.xworkz.blinkitapp.dto.BlinkitUser;
import com.xworkz.blinkitapp.service.BlinkitSeva;

import java.awt.print.Book;

public class BlinkitRunner {
    public static void main(String[] args) {
        BlinkitUser blink=new BlinkitUser();
        blink.setId(5);
        blink.setName("vivek");
        blink.setGmail("vivek@gmail");
        blink.setPhonenumber(25415263L);
        blink.setPassword("vivek1232456");

        BlinkitSeva ref=new BlinkitSeva();
        ref.registerusre(blink);
        ref.registerDetails();

    }

}
