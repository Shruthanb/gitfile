class Road 
{
    // Instance Variables
    String name;
    String type;
    double length;
    boolean isHighway;
    String surfaceMaterial;
    int lanes;

    // Constructor 1 - No arguments
    Road() {
        this("Main Street");
        System.out.println("Road No arguments constructor invoked");
    }

    // Constructor 2
    Road(String name) {
        this(name, "City Road");
        System.out.println("Road 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Road(String name, String type) {
        this(name, type, 5.0);
        System.out.println("Road 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Road(String name, String type, double length) {
        this(name, type, length, false);
        System.out.println("Road 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Road(String name, String type, double length, boolean isHighway) {
        this(name, type, length, isHighway, "Asphalt");
        System.out.println("Road 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Road(String name, String type, double length, boolean isHighway, String surfaceMaterial) {
        this(name, type, length, isHighway, surfaceMaterial, 2);
        System.out.println("Road 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Road(String name, String type, double length, boolean isHighway, String surfaceMaterial, int lanes) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.isHighway = isHighway;
        this.surfaceMaterial = surfaceMaterial;
        this.lanes = lanes;
        System.out.println("\nRoad 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Road Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length + " km");
        System.out.println("Highway: " + (isHighway ? "YES" : "NO"));
        System.out.println("Surface Material: " + surfaceMaterial);
        System.out.println("Lanes: " + lanes);
        System.out.println("------------------------------");
    }
}
