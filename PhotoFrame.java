class PhotoFrame 
{
    // No-argument constructor
    PhotoFrame() {
        System.out.println("\n PhotoFrame No-argument constructor is invoked:");
    }

    // Parameterized constructor
    PhotoFrame(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
		
		System.out.println("\n PhotoFrame Parameterized constructor is invoked:");
    }

    // Instance variables
    String material;
    String size;
    double price;
}