class GlassRunner 
{
    public static void main(String[] glass) 
	{
        Glass glass1 = new Glass();
        glass1.displayDetails();

        Glass glass2 = new Glass("Tempered Glass");
        glass2.displayDetails();

        Glass glass3 = new Glass("Laminated Glass", 8.0);
        glass3.displayDetails();

        Glass glass4 = new Glass("Tinted Glass", 6.5, "Blue");
        glass4.displayDetails();

        Glass glass5 = new Glass("Frosted Glass", 4.0, "White", false);
        glass5.displayDetails();

        Glass glass6 = new Glass("Smart Glass", 10.0, "Transparent", true, "Technology");
        glass6.displayDetails();

        Glass glass7 = new Glass("Bulletproof Glass", 12.5, "Clear", true, "Security", 85.0);
        glass7.displayDetails();
    }
}