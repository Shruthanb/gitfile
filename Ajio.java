class Ajio
{
  Ajio()
  {
  System.out.println("\n ajio constructor  is invoked");
  }
   Ajio(int id, String name, long phonenumber, String password)
   {
	System.out.println("\n ajio constructor  is invoked");
	
    this.id= id;
	this.name=name;
	this.phonenumber=phonenumber;
	this.password=password;
	}
	// instance varible
	int id;
	String name;
	long phonenumber;
	String password;
	 
	  public void displayAjiodetails()
	  {
	   System.out.println("the amazon id is ="+this.id);
	   System.out.println("the amazon name is ="+this.name);
	   System.out.println("the amazon phonenumber is ="+this.phonenumber);
	   System.out.println("the amazon password is ="+this.password);
	   System.out.println("  ");
	   }
  }