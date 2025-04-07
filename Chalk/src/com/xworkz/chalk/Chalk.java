package com.xworkz.chalk;

public class Chalk {
    private int chalkId;

    private String brand;

    private String color;

    private String shape;

    private String material;

    private boolean dustFree;

    private double price;

    public void setChalkId(int chalkId) {
        this.chalkId = chalkId;
    }
    public int getChalkId() {
        return chalkId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getShape() {
        return shape;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setDustFree(boolean dustFree) {
        this.dustFree = dustFree;
    }
    public boolean isDustFree() {
        return dustFree;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
