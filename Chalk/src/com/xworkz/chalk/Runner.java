package com.xworkz.chalk;

public class Runner {

    public static void main(String[] args) {

        Chalk chalk1 = new Chalk();
        chalk1.setChalkId(1);
        chalk1.setBrand("Camel");
        chalk1.setColor("White");
        chalk1.setShape("Cylindrical");
        chalk1.setMaterial("Calcium Carbonate");
        chalk1.setDustFree(true);
        chalk1.setPrice(50.00);

        System.out.println("Chalk1 ID: " + chalk1.getChalkId());
        System.out.println("Chalk1 Brand: " + chalk1.getBrand());
        System.out.println("Chalk1 Color: " + chalk1.getColor());
        System.out.println("Chalk1 Shape: " + chalk1.getShape());
        System.out.println("Chalk1 Material: " + chalk1.getMaterial());
        System.out.println("Chalk1 Dust Free: " + chalk1.isDustFree());
        System.out.println("Chalk1 Price: ₹" + chalk1.getPrice());
        System.out.println("--------------------------------------------");

        Chalk chalk2 = new Chalk();
        chalk2.setChalkId(2);
        chalk2.setBrand("Apsara");
        chalk2.setColor("Yellow");
        chalk2.setShape("Rectangle");
        chalk2.setMaterial("Gypsum");
        chalk2.setDustFree(false);
        chalk2.setPrice(45.00);

        System.out.println("Chalk2 ID: " + chalk2.getChalkId());
        System.out.println("Chalk2 Brand: " + chalk2.getBrand());
        System.out.println("Chalk2 Color: " + chalk2.getColor());
        System.out.println("Chalk2 Shape: " + chalk2.getShape());
        System.out.println("Chalk2 Material: " + chalk2.getMaterial());
        System.out.println("Chalk2 Dust Free: " + chalk2.isDustFree());
        System.out.println("Chalk2 Price: ₹" + chalk2.getPrice());
        System.out.println("--------------------------------------------");

        Chalk chalk3 = new Chalk();
        chalk3.setChalkId(3);
        chalk3.setBrand("Natraj");
        chalk3.setColor("Blue");
        chalk3.setShape("Cylindrical");
        chalk3.setMaterial("Calcium Sulphate");
        chalk3.setDustFree(true);
        chalk3.setPrice(55.00);

        System.out.println("Chalk3 ID: " + chalk3.getChalkId());
        System.out.println("Chalk3 Brand: " + chalk3.getBrand());
        System.out.println("Chalk3 Color: " + chalk3.getColor());
        System.out.println("Chalk3 Shape: " + chalk3.getShape());
        System.out.println("Chalk3 Material: " + chalk3.getMaterial());
        System.out.println("Chalk3 Dust Free: " + chalk3.isDustFree());
        System.out.println("Chalk3 Price: ₹" + chalk3.getPrice());
        System.out.println("--------------------------------------------");

        Chalk chalk4 = new Chalk();
        chalk4.setChalkId(4);
        chalk4.setBrand("Faber-Castell");
        chalk4.setColor("Pink");
        chalk4.setShape("Triangular");
        chalk4.setMaterial("Dustless Compound");
        chalk4.setDustFree(true);
        chalk4.setPrice(60.00);

        System.out.println("Chalk4 ID: " + chalk4.getChalkId());
        System.out.println("Chalk4 Brand: " + chalk4.getBrand());
        System.out.println("Chalk4 Color: " + chalk4.getColor());
        System.out.println("Chalk4 Shape: " + chalk4.getShape());
        System.out.println("Chalk4 Material: " + chalk4.getMaterial());
        System.out.println("Chalk4 Dust Free: " + chalk4.isDustFree());
        System.out.println("Chalk4 Price: ₹" + chalk4.getPrice());
        System.out.println("--------------------------------------------");

        Chalk chalk5 = new Chalk();
        chalk5.setChalkId(5);
        chalk5.setBrand("Classmate");
        chalk5.setColor("Green");
        chalk5.setShape("Round");
        chalk5.setMaterial("Natural Chalk");
        chalk5.setDustFree(false);
        chalk5.setPrice(40.00);

        System.out.println("Chalk5 ID: " + chalk5.getChalkId());
        System.out.println("Chalk5 Brand: " + chalk5.getBrand());
        System.out.println("Chalk5 Color: " + chalk5.getColor());
        System.out.println("Chalk5 Shape: " + chalk5.getShape());
        System.out.println("Chalk5 Material: " + chalk5.getMaterial());
        System.out.println("Chalk5 Dust Free: " + chalk5.isDustFree());
        System.out.println("Chalk5 Price: ₹" + chalk5.getPrice());
    }

}

