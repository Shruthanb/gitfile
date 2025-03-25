class ShampooRunner 
{
    public static void main(String[] args)
	{
        Shampoo shampoo1 = new Shampoo("Dove" , "Dry Hair" , 250.0);
			System.out.println("Shampoo Brand: "+shampoo1.brand);
			System.out.println("Shampoo Hair Type: "+shampoo1.hairType);
			System.out.println("Shampoo Price : Rs. "+shampoo1.price);

        Shampoo shampoo2 = new Shampoo("Pantene", "Oily Hair", 230.0);
			System.out.println("Shampoo Brand: "+shampoo2.brand);
			System.out.println("Shampoo Hair Type: "+shampoo2.hairType);
			System.out.println("Shampoo Price : Rs. "+shampoo2.price);
			
        Shampoo shampoo3 = new Shampoo("Clinic Plus", "Normal Hair", 180.0);
			System.out.println("Shampoo Brand: "+shampoo3.brand);
			System.out.println("Shampoo Hair Type: "+shampoo3.hairType);
			System.out.println("Shampoo Price : Rs. "+shampoo3.price);
			
        Shampoo shampoo4 = new Shampoo("Head & Shoulders", "Dandruff", 260.0);
			System.out.println("Shampoo Brand: "+shampoo4.brand);
			System.out.println("Shampoo Hair Type: "+shampoo4.hairType);
			System.out.println("Shampoo Price : Rs. "+shampoo4.price);
			
        Shampoo shampoo5 = new Shampoo("Tresemme", "Frizzy Hair", 300.0);
			System.out.println("Shampoo Brand: "+shampoo5.brand);
			System.out.println("Shampoo Hair Type: "+shampoo5.hairType);
			System.out.println("Shampoo Price : Rs. "+shampoo5.price);
			
        Shampoo shampoo6 = new Shampoo("Biotique", "Herbal", 280.0);
			System.out.println("Shampoo Brand: "+shampoo6.brand);
			System.out.println("Shampoo Hair Type: "+shampoo6.hairType);
			System.out.println("Shampoo Price : Rs. "+shampoo6.price);
			
        Shampoo shampoo7 = new Shampoo("L'Oreal", "Colored Hair", 350.0);
			System.out.println("Shampoo Brand: "+shampoo7.brand);
			System.out.println("Shampoo Hair Type: "+shampoo7.hairType);
			System.out.println("Shampoo Price : Rs. "+shampoo7.price);
	}
}