class House 
{
    // Instance Variables
    String type;
    int numberOfRooms;
    String color;
    boolean hasGarage;
    String location;
    double price;

    // Constructor 1 - No arguments
    House() {
        this("Apartment");
        System.out.println("House No arguments constructor invoked");
    }

    // Constructor 2
    House(String type) {
        this(type, 3);
        System.out.println("House 1 Parameterized constructor invoked");
    }

    // Constructor 3
    House(String type, int numberOfRooms) {
        this(type, numberOfRooms, "White");
        System.out.println("House 2 Parameterized constructor invoked");
    }

    // Constructor 4
    House(String type, int numberOfRooms, String color) {
        this(type, numberOfRooms, color, true);
        System.out.println("House 3 Parameterized constructor invoked");
    }

    // Constructor 5
    House(String type, int numberOfRooms, String color, boolean hasGarage) {
        this(type, numberOfRooms, color, hasGarage, "Urban Area");
        System.out.println("House 4 Parameterized constructor invoked");
    }

    // Constructor 6
    House(String type, int numberOfRooms, String color, boolean hasGarage, String location) {
        this(type, numberOfRooms, color, hasGarage, location, 250000);
        System.out.println("House 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    House(String type, int numberOfRooms, String color, boolean hasGarage, String location, double price) {
        this.type = type;
        this.numberOfRooms = numberOfRooms;
        this.color = color;
        this.hasGarage = hasGarage;
        this.location = location;
        this.price = price;
        System.out.println("\nHouse 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("House Type: " + type);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Color: " + color);
        System.out.println("Has Garage: " + (hasGarage ? "YES" : "NO"));
        System.out.println("Location: " + location);
        System.out.println("Price: $" + price);
        System.out.println("------------------------------");
    }
}