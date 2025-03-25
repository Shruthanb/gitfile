class Headset{
	static int price = 2999;
	static  String brand =	"Noise";
 static String colour =	"Midnight Blue";
static int modelNo	= 3;
public static void main(String head[]){
  //price = 3300;
  //brand =	"Boat";
 //colour =	"Black";
 //modelNo	= 2;
 HeadsetDetails();

System.out.println("NAME OF THE BRAND: "+brand);
System.out.println("PRODUCT COLOUR: "+colour);
System.out.println("VERSION OF THE MODEL: "+modelNo);
System.out.println("PRICE OF THE PRODUCT: "+price);
}
public static void HeadsetDetails(){
	price = 3300;
  brand =	"Boat";
 colour =	"Black";
 modelNo	= 2;
}
}