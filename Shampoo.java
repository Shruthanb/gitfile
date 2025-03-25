class Shampoo 
{
    // No-argument constructor
    Shampoo() {
        System.out.println("\n Shampoo No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Shampoo(String brand, String hairType, double price) {
        this.brand = brand;
        this.hairType = hairType;
        this.price = price;
		
		System.out.println("\n Shampoo Parameterized constructor is invoked:");
    }

    // Instance variables
    String brand;
    String hairType;
    double price;
}