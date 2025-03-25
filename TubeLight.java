class TubeLight 
{
    // No-argument constructor
    TubeLight() {
        System.out.println("\n TubeLight No-argument constructor is invoked:");
    }

    // Parameterized constructor
    TubeLight(String brand, int wattage, double price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
		
		System.out.println("\n TubeLight Parameterized constructor is invoked:");
    }

    // Instance variables
    String brand;
    int wattage;
    double price;
}