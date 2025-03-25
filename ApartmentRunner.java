class ApartmentRunner
{
  public static void main(String args[])
  {
    Apartment ref=new Apartment();
    ref.id=01;
	ref.name="sai apartment";
	ref.address="banglore";
	ref.noofbooks= 21;
	ref.noofflats=31;
	ref.govid=87;
	
	 System.out.println("  ");
	System.out.println(" the account id is ="+ref.id);
	System.out.println(" the  apartment name is ="+ref.name);
	System.out.println(" the apartment address is ="+ref.address);
	System.out.println(" the number of books is ="+ref.noofbooks);
	System.out.println(" the number of flats is ="+ref.noofflats);
	System.out.println(" the govertment id  is ="+ref.govid);
	
	System.out.println("   ");
	
	 Apartment Anotherref=new Apartment();
     Anotherref.id=02;
	 Anotherref.name="kiran apartment";
	 Anotherref.address="mysore";
	 Anotherref.noofbooks=22;
	 Anotherref.noofflats=32;
	 Anotherref.govid=88;
	
	System.out.println("  ");
	System.out.println(" the account id is ="+Anotherref.id);
	System.out.println(" the  apartment name is ="+Anotherref.name);
	System.out.println(" the apartment address is ="+Anotherref.address);
	System.out.println(" the number of books is ="+Anotherref.noofbooks);
	System.out.println(" the number of flats is ="+Anotherref.noofflats);
	System.out.println(" the govertment id  is ="+Anotherref.govid);
	
   
   }
  }