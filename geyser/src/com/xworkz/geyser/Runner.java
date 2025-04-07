package com.xworkz.geyser;

public class Runner {




    public static void main(String[] args) {

        Geyser g1 = new Geyser();
        g1.setGeyserId(1);
        g1.setBrand("Bajaj");
        g1.setCapacityInLiters(25.0);
        g1.setColor("White");
        g1.setPowerInWatts(2000);
        g1.setIsAutomatic(true);
        g1.setPrice(4999.99);

        System.out.println("Geyser 1 ID: " + g1.getGeyserId());
        System.out.println("Brand: " + g1.getBrand());
        System.out.println("Capacity: " + g1.getCapacityInLiters() + " L");
        System.out.println("Color: " + g1.getColor());
        System.out.println("Power: " + g1.getPowerInWatts() + " W");
        System.out.println("Automatic: " + g1.getIsAutomatic());
        System.out.println("Price: ₹" + g1.getPrice());
        System.out.println("--------------------------------------------");

        Geyser g2 = new Geyser();
        g2.setGeyserId(2);
        g2.setBrand("AO Smith");
        g2.setCapacityInLiters(15.0);
        g2.setColor("Grey");
        g2.setPowerInWatts(3000);
        g2.setIsAutomatic(true);
        g2.setPrice(6299.00);

        System.out.println("Geyser 2 ID: " + g2.getGeyserId());
        System.out.println("Brand: " + g2.getBrand());
        System.out.println("Capacity: " + g2.getCapacityInLiters() + " L");
        System.out.println("Color: " + g2.getColor());
        System.out.println("Power: " + g2.getPowerInWatts() + " W");
        System.out.println("Automatic: " + g2.getIsAutomatic());
        System.out.println("Price: ₹" + g2.getPrice());
        System.out.println("--------------------------------------------");

        Geyser g3 = new Geyser();
        g3.setGeyserId(3);
        g3.setBrand("Havells");
        g3.setCapacityInLiters(10.0);
        g3.setColor("Ivory");
        g3.setPowerInWatts(1500);
        g3.setIsAutomatic(false);
        g3.setPrice(3999.50);

        System.out.println("Geyser 3 ID: " + g3.getGeyserId());
        System.out.println("Brand: " + g3.getBrand());
        System.out.println("Capacity: " + g3.getCapacityInLiters() + " L");
        System.out.println("Color: " + g3.getColor());
        System.out.println("Power: " + g3.getPowerInWatts() + " W");
        System.out.println("Automatic: " + g3.getIsAutomatic());
        System.out.println("Price: ₹" + g3.getPrice());
        System.out.println("--------------------------------------------");

        Geyser g4 = new Geyser();
        g4.setGeyserId(4);
        g4.setBrand("V-Guard");
        g4.setCapacityInLiters(20.0);
        g4.setColor("Silver");
        g4.setPowerInWatts(2500);
        g4.setIsAutomatic(true);
        g4.setPrice(5799.00);

        System.out.println("Geyser 4 ID: " + g4.getGeyserId());
        System.out.println("Brand: " + g4.getBrand());
        System.out.println("Capacity: " + g4.getCapacityInLiters() + " L");
        System.out.println("Color: " + g4.getColor());
        System.out.println("Power: " + g4.getPowerInWatts() + " W");
        System.out.println("Automatic: " + g4.getIsAutomatic());
        System.out.println("Price: ₹" + g4.getPrice());
        System.out.println("--------------------------------------------");

        Geyser g5 = new Geyser();
        g5.setGeyserId(5);
        g5.setBrand("Racold");
        g5.setCapacityInLiters(30.0);
        g5.setColor("Black");
        g5.setPowerInWatts(3500);
        g5.setIsAutomatic(true);
        g5.setPrice(6999.99);

        System.out.println("Geyser 5 ID: " + g5.getGeyserId());
        System.out.println("Brand: " + g5.getBrand());
        System.out.println("Capacity: " + g5.getCapacityInLiters() + " L");
        System.out.println("Color: " + g5.getColor());
        System.out.println("Power: " + g5.getPowerInWatts() + " W");
        System.out.println("Automatic: " + g5.getIsAutomatic());
        System.out.println("Price: ₹" + g5.getPrice());
    }
}
