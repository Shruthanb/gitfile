package com.xworkz.simcard;

public class Runner {
    public static void main(String[] args) {

        SimCard sim1 = new SimCard();
        sim1.setSimId(1);
        sim1.setNetworkProvider("Jio");
        sim1.setSimType("Nano");
        sim1.setMobileNumber("9876543210");
        sim1.setIsActive(true);
        sim1.setPlanType("Prepaid");
        sim1.setBalance(120.50);

        System.out.println("Sim1 ID: " + sim1.getSimId());
        System.out.println("Sim1 Network Provider: " + sim1.getNetworkProvider());
        System.out.println("Sim1 Sim Type: " + sim1.getSimType());
        System.out.println("Sim1 Mobile Number: " + sim1.getMobileNumber());
        System.out.println("Sim1 Active: " + sim1.getIsActive());
        System.out.println("Sim1 Plan Type: " + sim1.getPlanType());
        System.out.println("Sim1 Balance: ₹" + sim1.getBalance());
        System.out.println("--------------------------------------------");

        SimCard sim2 = new SimCard();
        sim2.setSimId(2);
        sim2.setNetworkProvider("Airtel");
        sim2.setSimType("Micro");
        sim2.setMobileNumber("9012345678");
        sim2.setIsActive(false);
        sim2.setPlanType("Postpaid");
        sim2.setBalance(0.00);

        System.out.println("Sim2 ID: " + sim2.getSimId());
        System.out.println("Sim2 Network Provider: " + sim2.getNetworkProvider());
        System.out.println("Sim2 Sim Type: " + sim2.getSimType());
        System.out.println("Sim2 Mobile Number: " + sim2.getMobileNumber());
        System.out.println("Sim2 Active: " + sim2.getIsActive());
        System.out.println("Sim2 Plan Type: " + sim2.getPlanType());
        System.out.println("Sim2 Balance: ₹" + sim2.getBalance());
        System.out.println("--------------------------------------------");

        SimCard sim3 = new SimCard();
        sim3.setSimId(3);
        sim3.setNetworkProvider("Vi");
        sim3.setSimType("Nano");
        sim3.setMobileNumber("9123456789");
        sim3.setIsActive(true);
        sim3.setPlanType("Prepaid");
        sim3.setBalance(75.00);

        System.out.println("Sim3 ID: " + sim3.getSimId());
        System.out.println("Sim3 Network Provider: " + sim3.getNetworkProvider());
        System.out.println("Sim3 Sim Type: " + sim3.getSimType());
        System.out.println("Sim3 Mobile Number: " + sim3.getMobileNumber());
        System.out.println("Sim3 Active: " + sim3.getIsActive());
        System.out.println("Sim3 Plan Type: " + sim3.getPlanType());
        System.out.println("Sim3 Balance: ₹" + sim3.getBalance());
        System.out.println("--------------------------------------------");

        SimCard sim4 = new SimCard();
        sim4.setSimId(4);
        sim4.setNetworkProvider("BSNL");
        sim4.setSimType("Standard");
        sim4.setMobileNumber("9876012345");
        sim4.setIsActive(true);
        sim4.setPlanType("Postpaid");
        sim4.setBalance(300.00);

        System.out.println("Sim4 ID: " + sim4.getSimId());
        System.out.println("Sim4 Network Provider: " + sim4.getNetworkProvider());
        System.out.println("Sim4 Sim Type: " + sim4.getSimType());
        System.out.println("Sim4 Mobile Number: " + sim4.getMobileNumber());
        System.out.println("Sim4 Active: " + sim4.getIsActive());
        System.out.println("Sim4 Plan Type: " + sim4.getPlanType());
        System.out.println("Sim4 Balance: ₹" + sim4.getBalance());
        System.out.println("--------------------------------------------");

        SimCard sim5 = new SimCard();
        sim5.setSimId(5);
        sim5.setNetworkProvider("Tata Docomo");
        sim5.setSimType("Micro");
        sim5.setMobileNumber("9898989898");
        sim5.setIsActive(false);
        sim5.setPlanType("Prepaid");
        sim5.setBalance(0.00);

        System.out.println("Sim5 ID: " + sim5.getSimId());
        System.out.println("Sim5 Network Provider: " + sim5.getNetworkProvider());
        System.out.println("Sim5 Sim Type: " + sim5.getSimType());
        System.out.println("Sim5 Mobile Number: " + sim5.getMobileNumber());
        System.out.println("Sim5 Active: " + sim5.getIsActive());
        System.out.println("Sim5 Plan Type: " + sim5.getPlanType());
        System.out.println("Sim5 Balance: ₹" + sim5.getBalance());

    }
}