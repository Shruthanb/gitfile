class CarryBag 
{
    // No-argument constructor
    CarryBag() {
        System.out.println("\n CarryBag No-argument constructor is invoked:");
    }

    // Parameterized constructor
    CarryBag(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
		
		System.out.println("\n CarryBag Parameterized constructor is invoked:");
    }

    // Instance variables
    String material;
    String size;
    double price;
}