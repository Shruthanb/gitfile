class StoveRunner 
{
    public static void main(String[] args) 
	{
        Stove stove1 = new Stove("Gas Stove" , "Prestige" , 4000.0);
			System.out.println("Stove Type: "+stove1.type);
			System.out.println("Stove Brand: "+stove1.brand);
			System.out.println("Stove Price: Rs."+stove1.price);
			
        Stove stove2 = new Stove("Induction Stove", "Philips", 3500.0);
			System.out.println("Stove Type: "+stove2.type);
			System.out.println("Stove Brand: "+stove2.brand);
			System.out.println("Stove Price: Rs."+stove2.price);
			
        Stove stove3 = new Stove("Electric Stove", "Bajaj", 5000.0);
			System.out.println("Stove Type: "+stove3.type);
			System.out.println("Stove Brand: "+stove3.brand);
			System.out.println("Stove Price: Rs."+stove3.price);
			
        Stove stove4 = new Stove("Kerosene Stove", "Sunflame", 2500.0);
			System.out.println("Stove Type: "+stove4.type);
			System.out.println("Stove Brand: "+stove4.brand);
			System.out.println("Stove Price: Rs."+stove4.price);
			
        Stove stove5 = new Stove("Wood Stove", "Pigeon", 2000.0);
			System.out.println("Stove Type: "+stove5.type);
			System.out.println("Stove Brand: "+stove5.brand);
			System.out.println("Stove Price: Rs."+stove5.price);
			
        Stove stove6 = new Stove("Two-Burner Stove", "Butterfly", 4500.0);
			System.out.println("Stove Type: "+stove6.type);
			System.out.println("Stove Brand: "+stove6.brand);
			System.out.println("Stove Price: Rs."+stove6.price);
			
        Stove stove7 = new Stove("Three-Burner Stove", "Surya", 5500.0);
			System.out.println("Stove Type: "+stove7.type);
			System.out.println("Stove Brand: "+stove7.brand);
			System.out.println("Stove Price: Rs."+stove7.price);
	}
}