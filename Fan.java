class Fan{
	static String brand= "Orient Electric";
 static String colour= "Smoke Brown";
static String powerSource = "electric";
static int price = 1500;
public static void main(String fa[]){

 // brand= "Havels";
 //colour= "Blackn";
// powerSource = "electric";
 //price = 1600;
 FanDetails();

System.out.println("NAME OF THE BRAND: "+brand);
System.out.println("COLOUR OF THE PRODUCT: "+colour);
System.out.println("POWER SOURCE: "+powerSource);
System.out.println("PRICE OF THE PRODUCT: "+price);
}
public static void FanDetails(){
	brand= "Havels";
 colour= "Black";
 powerSource = "electric";
 price = 1600;
}
}