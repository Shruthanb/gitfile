class Chemicals 
{
    // Instance Variables
    String name;
    String formula;
    String state;
    boolean isToxic;
    String use;
    double density;

    // Constructor 1 - No arguments
    Chemicals() {
        this("Water");
        System.out.println("Chemicals No arguments constructor invoked");
    }

    // Constructor 2
    Chemicals(String name) {
        this(name, "H2O");
        System.out.println("Chemicals 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Chemicals(String name, String formula) {
        this(name, formula, "Liquid");
        System.out.println("Chemicals 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Chemicals(String name, String formula, String state) {
        this(name, formula, state, false);
        System.out.println("Chemicals 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Chemicals(String name, String formula, String state, boolean isToxic) {
        this(name, formula, state, isToxic, "Industrial");
        System.out.println("Chemicals 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Chemicals(String name, String formula, String state, boolean isToxic, String use) {
        this(name, formula, state, isToxic, use, 1.0);
        System.out.println("Chemicals 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Chemicals(String name, String formula, String state, boolean isToxic, String use, double density) {
        this.name = name;
        this.formula = formula;
        this.state = state;
        this.isToxic = isToxic;
        this.use = use;
        this.density = density;
        System.out.println("\nChemicals 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Chemical Name: " + name);
        System.out.println("Formula: " + formula);
        System.out.println("State: " + state);
        System.out.println("Toxic: " + (isToxic ? "YES" : "NO"));
        System.out.println("Use: " + use);
        System.out.println("Density: " + density + " g/cm³");
        System.out.println("------------------------------");
    }
}
