package com.xworkz.boatapp.boat;



public class Boat {
    private  int boatid;
    private  String boatname;
    private String ownerName;
    private String type;


    public void setBoatid(int boatid) {
        this.boatid = boatid;
    }

    public int getBoatid() {
        return boatid;
    }

    public void setBoatname(String boatname) {
        this.boatname=boatname;
    }

    public String getBoatname() {
        return boatname;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

   /* public  void boatDetals(){

        System.out.println("the boat id is ="+ getBoatid());
        System.out.println("the boat name is ="+getBoatname());
        System.out.println("the boat Owener is ="+getOwnerName());
        System.out.println("the boat type is ="+getType());

    }*/
}
