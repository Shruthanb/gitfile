package com.xworkz.blinkitapp.service;

import com.xworkz.blinkitapp.dto.BlinkitUser;

public class BlinkitSeva {
      public  BlinkitUser blinker;
    public  boolean registerusre(BlinkitUser blink){
        boolean isusreregister=false;

       boolean blink1= validate(blink);
        if(blink1=true){
            System.out.println(" register is sucesfull...");
            blinker=blink;
        }
        else
            System.out.println(" register is unsucesfull...");


        return isusreregister;
    }

    public  boolean validate(BlinkitUser blink){
        boolean isvalidateuser=false;
        boolean isIdvalid=false;
        boolean isNamevalid=false;
        boolean isGmailvalid=false;
        boolean isPhoneNumbervalid=false;
        boolean isPasswordvalid=false;
        if(blink.getId()>0){
            isIdvalid=true;
        }
        else
            System.out.println("id is invalid...");


        if(blink.getName()!=null){
            isNamevalid=true;
        }
        else
            System.out.println("name is invalid...");


        if(blink.getGmail()!=null){
            isGmailvalid=true;
        }
        else
            System.out.println("gmail is invalid....");


        if(blink.getPhonenumber()!=0L){
            isPhoneNumbervalid=true;
        }
        else
            System.out.println("Phone number is invalid...");


        if(blink.getPassword()!=null){
            isPasswordvalid=true;
        }
        else
            System.out.println("password is invalid....");


        if(isIdvalid && isNamevalid && isGmailvalid && isPhoneNumbervalid && isGmailvalid){
            isvalidateuser=true;
        }



        return  isvalidateuser;
    }

    public void registerDetails(){
        System.out.println(" the id is ="+blinker.getId());
        System.out.println(" the user name is ="+blinker.getName());
        System.out.println(" the user gmail is ="+blinker.getGmail());
        System.out.println(" the user phone number is ="+blinker.getPhonenumber());
        System.out.println(" the user password is ="+blinker.getPassword());
    }
}
