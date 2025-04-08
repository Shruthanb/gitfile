package com.xworkz.meeshoapp;

import com.xworkz.meeshoapp.constant.Gender;
import com.xworkz.meeshoapp.dto.Meeshodto;
import com.xworkz.meeshoapp.service.MeeshoSeva;

public class MeeshoRunner {
    public static void main(String[] args) {
        Meeshodto ref=new Meeshodto();
        ref.setId(1);
        ref.setName("");
        ref.setPhonenumber(85968574L);
        ref.setPassword("");
        ref.setGender(Gender.female);

        MeeshoSeva ref1=new MeeshoSeva();
        ref1.userregister(ref);
    }


}
