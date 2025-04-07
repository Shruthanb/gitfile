package com.xworkz.mattress;

public class Mattress {
    private int mattressId;

    private String brand;

    private String type;

    private String size;

    private double thickness;

    private String material;

    private double price;

    public void setMattressId(int mattressId) {
        this.mattressId = mattressId;
    }
    public int getMattressId() {
        return mattressId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
    public double getThickness() {
        return thickness;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
