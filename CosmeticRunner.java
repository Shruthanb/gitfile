class CosmeticRunner 
{
    public static void main(String[] args) 
	{
        Cosmetic cosmetic1 = new Cosmetic("Lipstick" , "Maybelline" , 499.0);
			System.out.println("Cosmetic Product: "+cosmetic1.product);
			System.out.println("Cosmetic Brand: "+cosmetic1.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic1.price);

        Cosmetic cosmetic2 = new Cosmetic("Foundation", "Lakme", 799.0);
			System.out.println("Cosmetic Product: "+cosmetic2.product);
			System.out.println("Cosmetic Brand: "+cosmetic2.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic2.price);
			
        Cosmetic cosmetic3 = new Cosmetic("Mascara", "L'Oreal", 599.0);
			System.out.println("Cosmetic Product: "+cosmetic3.product);
			System.out.println("Cosmetic Brand: "+cosmetic3.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic3.price);
			
        Cosmetic cosmetic4 = new Cosmetic("Eyeliner", "Revlon", 399.0);
			System.out.println("Cosmetic Product: "+cosmetic4.product);
			System.out.println("Cosmetic Brand: "+cosmetic4.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic4.price);
			
        Cosmetic cosmetic5 = new Cosmetic("Blush", "MAC", 1200.0);
			System.out.println("Cosmetic Product: "+cosmetic5.product);
			System.out.println("Cosmetic Brand: "+cosmetic5.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic5.price);
			
        Cosmetic cosmetic6 = new Cosmetic("Compact Powder", "Colorbar", 650.0);
			System.out.println("Cosmetic Product: "+cosmetic6.product);
			System.out.println("Cosmetic Brand: "+cosmetic6.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic6.price);
			
        Cosmetic cosmetic7 = new Cosmetic("Nail Polish", "Nykaa", 199.0);
			System.out.println("Cosmetic Product: "+cosmetic7.product);
			System.out.println("Cosmetic Brand: "+cosmetic7.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic7.price);
	}
}