class Paper 
{
	// Instance Variable
	String type;
    int thickness;
    String color;
    boolean isRecyclable;
    String size;
    int weight;

    // Constructor 1 - No arguments
    Paper() {
        this("A4");
		System.out.println("Paper No arguments constructor invoked");
    }

    // Constructor 2
    Paper(String type) {
        this(type , 70);
		System.out.println("Paper 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Paper(String type, int thickness) {
        this(type, thickness , "White");
		System.out.println("Paper 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Paper(String type, int thickness, String color) {
        this(type, thickness , color , true);
		System.out.println("Paper 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Paper(String type, int thickness, String color, boolean isRecyclable) {
        this(type, thickness , color , isRecyclable , "Standard");
		System.out.println("Paper 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Paper(String type, int thickness, String color, boolean isRecyclable, String size) {
        this(type, thickness , color , isRecyclable , size , 5);
		System.out.println("Paper 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Paper(String type, int thickness, String color, boolean isRecyclable, String size, int weight) {
        this.type = type;
        this.thickness = thickness;
        this.color = color;
        this.isRecyclable = isRecyclable;
        this.size = size;
        this.weight = weight;
		System.out.println("\nPaper 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Paper Type: " + type);
        System.out.println("Thickness: " + thickness + " GSM");
        System.out.println("Color: " + color);
        System.out.println("Recyclable: " + (isRecyclable ? "YES" : "NO"));
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("------------------------------");
    }
}