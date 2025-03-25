class VaseRunner 
{
    public static void main(String[] args) 
	{
        Vase vase1 = new Vase("Ceramic" , "Blue" , 450.0);
			System.out.println("Vase Material: "+vase1.material);
			System.out.println("Vase Colour: "+vase1.color);
			System.out.println("Vase Price: Rs."+vase1.price);

        Vase vase2 = new Vase("Glass", "Transparent", 600.0);
			System.out.println("Vase Material: "+vase2.material);
			System.out.println("Vase Colour: "+vase2.color);
			System.out.println("Vase Price: Rs."+vase2.price);
			
        Vase vase3 = new Vase("Clay", "Brown", 350.0);
			System.out.println("Vase Material: "+vase3.material);
			System.out.println("Vase Colour: "+vase3.color);
			System.out.println("Vase Price: Rs."+vase3.price);
			
        Vase vase4 = new Vase("Metal", "Gold", 1200.0);
			System.out.println("Vase Material: "+vase4.material);
			System.out.println("Vase Colour: "+vase4.color);
			System.out.println("Vase Price: Rs."+vase4.price);
			
        Vase vase5 = new Vase("Plastic", "White", 250.0);
			System.out.println("Vase Material: "+vase5.material);
			System.out.println("Vase Colour: "+vase5.color);
			System.out.println("Vase Price: Rs."+vase5.price);
			
        Vase vase6 = new Vase("Stone", "Black", 800.0);
			System.out.println("Vase Material: "+vase6.material);
			System.out.println("Vase Colour: "+vase6.color);
			System.out.println("Vase Price: Rs."+vase6.price);
			
        Vase vase7 = new Vase("Wooden", "Dark Brown", 700.0);
			System.out.println("Vase Material: "+vase7.material);
			System.out.println("Vase Colour: "+vase7.color);
			System.out.println("Vase Price: Rs."+vase7.price);
	}
}