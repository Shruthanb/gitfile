class BubbleGum
{
	// Zero Parameterized constructor / No argument constructor
	BubbleGum(){
		System.out.println("\n BubbleGum No argument constructor is invoked:-");
	}
	
	// Parameterized constructor
	 BubbleGum(String flavor , String brand , double price){
		 this.flavor = flavor;
		 this.brand = brand;
		 this.price = price;
		 
		 System.out.println("\n BubbleGum Parameterized constructor is invoked:-");
	 }
	 
	 // instance variables
	 String flavor;
	 String brand;
	 double price;
}