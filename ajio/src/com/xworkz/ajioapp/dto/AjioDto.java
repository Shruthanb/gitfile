package com.xworkz.ajioapp.dto;
import com.xworkz.ajioapp.constant.Days;

public class AjioDto {

   private String name;
   private long phonenumber;
   private String password;
   private Days days;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setPhonenumber(long phonenumber) {
      this.phonenumber = phonenumber;
   }

   public long getPhonenumber() {
      return phonenumber;
   }

   public void setPassword(String password) {
      this.password = password;
   }
   public String getPassword(){
      return password;
   }

   public void setDays(Days days) {
      this.days = days;
   }

   public Days getDays() {
      return days;
   }
}
