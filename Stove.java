class Stove 
{
    // No-argument constructor
    Stove() {
        System.out.println("\n Stove No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Stove(String type, String brand, double price) {
		this.type = type;
        this.brand = brand;
        this.price = price;
		
		System.out.println("\n Stove Parameterized constructor is invoked:");
    }

    // Instance variables
    String type;
    String brand;
    double price;
}