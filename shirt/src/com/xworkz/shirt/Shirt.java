package com.xworkz.shirt;

public class Shirt {
    private int shirtId;

    private String brand;

    private String color;

    private String size;

    private String fabric;

    private double price;

    private boolean isFullSleeve;

    public void setShirtId(int shirtId) {
        this.shirtId = shirtId;
    }
    public int getShirtId() {
        return shirtId;
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

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    public String getFabric() {
        return fabric;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setIsFullSleeve(boolean isFullSleeve) {
        this.isFullSleeve = isFullSleeve;
    }
    public boolean getIsFullSleeve() {
        return isFullSleeve;
    }

}
