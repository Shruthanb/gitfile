package com.xworkz.majige;

public class Runner {

    public static void main(String[] args) {
        System.out.println("the main is started");
        System.out.println(" ");
             Majige ref=new Majige();
             ref.setMajigeid(1);
             ref.setBrandname("kmf");
             ref.setPrice(10.00);
             ref.setSpices("bay leaves");

             int majigeid= ref.getMajigeid();
             String brandname=ref.getBrandname();
             double majigeprice=ref.getPrice();
             String spices= ref.getSpices();

        System.out.println(" the mjige id is="+majigeid);
        System.out.println("the brand name is ="+brandname);
        System.out.println("the price is="+majigeprice);
        System.out.println("the spices is ="+spices);
        System.out.println(" ");

        Majige ref1=new Majige();
        ref1.setMajigeid(2);
        ref1.setBrandname("vijay");
        ref1.setPrice(20.00);
        ref1.setSpices("cardamom");

        int majigeid1= ref1.getMajigeid();
        String brandname1=ref1.getBrandname();
        double majigeprice1=ref1.getPrice();
        String spices1= ref1.getSpices();

        System.out.println(" the mjige id is="+majigeid1);
        System.out.println("the brand name is ="+brandname1);
        System.out.println("the price is="+majigeprice1);
        System.out.println("the spices is ="+spices1);
        System.out.println(" ");

        Majige ref2=new Majige();
        ref2.setMajigeid(3);
        ref2.setBrandname("nandini");
        ref2.setPrice(30.00);
        ref2.setSpices("cloves");

        int majigeid2= ref2.getMajigeid();
        String brandname2=ref2.getBrandname();
        double majigeprice2=ref2.getPrice();
        String spices2= ref2.getSpices();

        System.out.println(" the mjige id is="+majigeid2);
        System.out.println("the brand name is ="+brandname2);
        System.out.println("the price is="+majigeprice2);
        System.out.println("the spices is ="+spices2);
        System.out.println(" ");


        Majige ref3=new Majige();
        ref3.setMajigeid(4);
        ref3.setBrandname("manmul");
        ref3.setPrice(40.00);
        ref3.setSpices("cinnamon");

        int majigeid3= ref3.getMajigeid();
        String brandname3=ref3.getBrandname();
        double majigeprice3=ref3.getPrice();
        String spices3= ref3.getSpices();

        System.out.println(" the mjige id is="+majigeid3);
        System.out.println("the brand name is ="+brandname3);
        System.out.println("the price is="+majigeprice3);
        System.out.println("the spices is ="+spices3);
        System.out.println(" ");


        Majige ref4=new Majige();
        ref4.setMajigeid(5);
        ref4.setBrandname("amul");
        ref4.setPrice(50.00);
        ref4.setSpices("pepper");

        int majigeid4= ref4.getMajigeid();
        String brandname4=ref4.getBrandname();
        double majigeprice4=ref4.getPrice();
        String spices4= ref4.getSpices();

        System.out.println(" the mjige id is="+majigeid4);
        System.out.println("the brand name is ="+brandname4);
        System.out.println("the price is="+majigeprice4);
        System.out.println("the spices is ="+spices4);
        System.out.println(" ");

        System.out.println( " the main is ended");


    }
}
