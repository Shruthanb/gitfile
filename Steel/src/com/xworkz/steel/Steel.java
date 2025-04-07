package com.xworkz.steel;

public class Steel {
    private int steelid;
    private String steelbrand;
    private double price;
    private  String steeltype;
    private String steelsize;

    public void setSteelid(int steelid) {
        this.steelid = steelid;
    }

    public int getSteelid() {
        return steelid;
    }

    public void setSteelbrand(String steelbrand) {
        this.steelbrand = steelbrand;
    }

    public String getSteelbrand() {
        return steelbrand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSteeltype(String steeltype) {
        this.steeltype = steeltype;
    }

    public String getSteeltype() {
        return steeltype;
    }

    public void setSteelsize(String steelsize) {
        this.steelsize = steelsize;
    }

    public String getSteelsize() {
        return steelsize;
    }
}
