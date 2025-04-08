package com.xworkz.passport;

import com.xworkz.passport.constants.Cpvlocation;
import com.xworkz.passport.constants.Dcd;
import com.xworkz.passport.generatepassport.PassportSeva;
import com.xworkz.passport.passport.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportdto =new PassportDto();
        passportdto.setCpvlocation(Cpvlocation.Delhi);
        passportdto.setDcd(Dcd.mandya);
        passportdto.setGivenname("Shruthan ");
        passportdto.setSurename("gowda ");
        passportdto.setDob("28/2/2003");
        passportdto.setEmail("shruthan@gmail");
        passportdto.setEmailissame(true);
        passportdto.setLoginid("shruthan");
        passportdto.setPassword("9449563639");
        passportdto.setHintques("Gowda");
        passportdto.setHintans("B");
        passportdto.setCaptcha("kdh");





        PassportSeva ref= new PassportSeva();
        ref.registeruser(passportdto);
     /*boolean message =  ref.registeruser(passportdto);
     if(message==true){
         System.out.println("regester is completed");
     }*/
    }
}
