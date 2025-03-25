class Charger
{
	static  String brand = "REDMI";
static String colour = "Black";
 static String type = "USB type A";
 static int price = 1500;
 public static void main(String cha[])
   {
  //brand = "VIVO";
  //colour = "white";
  //type = "USB type C";
  //price = 1500;
     ChargerDetails();
     System.out.println("BRAND:"+brand);
     System.out.println("COLOUR: "+colour);
     System.out.println("CHARGER TYPE: "+type);
	 System.out.println("PRICE OF THE CHARGER: "+price);
 
    }
public static void ChargerDetails()
  {
	 brand = "VIVO";
     colour = "white";
     type = "USB type C";
     price = 1200;
   }

}