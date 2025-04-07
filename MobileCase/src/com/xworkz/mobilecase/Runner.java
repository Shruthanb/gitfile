package com.xworkz.mobilecase;

public class Runner {
    public static void main(String[] args) {
        MobileCase case1 = new MobileCase();
        case1.setCaseId(1);
        case1.setBrand("Spigen");
        case1.setModel("iPhone 14 Pro");
        case1.setMaterial("TPU");
        case1.setColor("Black");
        case1.setWaterproof(true);
        case1.setPrice(1599.00);

        System.out.println("Case1 ID: " + case1.getCaseId());
        System.out.println("Case1 Brand: " + case1.getBrand());
        System.out.println("Case1 Model: " + case1.getModel());
        System.out.println("Case1 Material: " + case1.getMaterial());
        System.out.println("Case1 Color: " + case1.getColor());
        System.out.println("Case1 Waterproof: " + case1.isWaterproof());
        System.out.println("Case1 Price: ₹" + case1.getPrice());
        System.out.println("--------------------------------------------");

        MobileCase case2 = new MobileCase();
        case2.setCaseId(2);
        case2.setBrand("Ringke");
        case2.setModel("Samsung Galaxy S23");
        case2.setMaterial("Polycarbonate");
        case2.setColor("Clear");
        case2.setWaterproof(false);
        case2.setPrice(1299.00);

        System.out.println("Case2 ID: " + case2.getCaseId());
        System.out.println("Case2 Brand: " + case2.getBrand());
        System.out.println("Case2 Model: " + case2.getModel());
        System.out.println("Case2 Material: " + case2.getMaterial());
        System.out.println("Case2 Color: " + case2.getColor());
        System.out.println("Case2 Waterproof: " + case2.isWaterproof());
        System.out.println("Case2 Price: ₹" + case2.getPrice());
        System.out.println("--------------------------------------------");

        MobileCase case3 = new MobileCase();
        case3.setCaseId(3);
        case3.setBrand("OtterBox");
        case3.setModel("Pixel 7");
        case3.setMaterial("Silicone");
        case3.setColor("Navy Blue");
        case3.setWaterproof(true);
        case3.setPrice(1899.00);

        System.out.println("Case3 ID: " + case3.getCaseId());
        System.out.println("Case3 Brand: " + case3.getBrand());
        System.out.println("Case3 Model: " + case3.getModel());
        System.out.println("Case3 Material: " + case3.getMaterial());
        System.out.println("Case3 Color: " + case3.getColor());
        System.out.println("Case3 Waterproof: " + case3.isWaterproof());
        System.out.println("Case3 Price: ₹" + case3.getPrice());
        System.out.println("--------------------------------------------");

        MobileCase case4 = new MobileCase();
        case4.setCaseId(4);
        case4.setBrand("Caseology");
        case4.setModel("OnePlus 11");
        case4.setMaterial("Leather");
        case4.setColor("Brown");
        case4.setWaterproof(false);
        case4.setPrice(999.00);

        System.out.println("Case4 ID: " + case4.getCaseId());
        System.out.println("Case4 Brand: " + case4.getBrand());
        System.out.println("Case4 Model: " + case4.getModel());
        System.out.println("Case4 Material: " + case4.getMaterial());
        System.out.println("Case4 Color: " + case4.getColor());
        System.out.println("Case4 Waterproof: " + case4.isWaterproof());
        System.out.println("Case4 Price: ₹" + case4.getPrice());
        System.out.println("--------------------------------------------");

        MobileCase case5 = new MobileCase();
        case5.setCaseId(5);
        case5.setBrand("Urban Armor Gear");
        case5.setModel("iPhone 13 Mini");
        case5.setMaterial("Rubber");
        case5.setColor("Green");
        case5.setWaterproof(true);
        case5.setPrice(2099.00);

        System.out.println("Case5 ID: " + case5.getCaseId());
        System.out.println("Case5 Brand: " + case5.getBrand());
        System.out.println("Case5 Model: " + case5.getModel());
        System.out.println("Case5 Material: " + case5.getMaterial());
        System.out.println("Case5 Color: " + case5.getColor());
        System.out.println("Case5 Waterproof: " + case5.isWaterproof());
        System.out.println("Case5 Price: ₹" + case5.getPrice());
    }
}