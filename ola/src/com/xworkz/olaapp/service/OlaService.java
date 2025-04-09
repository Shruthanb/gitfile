package com.xworkz.olaapp.service;

import com.xworkz.olaapp.OlaRunner;
import com.xworkz.olaapp.dto.OlaUserDto;

public class OlaService {
    public  OlaUserDto ref;
     public  boolean  userregister(OlaUserDto ref){
         boolean isuserregister=false;

         boolean ref3=validate(ref);
         if(ref3==true){
             System.out.println(" register is completly...");
              this.ref=ref;
         }
         System.out.println("register is incomplete");

         return isuserregister;
     }
     public boolean validate(OlaUserDto ref){
         boolean isvalidateuser=false;
         boolean isIdvalid=false;
         boolean isNamevalid=false;
         boolean isGmailvalid=false;
         boolean isPhonenumbervalid=false;
         boolean isPasswordvalid=false;

         if(ref.getId()>0){
             isIdvalid=true;
         }
         else
             System.out.println("invalid id ");
         if(ref.getName()!=null && !ref.getName().isEmpty() ){
             isNamevalid=true;
         }
         else
             System.out.println("invalid name ");
         if(ref.getGmail()!=null && !ref.getGmail().isEmpty()){
             isGmailvalid=true;
         }
         else
             System.out.println("invalid gmail ");
         if(ref.getPhoneNumber()!=0L){
             isPhonenumbervalid=true;
         }
         else
             System.out.println("invalid phonenumber ");
         if(ref.getPassword()!=null && !ref.getPassword().isEmpty()){
             isPasswordvalid=true;
         }
         else
             System.out.println("invalid password ");

         if(isIdvalid && isNamevalid && isGmailvalid && isPhonenumbervalid && isPasswordvalid){
             isvalidateuser=true;
         }

         return isvalidateuser;
     }
     public  void userDetails(){
         System.out.println("the user id is ="+this.ref.getId());
         System.out.println("the user name is ="+this.ref.getName());
         System.out.println("the user gmail is ="+this.ref.getGmail());
         System.out.println("the user phonenumber is ="+this.ref.getPhoneNumber());
         System.out.println("the user password is ="+this.ref.getPassword());
     }
}
