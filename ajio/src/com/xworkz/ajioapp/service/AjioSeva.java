package com.xworkz.ajioapp.service;
import com.xworkz.ajioapp.AjioRunner;
import com.xworkz.ajioapp.dto.AjioDto;



public class AjioSeva {

   public boolean registeruser(AjioDto ref){
       boolean isuserregister=false;
       boolean uservalidate=validateuser(ref);
           if(uservalidate)
           {
               isuserregister=true;
               System.out.println(" register is complete");
           }
           else System.out.println(" register is incomplete");

       return isuserregister;
   }

   public boolean validateuser(AjioDto ref){
       boolean isvalidateuser=false;
       boolean isNamevalid=false;
       boolean isPhonenubervalid=false;
       boolean isPasswordvalid=false;
       boolean isDaysvalid=false;

       if(ref.getName()!=null){
           isNamevalid=true;
       }
     if(ref.getPhonenumber()!=0L){
         isPhonenubervalid=true;
     }
     if (ref.getPassword()!=null){
         isPasswordvalid=true;
     }
     if(ref.getDays()!=null){
         isDaysvalid=true;
     }

     if( isNamevalid && isPhonenubervalid && isPasswordvalid && isDaysvalid){
         isvalidateuser=true;
     }

       return isvalidateuser;
   }

}
