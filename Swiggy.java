class Swiggy
{
 public static double takeOder(String itemname)
 {
   double price=0.0;
  if( itemname== "Burger")
   price=100.00;
    return price; 
   } 
 public static double takeOder(String itemname, int quantity)
 {
  double price=0.0;
  if( itemname== "Burger")
  price=100.00*quantity;
   return price;
  }
 }