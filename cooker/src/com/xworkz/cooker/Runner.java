package com.xworkz.cooker;

public class Runner {
    public static void main(String[] args) {

        Cooker cooker1 = new Cooker();
        cooker1.setCookerId(1);
        cooker1.setBrand("Prestige");
        cooker1.setCapacityInLiters(5.0);
        cooker1.setColor("Silver");
        cooker1.setPrice(2499.99);
        cooker1.setIsInductionCompatible(true);
        cooker1.setMaterial("Stainless Steel");

        System.out.println("Brand of cooker1 is " + cooker1.getBrand());
        System.out.println("Price of cooker1 is ₹" + cooker1.getPrice());
        System.out.println("Color of cooker1 is " + cooker1.getColor());
        System.out.println("Material of cooker1 is " + cooker1.getMaterial());
        System.out.println("Capacity of cooker1 is " + cooker1.getCapacityInLiters() + "L");
        System.out.println("Induction compatible of cooker1: " + cooker1.getIsInductionCompatible());
        System.out.println("ID of cooker1 is " + cooker1.getCookerId());
        System.out.println("------------------------------------------------------------");

        Cooker cooker2 = new Cooker();
        cooker2.setCookerId(2);
        cooker2.setBrand("Hawkins");
        cooker2.setCapacityInLiters(3.5);
        cooker2.setColor("Black");
        cooker2.setPrice(2199.50);
        cooker2.setIsInductionCompatible(false);
        cooker2.setMaterial("Aluminium");

        System.out.println("Brand of cooker2 is " + cooker2.getBrand());
        System.out.println("Price of cooker2 is ₹" + cooker2.getPrice());
        System.out.println("Color of cooker2 is " + cooker2.getColor());
        System.out.println("Material of cooker2 is " + cooker2.getMaterial());
        System.out.println("Capacity of cooker2 is " + cooker2.getCapacityInLiters() + "L");
        System.out.println("Induction compatible of cooker2: " + cooker2.getIsInductionCompatible());
        System.out.println("ID of cooker2 is " + cooker2.getCookerId());
        System.out.println("------------------------------------------------------------");

        Cooker cooker3 = new Cooker();
        cooker3.setCookerId(3);
        cooker3.setBrand("Butterfly");
        cooker3.setCapacityInLiters(4.0);
        cooker3.setColor("Red");
        cooker3.setPrice(1899.00);
        cooker3.setIsInductionCompatible(true);
        cooker3.setMaterial("Hard Anodized");

        System.out.println("Brand of cooker3 is " + cooker3.getBrand());
        System.out.println("Price of cooker3 is ₹" + cooker3.getPrice());
        System.out.println("Color of cooker3 is " + cooker3.getColor());
        System.out.println("Material of cooker3 is " + cooker3.getMaterial());
        System.out.println("Capacity of cooker3 is " + cooker3.getCapacityInLiters() + "L");
        System.out.println("Induction compatible of cooker3: " + cooker3.getIsInductionCompatible());
        System.out.println("ID of cooker3 is " + cooker3.getCookerId());
        System.out.println("------------------------------------------------------------");

        Cooker cooker4 = new Cooker();
        cooker4.setCookerId(4);
        cooker4.setBrand("Pigeon");
        cooker4.setCapacityInLiters(2.5);
        cooker4.setColor("Grey");
        cooker4.setPrice(1599.75);
        cooker4.setIsInductionCompatible(false);
        cooker4.setMaterial("Aluminium");

        System.out.println("Brand of cooker4 is " + cooker4.getBrand());
        System.out.println("Price of cooker4 is ₹" + cooker4.getPrice());
        System.out.println("Color of cooker4 is " + cooker4.getColor());
        System.out.println("Material of cooker4 is " + cooker4.getMaterial());
        System.out.println("Capacity of cooker4 is " + cooker4.getCapacityInLiters() + "L");
        System.out.println("Induction compatible of cooker4: " + cooker4.getIsInductionCompatible());
        System.out.println("ID of cooker4 is " + cooker4.getCookerId());
        System.out.println("------------------------------------------------------------");

        Cooker cooker5 = new Cooker();
        cooker5.setCookerId(5);
        cooker5.setBrand("Milton");
        cooker5.setCapacityInLiters(6.0);
        cooker5.setColor("White");
        cooker5.setPrice(2799.99);
        cooker5.setIsInductionCompatible(true);
        cooker5.setMaterial("Stainless Steel");

        System.out.println("Brand of cooker5 is " + cooker5.getBrand());
        System.out.println("Price of cooker5 is ₹" + cooker5.getPrice());
        System.out.println("Color of cooker5 is " + cooker5.getColor());
        System.out.println("Material of cooker5 is " + cooker5.getMaterial());
        System.out.println("Capacity of cooker5 is " + cooker5.getCapacityInLiters() + "L");
        System.out.println("Induction compatible of cooker5: " + cooker5.getIsInductionCompatible());
        System.out.println("ID of cooker5 is " + cooker5.getCookerId());
        System.out.println("------------------------------------------------------------");
    }
    }
