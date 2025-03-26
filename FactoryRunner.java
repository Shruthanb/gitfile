class FactoryRunner 
{
    public static void main(String[] factories) 
	{
        Factory factory1 = new Factory();
        factory1.displayDetails();

        Factory factory2 = new Factory("Tesla Gigafactory");
        factory2.displayDetails();

        Factory factory3 = new Factory("Samsung Semiconductor", "Electronics");
        factory3.displayDetails();

        Factory factory4 = new Factory("Ford Assembly", "Automotive", 5000);
        factory4.displayDetails();

        Factory factory5 = new Factory("Coca-Cola Plant", "Beverage", 300, true);
        factory5.displayDetails();

        Factory factory6 = new Factory("Steelworks", "Metallurgy", 1200, false, "Pittsburgh");
        factory6.displayDetails();

        Factory factory7 = new Factory("Textile Mill", "Textiles", 800, true, "India", 50000.0);
        factory7.displayDetails();
    }
}