class ColdDrink 
{
    // No-argument constructor
    ColdDrink() {
        System.out.println("\n ColdDrink No-argument constructor is invoked:");
    }

    // Parameterized constructor
    ColdDrink(String brand, String flavor, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
		
		System.out.println("\n ColdDrink Parameterized constructor is invoked:");
    }

    // Instance variables
    String brand;
    String flavor;
    double price;
}