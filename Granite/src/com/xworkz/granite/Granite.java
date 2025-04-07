package com.xworkz.granite;

public class Granite { private int graniteId;

    private String brand;

    private String color;

    private String origin;

    private String finishType;

    private double thickness;

    private double pricePerSqFt;

    public void setGraniteId(int graniteId) {
        this.graniteId = graniteId;
    }
    public int getGraniteId() {
        return graniteId;
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

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getOrigin() {
        return origin;
    }

    public void setFinishType(String finishType) {
        this.finishType = finishType;
    }
    public String getFinishType() {
        return finishType;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
    public double getThickness() {
        return thickness;
    }

    public void setPricePerSqFt(double pricePerSqFt) {
        this.pricePerSqFt = pricePerSqFt;
    }
    public double getPricePerSqFt() {
        return pricePerSqFt;
    }
}
