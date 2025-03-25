class Mat 
{
    // No-argument constructor
    Mat() {
        System.out.println("\n Mat No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Mat(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
		
		System.out.println("\n Mat Parameterized constructor is invoked:");
    }

    // Instance variables
    String material;
    String size;
    double price;
}