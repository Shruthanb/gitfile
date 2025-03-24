class Jacket{
	static String brand = "Wildcraft";
static String fitType ="Regular";
static boolean isWashable = true;
static int price = 1500;
public static void main(String jac[]){
 //brand = "Puma";
 //fitType ="Regular";
 //isWashable = true;
 //price = 2500;
 JacketDetails();
System.out.println("NAME OF THE BRAND: "+brand);
System.out.println("FIT TYPE: "+fitType);
System.out.println("IS IT WASHABLE: "+isWashable);
System.out.println("PRICE OF THE PRODUCT: "+price);
}
public static void JacketDetails(){
	brand = "Puma";
 fitType ="Regular";
 isWashable = true;
 price = 2500;
}
}