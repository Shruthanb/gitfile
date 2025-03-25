class Soap
 {
    // No-argument constructor
    Soap() {
        System.out.println("\n Soap No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Soap(String brand, String fragrance, double price) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.price = price;
		
		System.out.println("\n Soap Parameterized constructor is invoked:");
    }

    // Instance variables
    String brand;
    String fragrance;
    double price;
}