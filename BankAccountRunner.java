class BankAccountRunner
{
  public static void main(String args[])
  {
    System.out.println("the main started");
	  BankAccount.getBalance();
	   BankAccount.credit(900.00);
	   BankAccount.getBalance();
	   BankAccount.debit(200.00);
	   BankAccount.getBalance();
  }
	}