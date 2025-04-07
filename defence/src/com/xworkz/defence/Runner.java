package com.xworkz.defence;

public class Runner {
    public static void main(String[] args) {
        Defence d1 = new Defence();
        d1.setDefenceId(1);
        d1.setCountry("India");
        d1.setSoldiers(1400000);
        d1.setBranch("Army");
        d1.setBudget(76.6);
        d1.setHeadquarters("New Delhi");
        d1.setIsNuclearPower(true);

        System.out.println("Defence 1 ID: " + d1.getDefenceId());
        System.out.println("Country: " + d1.getCountry());
        System.out.println("Soldiers: " + d1.getSoldiers());
        System.out.println("Branch: " + d1.getBranch());
        System.out.println("Budget (in billion USD): " + d1.getBudget());
        System.out.println("Headquarters: " + d1.getHeadquarters());
        System.out.println("Is Nuclear Power: " + d1.getIsNuclearPower());
        System.out.println("--------------------------------------------");

        Defence d2 = new Defence();
        d2.setDefenceId(2);
        d2.setCountry("USA");
        d2.setSoldiers(1300000);
        d2.setBranch("Navy");
        d2.setBudget(877.0);
        d2.setHeadquarters("Pentagon");
        d2.setIsNuclearPower(true);

        System.out.println("Defence 2 ID: " + d2.getDefenceId());
        System.out.println("Country: " + d2.getCountry());
        System.out.println("Soldiers: " + d2.getSoldiers());
        System.out.println("Branch: " + d2.getBranch());
        System.out.println("Budget (in billion USD): " + d2.getBudget());
        System.out.println("Headquarters: " + d2.getHeadquarters());
        System.out.println("Is Nuclear Power: " + d2.getIsNuclearPower());
        System.out.println("--------------------------------------------");

        Defence d3 = new Defence();
        d3.setDefenceId(3);
        d3.setCountry("Russia");
        d3.setSoldiers(1000000);
        d3.setBranch("Air Force");
        d3.setBudget(86.4);
        d3.setHeadquarters("Moscow");
        d3.setIsNuclearPower(true);

        System.out.println("Defence 3 ID: " + d3.getDefenceId());
        System.out.println("Country: " + d3.getCountry());
        System.out.println("Soldiers: " + d3.getSoldiers());
        System.out.println("Branch: " + d3.getBranch());
        System.out.println("Budget (in billion USD): " + d3.getBudget());
        System.out.println("Headquarters: " + d3.getHeadquarters());
        System.out.println("Is Nuclear Power: " + d3.getIsNuclearPower());
        System.out.println("--------------------------------------------");

        Defence d4 = new Defence();
        d4.setDefenceId(4);
        d4.setCountry("China");
        d4.setSoldiers(2000000);
        d4.setBranch("Army");
        d4.setBudget(292.0);
        d4.setHeadquarters("Beijing");
        d4.setIsNuclearPower(true);

        System.out.println("Defence 4 ID: " + d4.getDefenceId());
        System.out.println("Country: " + d4.getCountry());
        System.out.println("Soldiers: " + d4.getSoldiers());
        System.out.println("Branch: " + d4.getBranch());
        System.out.println("Budget (in billion USD): " + d4.getBudget());
        System.out.println("Headquarters: " + d4.getHeadquarters());
        System.out.println("Is Nuclear Power: " + d4.getIsNuclearPower());
        System.out.println("--------------------------------------------");

        Defence d5 = new Defence();
        d5.setDefenceId(5);
        d5.setCountry("France");
        d5.setSoldiers(270000);
        d5.setBranch("Navy");
        d5.setBudget(56.0);
        d5.setHeadquarters("Paris");
        d5.setIsNuclearPower(true);

        System.out.println("Defence 5 ID: " + d5.getDefenceId());
        System.out.println("Country: " + d5.getCountry());
        System.out.println("Soldiers: " + d5.getSoldiers());
        System.out.println("Branch: " + d5.getBranch());
        System.out.println("Budget (in billion USD): " + d5.getBudget());
        System.out.println("Headquarters: " + d5.getHeadquarters());
        System.out.println("Is Nuclear Power: " + d5.getIsNuclearPower());

    }
}
