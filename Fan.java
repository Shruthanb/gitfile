class Fan
{
 static char items[]={'T','Y','U','I','O','P','G','D','A','B'};
 public static void main(String args[])
 {
	 System.out.println("they are started:");
	 items();
	 System.out.println("they are ended");
 }
  public static void items()
  {
	  for( char items : items)
	  {
		  System.out.println(items);
	  }
  }
}