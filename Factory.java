class Factory 
{
    // Instance Variables
    String name;
    String industry;
    int workers;
    boolean isAutomated;
    String location;
    double productionCapacity;

    // Constructor 1 - No arguments
    Factory() {
        this("Generic Factory");
        System.out.println("Factory No arguments constructor invoked");
    }

    // Constructor 2
    Factory(String name) {
        this(name, "Manufacturing");
        System.out.println("Factory 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Factory(String name, String industry) {
        this(name, industry, 100);
        System.out.println("Factory 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Factory(String name, String industry, int workers) {
        this(name, industry, workers, false);
        System.out.println("Factory 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Factory(String name, String industry, int workers, boolean isAutomated) {
        this(name, industry, workers, isAutomated, "Unknown");
        System.out.println("Factory 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Factory(String name, String industry, int workers, boolean isAutomated, String location) {
        this(name, industry, workers, isAutomated, location, 1000.0);
        System.out.println("Factory 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Factory(String name, String industry, int workers, boolean isAutomated, String location, double productionCapacity) {
        this.name = name;
        this.industry = industry;
        this.workers = workers;
        this.isAutomated = isAutomated;
        this.location = location;
        this.productionCapacity = productionCapacity;
        System.out.println("\nFactory 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Factory Name: " + name);
        System.out.println("Industry: " + industry);
        System.out.println("Workers: " + workers);
        System.out.println("Automated: " + (isAutomated ? "YES" : "NO"));
        System.out.println("Location: " + location);
        System.out.println("Production Capacity: " + productionCapacity + " units/day");
        System.out.println("------------------------------");
    }
}