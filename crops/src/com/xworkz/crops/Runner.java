package com.xworkz.crops;

public class Runner {
    public static void main(String[] args) {

        Crops crop1 = new Crops();
        crop1.setCropId(1);
        crop1.setName("Wheat");
        crop1.setSeason("Rabi");
        crop1.setType("Cereal");
        crop1.setSoilType("Loamy");
        crop1.setPricePerKg(25.50);
        crop1.setOrigin("Punjab");

        System.out.println("Crop1 ID: " + crop1.getCropId());
        System.out.println("Crop1 Name: " + crop1.getName());
        System.out.println("Crop1 Season: " + crop1.getSeason());
        System.out.println("Crop1 Type: " + crop1.getType());
        System.out.println("Crop1 Soil Type: " + crop1.getSoilType());
        System.out.println("Crop1 Price per Kg: ₹" + crop1.getPricePerKg());
        System.out.println("Crop1 Origin: " + crop1.getOrigin());
        System.out.println("--------------------------------------------");

        Crops crop2 = new Crops();
        crop2.setCropId(2);
        crop2.setName("Paddy");
        crop2.setSeason("Kharif");
        crop2.setType("Cereal");
        crop2.setSoilType("Clayey");
        crop2.setPricePerKg(22.00);
        crop2.setOrigin("West Bengal");

        System.out.println("Crop2 ID: " + crop2.getCropId());
        System.out.println("Crop2 Name: " + crop2.getName());
        System.out.println("Crop2 Season: " + crop2.getSeason());
        System.out.println("Crop2 Type: " + crop2.getType());
        System.out.println("Crop2 Soil Type: " + crop2.getSoilType());
        System.out.println("Crop2 Price per Kg: ₹" + crop2.getPricePerKg());
        System.out.println("Crop2 Origin: " + crop2.getOrigin());
        System.out.println("--------------------------------------------");

        Crops crop3 = new Crops();
        crop3.setCropId(3);
        crop3.setName("Cotton");
        crop3.setSeason("Kharif");
        crop3.setType("Cash Crop");
        crop3.setSoilType("Black Soil");
        crop3.setPricePerKg(60.75);
        crop3.setOrigin("Maharashtra");

        System.out.println("Crop3 ID: " + crop3.getCropId());
        System.out.println("Crop3 Name: " + crop3.getName());
        System.out.println("Crop3 Season: " + crop3.getSeason());
        System.out.println("Crop3 Type: " + crop3.getType());
        System.out.println("Crop3 Soil Type: " + crop3.getSoilType());
        System.out.println("Crop3 Price per Kg: ₹" + crop3.getPricePerKg());
        System.out.println("Crop3 Origin: " + crop3.getOrigin());
        System.out.println("--------------------------------------------");

        Crops crop4 = new Crops();
        crop4.setCropId(4);
        crop4.setName("Sugarcane");
        crop4.setSeason("Annual");
        crop4.setType("Commercial");
        crop4.setSoilType("Alluvial");
        crop4.setPricePerKg(14.00);
        crop4.setOrigin("Uttar Pradesh");

        System.out.println("Crop4 ID: " + crop4.getCropId());
        System.out.println("Crop4 Name: " + crop4.getName());
        System.out.println("Crop4 Season: " + crop4.getSeason());
        System.out.println("Crop4 Type: " + crop4.getType());
        System.out.println("Crop4 Soil Type: " + crop4.getSoilType());
        System.out.println("Crop4 Price per Kg: ₹" + crop4.getPricePerKg());
        System.out.println("Crop4 Origin: " + crop4.getOrigin());
        System.out.println("--------------------------------------------");

        Crops crop5 = new Crops();
        crop5.setCropId(5);
        crop5.setName("Maize");
        crop5.setSeason("Zaid");
        crop5.setType("Cereal");
        crop5.setSoilType("Well-drained");
        crop5.setPricePerKg(18.25);
        crop5.setOrigin("Karnataka");

        System.out.println("Crop5 ID: " + crop5.getCropId());
        System.out.println("Crop5 Name: " + crop5.getName());
        System.out.println("Crop5 Season: " + crop5.getSeason());
        System.out.println("Crop5 Type: " + crop5.getType());
        System.out.println("Crop5 Soil Type: " + crop5.getSoilType());
        System.out.println("Crop5 Price per Kg: ₹" + crop5.getPricePerKg());
        System.out.println("Crop5 Origin: " + crop5.getOrigin());
    }
    }
