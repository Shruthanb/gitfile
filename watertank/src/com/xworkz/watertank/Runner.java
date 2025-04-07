package com.xworkz.watertank;

public class Runner {

    public static void main(String[] args) {

        WaterTank tank1 = new WaterTank();
        tank1.setTankId(1);
        tank1.setBrand("Sintex");
        tank1.setColor("Black");
        tank1.setShape("Cylindrical");
        tank1.setMaterial("Plastic");
        tank1.setCapacity(1000.0);
        tank1.setPrice(4500.00);

        System.out.println("Tank1 ID: " + tank1.getTankId());
        System.out.println("Tank1 Brand: " + tank1.getBrand());
        System.out.println("Tank1 Color: " + tank1.getColor());
        System.out.println("Tank1 Shape: " + tank1.getShape());
        System.out.println("Tank1 Material: " + tank1.getMaterial());
        System.out.println("Tank1 Capacity: " + tank1.getCapacity() + " L");
        System.out.println("Tank1 Price: ₹" + tank1.getPrice());
        System.out.println("--------------------------------------------");

        WaterTank tank2 = new WaterTank();
        tank2.setTankId(2);
        tank2.setBrand("Supreme");
        tank2.setColor("White");
        tank2.setShape("Square");
        tank2.setMaterial("HDPE");
        tank2.setCapacity(1500.0);
        tank2.setPrice(6200.00);

        System.out.println("Tank2 ID: " + tank2.getTankId());
        System.out.println("Tank2 Brand: " + tank2.getBrand());
        System.out.println("Tank2 Color: " + tank2.getColor());
        System.out.println("Tank2 Shape: " + tank2.getShape());
        System.out.println("Tank2 Material: " + tank2.getMaterial());
        System.out.println("Tank2 Capacity: " + tank2.getCapacity() + " L");
        System.out.println("Tank2 Price: ₹" + tank2.getPrice());
        System.out.println("--------------------------------------------");

        WaterTank tank3 = new WaterTank();
        tank3.setTankId(3);
        tank3.setBrand("Ashirvad");
        tank3.setColor("Green");
        tank3.setShape("Round");
        tank3.setMaterial("Plastic");
        tank3.setCapacity(750.0);
        tank3.setPrice(3200.00);

        System.out.println("Tank3 ID: " + tank3.getTankId());
        System.out.println("Tank3 Brand: " + tank3.getBrand());
        System.out.println("Tank3 Color: " + tank3.getColor());
        System.out.println("Tank3 Shape: " + tank3.getShape());
        System.out.println("Tank3 Material: " + tank3.getMaterial());
        System.out.println("Tank3 Capacity: " + tank3.getCapacity() + " L");
        System.out.println("Tank3 Price: ₹" + tank3.getPrice());
        System.out.println("--------------------------------------------");

        WaterTank tank4 = new WaterTank();
        tank4.setTankId(4);
        tank4.setBrand("Vectus");
        tank4.setColor("Blue");
        tank4.setShape("Rectangular");
        tank4.setMaterial("Plastic");
        tank4.setCapacity(2000.0);
        tank4.setPrice(7800.00);

        System.out.println("Tank4 ID: " + tank4.getTankId());
        System.out.println("Tank4 Brand: " + tank4.getBrand());
        System.out.println("Tank4 Color: " + tank4.getColor());
        System.out.println("Tank4 Shape: " + tank4.getShape());
        System.out.println("Tank4 Material: " + tank4.getMaterial());
        System.out.println("Tank4 Capacity: " + tank4.getCapacity() + " L");
        System.out.println("Tank4 Price: ₹" + tank4.getPrice());
        System.out.println("--------------------------------------------");

        WaterTank tank5 = new WaterTank();
        tank5.setTankId(5);
        tank5.setBrand("Storewel");
        tank5.setColor("Yellow");
        tank5.setShape("Cylindrical");
        tank5.setMaterial("LLDPE");
        tank5.setCapacity(500.0);
        tank5.setPrice(2400.00);

        System.out.println("Tank5 ID: " + tank5.getTankId());
        System.out.println("Tank5 Brand: " + tank5.getBrand());
        System.out.println("Tank5 Color: " + tank5.getColor());
        System.out.println("Tank5 Shape: " + tank5.getShape());
        System.out.println("Tank5 Material: " + tank5.getMaterial());
        System.out.println("Tank5 Capacity: " + tank5.getCapacity() + " L");
        System.out.println("Tank5 Price: ₹" + tank5.getPrice());
    }
    }

