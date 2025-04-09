package com.xworkz.meeshoapp.service;

import com.xworkz.meeshoapp.dto.Meeshodto;

public class MeeshoSeva {

    public Meeshodto ref;
    public boolean userregister(Meeshodto ref){
         boolean isregisteruser=false;
        boolean ref2=validate(ref);
        if(ref2==true) {
            System.out.println(" register is sucesfull...");
            this.ref=ref;
        }
        else
            System.out.println("register is unsucessfull...");

         return isregisteruser;
    }
   public boolean validate(Meeshodto ref){
        boolean isvalidateuser=false;
        boolean isIdvalid=false;
        boolean isNamevalid=false;
        boolean isPhonenumbervalid=false;
        boolean isPasswordvalid=false;
        boolean isGendervalid=false;

        if(ref.getId()!=0){
            isIdvalid=true;
        }
        if(ref.getName()!=null){
            isNamevalid=true;
        }
        if(ref.getPhonenumber()!=0L){
            isPhonenumbervalid=true;
        }
        if(ref.getPassword()!=null){
            isPasswordvalid=true;
        }
        if(ref.getGender()!=null){
            isGendervalid=true;
        }
      if(isNamevalid && isIdvalid && isPhonenumbervalid && isPasswordvalid && isGendervalid ){
          isvalidateuser=true;
      }
        return  isvalidateuser;
   }

   public  void userDetails(){
       System.out.println("the user id is ="+this.ref.getId());
       System.out.println("the user name is ="+this.ref.getName());
       System.out.println("the user phone number is ="+this.ref.getPhonenumber());
       System.out.println("the user password is ="+this.ref.getPassword());
       System.out.println("the user gender is ="+this.ref.getGender());
   }

}
