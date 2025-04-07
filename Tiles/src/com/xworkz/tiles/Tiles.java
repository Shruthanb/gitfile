package com.xworkz.tiles;

public class Tiles {

    private int tileId;

    private String brand;

    private String material;

    private String color;

    private String size;

    private double price;

    private String surfaceType;

    public void setTileId(int tileId) {
        this.tileId = tileId;
    }
    public int getTileId() {
        return tileId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
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

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setSurfaceType(String surfaceType) {
        this.surfaceType = surfaceType;
    }
    public String getSurfaceType() {
        return surfaceType;
    }
}
