class BankAccount
{
   static double balance;
    //parameter :Datatype reff
	 public static void credit( double amount)
	 {
	 System.out.println("credit as been started");
	   if(balance>0.0)
	   balance = balance+amount;
	    else
		System.out.println("invalid amount");
		System.out.println("credit as been ended");
		}
	public static void debit(double amount)
	{
	 System.out.println("debit as been started");
	 if(amount<=balance)
	  balance = balance-amount;
	  else
	   System.out.println("insuffient balance");
	     System.out.println("debitas been ended");
		 }
		 public static void getBalance()
		 {
		  System.out.println("avalibale balance is"+balance);
		  }
	}