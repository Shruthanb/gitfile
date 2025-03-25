class Snapchat
{
 public static String  login(Long phonenumber,String password)
  {
	   String message= null;
	 if(phonenumber>0 &&  password!= null && password.length()==10 )
		  message="login is succesfull";
	  else 
		   message= "login is unsuccesfull";
	   return message;
	    
   }
    
	public static String login( String email, String password)
	{
		 String message=null;
		if(email!=null && password!=null && password.length()==10)
			message="login is succesfull";
		else
			message="login is unsuccesfull";
		return message;
	}
 
 }