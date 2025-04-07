package com.xworkz.boatapp.boat;

public class BoatRunner {
    public static void main(String[] args) {
        System.out.println("main as been started");

        Boat ref=new Boat();
        ref.setBoatid(2);
        ref.setBoatname("casino");
        ref.setOwnerName("shivu");
        ref.setType("soil boat");
        //ref.boatDetals();//

          int boatId=ref.getBoatid();
          String boatName=ref.getBoatname();
          String boatOwner=ref.getOwnerName();
          String boatType=ref.getType();
        System.out.println("theboat id is ="+boatId);
        System.out.println("the boat name is ="+boatName);
        System.out.println("the boat owner is ="+boatOwner);
        System.out.println("the boat type is ="+boatType);
        System.out.println("main as been ended");
    }
}
