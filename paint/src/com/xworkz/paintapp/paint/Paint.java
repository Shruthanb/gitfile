package com.xworkz.paintapp.paint;

public class Paint {

    private int paintid;
    private String brandname;
    private double price;
    private  String color;
    private  String painttype;


    public void setPaintid(int paintid) {
        this.paintid = paintid;
    }

    public int getPaintid() {
        return paintid;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPainttype(String painttype) {
        this.painttype = painttype;
    }

    public String getPainttype() {
        return painttype;
    }
}
