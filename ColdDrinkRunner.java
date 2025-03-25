class ColdDrinkRunner 
{
    public static void main(String[] args) 
	{
        ColdDrink coldDrink1 = new ColdDrink("Coca-Cola" , "Cola" , 40.0);
			System.out.println("Cold Drink Brand: "+coldDrink1.brand);
			System.out.println("Cold Drink Flavor: "+coldDrink1.flavor);
			System.out.println("Cold Drink Price: Rs."+coldDrink1.price);

        ColdDrink coldDrink2 = new ColdDrink("Pepsi", "Cola", 35.0);
			System.out.println("Cold Drink Brand: "+coldDrink2.brand);
			System.out.println("Cold Drink Flavor: "+coldDrink2.flavor);
			System.out.println("Cold Drink Price: Rs."+coldDrink2.price);
			
        ColdDrink coldDrink3 = new ColdDrink("Sprite", "Lemon", 30.0);
			System.out.println("Cold Drink Brand: "+coldDrink3.brand);
			System.out.println("Cold Drink Flavor: "+coldDrink3.flavor);
			System.out.println("Cold Drink Price: Rs."+coldDrink3.price);
			
        ColdDrink coldDrink4 = new ColdDrink("Fanta", "Orange", 40.0);
			System.out.println("Cold Drink Brand: "+coldDrink4.brand);
			System.out.println("Cold Drink Flavor: "+coldDrink4.flavor);
			System.out.println("Cold Drink Price: Rs."+coldDrink4.price);
			
        ColdDrink coldDrink5 = new ColdDrink("Thums Up", "Strong Cola", 45.0);
			System.out.println("Cold Drink Brand: "+coldDrink5.brand);
			System.out.println("Cold Drink Flavor: "+coldDrink5.flavor);
			System.out.println("Cold Drink Price: Rs."+coldDrink5.price);
			
        ColdDrink coldDrink6 = new ColdDrink("Maaza", "Mango", 35.0);
			System.out.println("Cold Drink Brand: "+coldDrink6.brand);
			System.out.println("Cold Drink Flavor: "+coldDrink6.flavor);
			System.out.println("Cold Drink Price: Rs."+coldDrink6.price);
			
        ColdDrink coldDrink7 = new ColdDrink("Appy Fizz", "Apple", 50.0);
			System.out.println("Cold Drink Brand: "+coldDrink7.brand);
			System.out.println("Cold Drink Flavor: "+coldDrink7.flavor);
			System.out.println("Cold Drink Price: Rs."+coldDrink7.price);
	}
}