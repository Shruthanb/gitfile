package com.xworkz.paintapp.paint;

public class PaintRunner {
    public static void main(String[] args) {
        System.out.println("main is started");
        System.out.println(" ");
          Paint ref=new Paint();
          ref.setPaintid(8);
          ref.setBrandname("indigo");
          ref.setPainttype("oiltype");
          ref.setColor("blue");
          ref.setPrice(800.00);

          int paintId= ref.getPaintid();
          String paintbrand= ref.getBrandname();
          String type= ref.getPainttype();
          String color= ref.getColor();
          double price=ref.getPrice();
        System.out.println("the paint id is ="+paintId);
        System.out.println("the brand name is ="+paintbrand);
        System.out.println("the paint type is ="+type);
        System.out.println("the paint color is ="+color);
        System.out.println("the paint price is ="+price);
        System.out.println("  ");

        Paint ref1=new Paint();
        ref1.setPaintid(1);
        ref1.setBrandname("asian");
        ref1.setPainttype("emulsion");
        ref1.setColor("red");
        ref1.setPrice(100.00);

        int paintId1= ref1.getPaintid();
        String paintbrand1= ref1.getBrandname();
        String type1= ref1.getPainttype();
        String color1= ref1.getColor();
        double price1=ref1.getPrice();

        System.out.println("the paint id is ="+paintId1);
        System.out.println("the brand name is ="+paintbrand1);
        System.out.println("the paint type is ="+type1);
        System.out.println("the paint color is ="+color1);
        System.out.println("the paint price is ="+price1);
        System.out.println("  ");

        Paint ref2=new Paint();
        ref2.setPaintid(2);
        ref2.setBrandname("berger");
        ref2.setPainttype("enamel");
        ref2.setColor("black");
        ref2.setPrice(200.00);

        int paintId2= ref2.getPaintid();
        String paintbrand2= ref2.getBrandname();
        String type2= ref2.getPainttype();
        String color2= ref2.getColor();
        double price2=ref2.getPrice();
        System.out.println("the paint id is ="+paintId2);
        System.out.println("the brand name is ="+paintbrand2);
        System.out.println("the paint type is ="+type2);
        System.out.println("the paint color is ="+color2);
        System.out.println("the paint price is ="+price2);
        System.out.println();

        Paint ref3=new Paint();
        ref3.setPaintid(3);
        ref3.setBrandname("shalimar");
        ref3.setPainttype("acrylic");
        ref3.setColor("white");
        ref3.setPrice(300.00);

        int paintId3= ref3.getPaintid();
        String paintbrand3= ref3.getBrandname();
        String type3= ref3.getPainttype();
        String color3= ref3.getColor();
        double price3=ref3.getPrice();
        System.out.println("the paint id is ="+paintId3);
        System.out.println("the brand name is ="+paintbrand3);
        System.out.println("the paint type is ="+type3);
        System.out.println("the paint color is ="+color3);
        System.out.println("the paint price is ="+price3);
        System.out.println();

        Paint ref4=new Paint();
        ref4.setPaintid(4);
        ref4.setBrandname("nippon");
        ref4.setPainttype("anti corrosive");
        ref4.setColor("pink");
        ref4.setPrice(400.00);

        int paintId4= ref4.getPaintid();
        String paintbrand4= ref4.getBrandname();
        String type4= ref4.getPainttype();
        String color4= ref4.getColor();
        double price4=ref4.getPrice();
        System.out.println("the paint id is ="+paintId4);
        System.out.println("the brand name is ="+paintbrand4);
        System.out.println("the paint type is ="+type4);
        System.out.println("the paint color is ="+color4);
        System.out.println("the paint price is ="+price4);
        System.out.println();

        Paint ref5=new Paint();
        ref5.setPaintid(5);
        ref5.setBrandname("birla");
        ref5.setPainttype("gloss");
        ref5.setColor("brown");
        ref5.setPrice(500.00);

        int paintId5= ref5.getPaintid();
        String paintbrand5= ref5.getBrandname();
        String type5= ref5.getPainttype();
        String color5= ref5.getColor();
        double price5=ref5.getPrice();
        System.out.println("the paint id is ="+paintId5);
        System.out.println("the brand name is ="+paintbrand5);
        System.out.println("the paint type is ="+type5);
        System.out.println("the paint color is ="+color5);
        System.out.println("the paint price is ="+price5);
        System.out.println();

        Paint ref6=new Paint();
        ref6.setPaintid(6);
        ref6.setBrandname("jotun");
        ref6.setPainttype("semi gloss");
        ref6.setColor("drakblack");
        ref6.setPrice(8000.00);

        int paintId6= ref6.getPaintid();
        String paintbrand6= ref6.getBrandname();
        String type6= ref6.getPainttype();
        String color6= ref6.getColor();
        double price6=ref6.getPrice();
        System.out.println("the paint id is ="+paintId6);
        System.out.println("the brand name is ="+paintbrand6);
        System.out.println("the paint type is ="+type6);
        System.out.println("the paint color is ="+color6);
        System.out.println("the paint price is ="+price6);
        System.out.println();

        System.out.println("main is ended");
    }
}
