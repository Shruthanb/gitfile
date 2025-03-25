class Start
{
  static int pincodes[]={50012,50013,50014,50015};
   public static void main(String aa[])
   {
     System.out.println("the main is started :");
	    getPincodes() ;
	System.out.println("the main is ended");
	}
	 public static void getPincodes()
	 {
	   System.out.println("inside getPincodes()");
	   System.out.println(" list of area Pincodes are :");
	   for(int Pincode:pincodes)
	   {
	   System.out.println(Pincode);
	     }
	 }
} 