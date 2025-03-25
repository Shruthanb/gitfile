class Whatsapp
{ 
 public static String signup( String email,String password)
 {
    String text= null;
   if(email!=null && password!=null && password.length()==10)
      text="signup is succesfull";
	  else
	  text="signup is unsuccesfull";
     return text;
   }
  public static String signup(long phoneno , String password)
  { 
   String text =null; 
   if(phoneno>10 && password!=null && password.length()==10 )
     text="signup is succesfull";
     else 
     text =" signup is un succesfull";	
      return text;
   }
 
 }