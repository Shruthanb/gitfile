class Insta
{ 
 public static  void  signup( String email,String password)
 {
    //String text= null;
   if(email!=null && password!=null && password.length()==10)
      System.out.println("signup is succesfull");
	  else
	 System.out.println("signup is unsuccesfull");
     //return text;
   }
  public static void signup(long phoneno , String password)
  { 
   //String text =null; 
   if(phoneno>10 && password!=null && password.length()==10 )
     System.out.println("signup is succesfull");
     else 
     System.out.println(" signup is un succesfull");	
      //return text;
   }
 
 }