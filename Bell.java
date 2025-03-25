class Bell 
{
    // No-argument constructor
    Bell() {
        System.out.println("\n Bell No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Bell(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;// refers to the instance variables
		
		System.out.println("\n Bell Parameterized constructor is invoked:");
    }

    // Instance variables
    String type;
    String material;
    double price;
}