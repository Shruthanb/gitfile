class Glass 
{
    // Instance Variables
    String type;
    double thickness;
    String color;
    boolean isTempered;
    String application;
    double transparency;

    // Constructor 1 - No arguments
    Glass() {
        this("Window Glass");
        System.out.println("Glass No arguments constructor invoked");
    }

    // Constructor 2
    Glass(String type) {
        this(type, 5.0);
        System.out.println("Glass 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Glass(String type, double thickness) {
        this(type, thickness, "Transparent");
        System.out.println("Glass 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Glass(String type, double thickness, String color) {
        this(type, thickness, color, false);
        System.out.println("Glass 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Glass(String type, double thickness, String color, boolean isTempered) {
        this(type, thickness, color, isTempered, "Construction");
        System.out.println("Glass 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Glass(String type, double thickness, String color, boolean isTempered, String application) {
        this(type, thickness, color, isTempered, application, 90.0);
        System.out.println("Glass 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Glass(String type, double thickness, String color, boolean isTempered, String application, double transparency) {
        this.type = type;
        this.thickness = thickness;
        this.color = color;
        this.isTempered = isTempered;
        this.application = application;
        this.transparency = transparency;
        System.out.println("\nGlass 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Glass Type: " + type);
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Color: " + color);
        System.out.println("Tempered: " + (isTempered ? "YES" : "NO"));
        System.out.println("Application: " + application);
        System.out.println("Transparency: " + transparency + "%");
        System.out.println("------------------------------");
    }
}