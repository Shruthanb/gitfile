class ChemicalsRunner 
{
    public static void main(String[] chemical) 
	{
        Chemicals chem1 = new Chemicals();
        chem1.displayDetails();

        Chemicals chem2 = new Chemicals("Ethanol");
        chem2.displayDetails();

        Chemicals chem3 = new Chemicals("Ammonia", "NH3");
        chem3.displayDetails();

        Chemicals chem4 = new Chemicals("Methane", "CH4", "Gas");
        chem4.displayDetails();

        Chemicals chem5 = new Chemicals("Sulfuric Acid", "H2SO4", "Liquid", true);
        chem5.displayDetails();

        Chemicals chem6 = new Chemicals("Calcium Carbonate", "CaCO3", "Solid", false, "Construction");
        chem6.displayDetails();

        Chemicals chem7 = new Chemicals("Mercury", "Hg", "Liquid", true, "Thermometers", 13.6);
        chem7.displayDetails();
    }
}