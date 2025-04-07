package com.xworkz.festival;

public class Runner {
    public static void main(String[] args) {

        Festival f1 = new Festival();
        f1.setFestivalId(1);
        f1.setName("Diwali");
        f1.setCountry("India");
        f1.setMonth("October");
        f1.setDurationInDays(5);
        f1.setIsNationalHoliday(true);
        f1.setMainAttraction("Firecrackers and Lights");

        System.out.println("Festival 1 ID: " + f1.getFestivalId());
        System.out.println("Name: " + f1.getName());
        System.out.println("Country: " + f1.getCountry());
        System.out.println("Month: " + f1.getMonth());
        System.out.println("Duration (days): " + f1.getDurationInDays());
        System.out.println("National Holiday: " + f1.getIsNationalHoliday());
        System.out.println("Main Attraction: " + f1.getMainAttraction());
        System.out.println("--------------------------------------------");

        Festival f2 = new Festival();
        f2.setFestivalId(2);
        f2.setName("Christmas");
        f2.setCountry("USA");
        f2.setMonth("December");
        f2.setDurationInDays(1);
        f2.setIsNationalHoliday(true);
        f2.setMainAttraction("Santa Claus and Decorations");

        System.out.println("Festival 2 ID: " + f2.getFestivalId());
        System.out.println("Name: " + f2.getName());
        System.out.println("Country: " + f2.getCountry());
        System.out.println("Month: " + f2.getMonth());
        System.out.println("Duration (days): " + f2.getDurationInDays());
        System.out.println("National Holiday: " + f2.getIsNationalHoliday());
        System.out.println("Main Attraction: " + f2.getMainAttraction());
        System.out.println("--------------------------------------------");

        Festival f3 = new Festival();
        f3.setFestivalId(3);
        f3.setName("Eid");
        f3.setCountry("Saudi Arabia");
        f3.setMonth("April");
        f3.setDurationInDays(3);
        f3.setIsNationalHoliday(true);
        f3.setMainAttraction("Prayers and Feasts");

        System.out.println("Festival 3 ID: " + f3.getFestivalId());
        System.out.println("Name: " + f3.getName());
        System.out.println("Country: " + f3.getCountry());
        System.out.println("Month: " + f3.getMonth());
        System.out.println("Duration (days): " + f3.getDurationInDays());
        System.out.println("National Holiday: " + f3.getIsNationalHoliday());
        System.out.println("Main Attraction: " + f3.getMainAttraction());
        System.out.println("--------------------------------------------");

        Festival f4 = new Festival();
        f4.setFestivalId(4);
        f4.setName("Thanksgiving");
        f4.setCountry("Canada");
        f4.setMonth("October");
        f4.setDurationInDays(1);
        f4.setIsNationalHoliday(true);
        f4.setMainAttraction("Family Dinners and Turkey");

        System.out.println("Festival 4 ID: " + f4.getFestivalId());
        System.out.println("Name: " + f4.getName());
        System.out.println("Country: " + f4.getCountry());
        System.out.println("Month: " + f4.getMonth());
        System.out.println("Duration (days): " + f4.getDurationInDays());
        System.out.println("National Holiday: " + f4.getIsNationalHoliday());
        System.out.println("Main Attraction: " + f4.getMainAttraction());
        System.out.println("--------------------------------------------");

        Festival f5 = new Festival();
        f5.setFestivalId(5);
        f5.setName("Holi");
        f5.setCountry("India");
        f5.setMonth("March");
        f5.setDurationInDays(2);
        f5.setIsNationalHoliday(true);
        f5.setMainAttraction("Colors and Music");

        System.out.println("Festival 5 ID: " + f5.getFestivalId());
        System.out.println("Name: " + f5.getName());
        System.out.println("Country: " + f5.getCountry());
        System.out.println("Month: " + f5.getMonth());
        System.out.println("Duration (days): " + f5.getDurationInDays());
        System.out.println("National Holiday: " + f5.getIsNationalHoliday());
        System.out.println("Main Attraction: " + f5.getMainAttraction());
    }
}
