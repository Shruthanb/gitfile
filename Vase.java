class Vase 
{
    // No-argument constructor
    Vase() {
        System.out.println("\n Vase No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Vase(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
		
		System.out.println("\n Vase Parameterized constructor is invoked:");
    }

    // Instance variables
    String material;
    String color;
    double price;
}