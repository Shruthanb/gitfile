class SwiggyRunner
{
 public static void main(String ww[])
 {
	 
   double ref =Swiggy.takeOder("Burger");
   System.out.println(ref);
   double oder =Swiggy.takeOder("Burger",3);
   System.out.println(oder);
 }
 }