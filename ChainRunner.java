class ChainRunner 
{
    public static void main(String[] args) 
	{
        Chain chain1 = new Chain("Gold" , "18 inches" , 50000.0);
			System.out.println("Chain Material : "+chain1.material);
			System.out.println("Chain Length : "+chain1.length);
			System.out.println("Chain Price : Rs."+chain1.price);

        Chain chain2 = new Chain("Silver", "20 inches", 1500.0);
			System.out.println("Chain Material : "+chain2.material);
			System.out.println("Chain Length : "+chain2.length);
			System.out.println("Chain Price : Rs."+chain2.price);
			
        Chain chain3 = new Chain("Platinum", "22 inches", 70000.0);
			System.out.println("Chain Material : "+chain3.material);
			System.out.println("Chain Length : "+chain3.length);
			System.out.println("Chain Price : Rs."+chain3.price);
			
        Chain chain4 = new Chain("Steel", "16 inches", 800.0);
			System.out.println("Chain Material : "+chain4.material);
			System.out.println("Chain Length : "+chain4.length);
			System.out.println("Chain Price : Rs."+chain4.price);
			
        Chain chain5 = new Chain("Brass", "19 inches", 1200.0);
			System.out.println("Chain Material : "+chain5.material);
			System.out.println("Chain Length : "+chain5.length);
			System.out.println("Chain Price : Rs."+chain5.price);
			
        Chain chain6 = new Chain("Copper", "21 inches", 900.0);
			System.out.println("Chain Material : "+chain6.material);
			System.out.println("Chain Length : "+chain6.length);
			System.out.println("Chain Price : Rs."+chain6.price);
			
        Chain chain7 = new Chain("Titanium", "24 inches", 10000.0);
			System.out.println("Chain Material : "+chain7.material);
			System.out.println("Chain Length : "+chain7.length);
			System.out.println("Chain Price : Rs."+chain7.price);
	}
}