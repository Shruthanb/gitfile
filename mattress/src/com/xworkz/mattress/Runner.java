package com.xworkz.mattress;

public class Runner {
    public static void main(String[] args) {

        Mattress mattress1 = new Mattress();
        mattress1.setMattressId(1);
        mattress1.setBrand("Sleepwell");
        mattress1.setType("Memory Foam");
        mattress1.setSize("Queen");
        mattress1.setThickness(6.0);
        mattress1.setMaterial("Foam");
        mattress1.setPrice(8500.00);

        System.out.println("Mattress1 ID: " + mattress1.getMattressId());
        System.out.println("Mattress1 Brand: " + mattress1.getBrand());
        System.out.println("Mattress1 Type: " + mattress1.getType());
        System.out.println("Mattress1 Size: " + mattress1.getSize());
        System.out.println("Mattress1 Thickness: " + mattress1.getThickness() + " inches");
        System.out.println("Mattress1 Material: " + mattress1.getMaterial());
        System.out.println("Mattress1 Price: ₹" + mattress1.getPrice());
        System.out.println("--------------------------------------------");

        Mattress mattress2 = new Mattress();
        mattress2.setMattressId(2);
        mattress2.setBrand("Wakefit");
        mattress2.setType("Orthopedic");
        mattress2.setSize("King");
        mattress2.setThickness(8.0);
        mattress2.setMaterial("Foam");
        mattress2.setPrice(11500.00);

        System.out.println("Mattress2 ID: " + mattress2.getMattressId());
        System.out.println("Mattress2 Brand: " + mattress2.getBrand());
        System.out.println("Mattress2 Type: " + mattress2.getType());
        System.out.println("Mattress2 Size: " + mattress2.getSize());
        System.out.println("Mattress2 Thickness: " + mattress2.getThickness() + " inches");
        System.out.println("Mattress2 Material: " + mattress2.getMaterial());
        System.out.println("Mattress2 Price: ₹" + mattress2.getPrice());
        System.out.println("--------------------------------------------");

        Mattress mattress3 = new Mattress();
        mattress3.setMattressId(3);
        mattress3.setBrand("Kurlon");
        mattress3.setType("Coir");
        mattress3.setSize("Single");
        mattress3.setThickness(5.0);
        mattress3.setMaterial("Coir");
        mattress3.setPrice(6200.00);

        System.out.println("Mattress3 ID: " + mattress3.getMattressId());
        System.out.println("Mattress3 Brand: " + mattress3.getBrand());
        System.out.println("Mattress3 Type: " + mattress3.getType());
        System.out.println("Mattress3 Size: " + mattress3.getSize());
        System.out.println("Mattress3 Thickness: " + mattress3.getThickness() + " inches");
        System.out.println("Mattress3 Material: " + mattress3.getMaterial());
        System.out.println("Mattress3 Price: ₹" + mattress3.getPrice());
        System.out.println("--------------------------------------------");

        Mattress mattress4 = new Mattress();
        mattress4.setMattressId(4);
        mattress4.setBrand("Duroflex");
        mattress4.setType("Latex");
        mattress4.setSize("Queen");
        mattress4.setThickness(7.5);
        mattress4.setMaterial("Natural Latex");
        mattress4.setPrice(9800.00);

        System.out.println("Mattress4 ID: " + mattress4.getMattressId());
        System.out.println("Mattress4 Brand: " + mattress4.getBrand());
        System.out.println("Mattress4 Type: " + mattress4.getType());
        System.out.println("Mattress4 Size: " + mattress4.getSize());
        System.out.println("Mattress4 Thickness: " + mattress4.getThickness() + " inches");
        System.out.println("Mattress4 Material: " + mattress4.getMaterial());
        System.out.println("Mattress4 Price: ₹" + mattress4.getPrice());
        System.out.println("--------------------------------------------");

        Mattress mattress5 = new Mattress();
        mattress5.setMattressId(5);
        mattress5.setBrand("Peps");
        mattress5.setType("Spring");
        mattress5.setSize("King");
        mattress5.setThickness(9.0);
        mattress5.setMaterial("Pocket Spring");
        mattress5.setPrice(12200.00);

        System.out.println("Mattress5 ID: " + mattress5.getMattressId());
        System.out.println("Mattress5 Brand: " + mattress5.getBrand());
        System.out.println("Mattress5 Type: " + mattress5.getType());
        System.out.println("Mattress5 Size: " + mattress5.getSize());
        System.out.println("Mattress5 Thickness: " + mattress5.getThickness() + " inches");
        System.out.println("Mattress5 Material: " + mattress5.getMaterial());
        System.out.println("Mattress5 Price: ₹" + mattress5.getPrice());
    }
}
