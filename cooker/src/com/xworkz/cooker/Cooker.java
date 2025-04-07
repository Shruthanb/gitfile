package com.xworkz.cooker;

public class Cooker {


    private int cookerId;

    private String brand;

    private double capacityInLiters;

    private String color;

    private double price;

    private boolean isInductionCompatible;

    private String material;

    public void setCookerId(int cookerId) {
        this.cookerId = cookerId;
    }
    public int getCookerId() {
        return cookerId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setCapacityInLiters(double capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }
    public double getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setIsInductionCompatible(boolean isInductionCompatible) {
        this.isInductionCompatible = isInductionCompatible;
    }
    public boolean getIsInductionCompatible() {
        return isInductionCompatible;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
}
