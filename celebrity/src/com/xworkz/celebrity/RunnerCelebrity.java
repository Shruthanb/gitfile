package com.xworkz.celebrity;

public class RunnerCelebrity {
    public static void main(String[] args) {

        Celebrity c1 = new Celebrity();
        c1.setCelebrityId(1);
        c1.setName("Shah Rukh Khan");
        c1.setAge(58);
        c1.setProfession("Actor");
        c1.setNationality("Indian");
        c1.setNetWorth(770.5);
        c1.setIsActive(true);

        System.out.println("Celebrity 1 ID: " + c1.getCelebrityId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Age: " + c1.getAge());
        System.out.println("Profession: " + c1.getProfession());
        System.out.println("Nationality: " + c1.getNationality());
        System.out.println("Net Worth (in millions): " + c1.getNetWorth());
        System.out.println("Is Active: " + c1.getIsActive());
        System.out.println("--------------------------------------------");

        Celebrity c2 = new Celebrity();
        c2.setCelebrityId(2);
        c2.setName("Taylor Swift");
        c2.setAge(34);
        c2.setProfession("Singer");
        c2.setNationality("American");
        c2.setNetWorth(1200.0);
        c2.setIsActive(true);

        System.out.println("Celebrity 2 ID: " + c2.getCelebrityId());
        System.out.println("Name: " + c2.getName());
        System.out.println("Age: " + c2.getAge());
        System.out.println("Profession: " + c2.getProfession());
        System.out.println("Nationality: " + c2.getNationality());
        System.out.println("Net Worth (in millions): " + c2.getNetWorth());
        System.out.println("Is Active: " + c2.getIsActive());
        System.out.println("--------------------------------------------");

        Celebrity c3 = new Celebrity();
        c3.setCelebrityId(3);
        c3.setName("Lionel Messi");
        c3.setAge(37);
        c3.setProfession("Footballer");
        c3.setNationality("Argentinian");
        c3.setNetWorth(600.0);
        c3.setIsActive(true);

        System.out.println("Celebrity 3 ID: " + c3.getCelebrityId());
        System.out.println("Name: " + c3.getName());
        System.out.println("Age: " + c3.getAge());
        System.out.println("Profession: " + c3.getProfession());
        System.out.println("Nationality: " + c3.getNationality());
        System.out.println("Net Worth (in millions): " + c3.getNetWorth());
        System.out.println("Is Active: " + c3.getIsActive());
        System.out.println("--------------------------------------------");

        Celebrity c4 = new Celebrity();
        c4.setCelebrityId(4);
        c4.setName("Amitabh Bachchan");
        c4.setAge(82);
        c4.setProfession("Actor");
        c4.setNationality("Indian");
        c4.setNetWorth(410.0);
        c4.setIsActive(true);

        System.out.println("Celebrity 4 ID: " + c4.getCelebrityId());
        System.out.println("Name: " + c4.getName());
        System.out.println("Age: " + c4.getAge());
        System.out.println("Profession: " + c4.getProfession());
        System.out.println("Nationality: " + c4.getNationality());
        System.out.println("Net Worth (in millions): " + c4.getNetWorth());
        System.out.println("Is Active: " + c4.getIsActive());
        System.out.println("--------------------------------------------");

        Celebrity c5 = new Celebrity();
        c5.setCelebrityId(5);
        c5.setName("Emma Watson");
        c5.setAge(34);
        c5.setProfession("Actress");
        c5.setNationality("British");
        c5.setNetWorth(90.0);
        c5.setIsActive(false);

        System.out.println("Celebrity 5 ID: " + c5.getCelebrityId());
        System.out.println("Name: " + c5.getName());
        System.out.println("Age: " + c5.getAge());
        System.out.println("Profession: " + c5.getProfession());
        System.out.println("Nationality: " + c5.getNationality());
        System.out.println("Net Worth (in millions): " + c5.getNetWorth());
        System.out.println("Is Active: " + c5.getIsActive());


    }
}
