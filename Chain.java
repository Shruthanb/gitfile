class Chain 
{
    // No-argument constructor
    Chain() {
        System.out.println("\n Chain No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Chain(String material, String length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
		
		System.out.println("\n Chain Parameterized constructor is invoked:");
    }

    // Instance variables
    String material;
    String length;
    double price;
}