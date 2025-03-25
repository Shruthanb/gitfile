class Cosmetic 
{
    // No-argument constructor
    Cosmetic() {
        System.out.println("\n Cosmetic No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Cosmetic(String product, String brand, double price) {
        this.product = product;
        this.brand = brand;
        this.price = price;
		
		System.out.println("\n Cosmetic Parameterized constructor is invoked:");
    }

    // Instance variables
    String product;
    String brand;
    double price;
}