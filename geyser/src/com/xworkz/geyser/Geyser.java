package com.xworkz.geyser;

public class Geyser {
    private int geyserId;

    private String brand;

    private double capacityInLiters;

    private String color;

    private int powerInWatts;

    private boolean isAutomatic;

    private double price;

    public void setGeyserId(int geyserId) {
        this.geyserId = geyserId;
    }
    public int getGeyserId() {
        return geyserId;
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

    public void setPowerInWatts(int powerInWatts) {
        this.powerInWatts = powerInWatts;
    }
    public int getPowerInWatts() {
        return powerInWatts;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }
    public boolean getIsAutomatic() {
        return isAutomatic;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

}
