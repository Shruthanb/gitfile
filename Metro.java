class Metro 
{
    // Instance Variables
    String city;
    int numberOfLines;
    String color;
    boolean isOperational;
    String operator;
    int capacity;

    // Constructor 1 - No arguments
    Metro() {
        this("New York");
        System.out.println("Metro No arguments constructor invoked");
    }

    // Constructor 2
    Metro(String city) {
        this(city, 5);
        System.out.println("Metro 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Metro(String city, int numberOfLines) {
        this(city, numberOfLines, "Blue");
        System.out.println("Metro 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Metro(String city, int numberOfLines, String color) {
        this(city, numberOfLines, color, true);
        System.out.println("Metro 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Metro(String city, int numberOfLines, String color, boolean isOperational) {
        this(city, numberOfLines, color, isOperational, "Govt Operated");
        System.out.println("Metro 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Metro(String city, int numberOfLines, String color, boolean isOperational, String operator) {
        this(city, numberOfLines, color, isOperational, operator, 1000);
        System.out.println("Metro 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Metro(String city, int numberOfLines, String color, boolean isOperational, String operator, int capacity) {
        this.city = city;
        this.numberOfLines = numberOfLines;
        this.color = color;
        this.isOperational = isOperational;
        this.operator = operator;
        this.capacity = capacity;
        System.out.println("\nMetro 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Metro City: " + city);
        System.out.println("Number of Lines: " + numberOfLines);
        System.out.println("Color: " + color);
        System.out.println("Operational: " + (isOperational ? "YES" : "NO"));
        System.out.println("Operator: " + operator);
        System.out.println("Capacity: " + capacity + " passengers per train");
        System.out.println("------------------------------");
    }
}