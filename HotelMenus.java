class HotelMenus
{
  static String items[]={"rice","sambar","chapti","fish","roti","omelet","egg","eggrice","curry","eggcurry","fishcurry","keema"};
  public static void main(String args[])
  {
	  System.out.println("they are started");
	   items();
	  System.out.println("they are ended");
  }
  public static void items()
  {
	  for( String items : items)
	  {
		  System.out.println(items);
	  }
  }
}