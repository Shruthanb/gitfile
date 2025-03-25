class SoapRunner 
{
    public static void main(String[] args) 
	{
        Soap soap1 = new Soap("Lux" , "Rose" , 40.0);
			System.out.println("Soap Brand: "+soap1.brand);
			System.out.println("Soap Fragance: "+soap1.fragrance);
			System.out.println("Soap Price: Rs."+soap1.price);

        Soap soap2 = new Soap("Dove", "Milk", 60.0);
			System.out.println("Soap Brand: "+soap2.brand);
			System.out.println("Soap Fragance: "+soap2.fragrance);
			System.out.println("Soap Price: Rs."+soap2.price);
			
        Soap soap3 = new Soap("Pears", "Glycerin", 75.0);
			System.out.println("Soap Brand: "+soap3.brand);
			System.out.println("Soap Fragance: "+soap3.fragrance);
			System.out.println("Soap Price: Rs."+soap3.price);
			
        Soap soap4 = new Soap("Lifebuoy", "Herbal", 35.0);
			System.out.println("Soap Brand: "+soap4.brand);
			System.out.println("Soap Fragance: "+soap4.fragrance);
			System.out.println("Soap Price: Rs."+soap4.price);
			
        Soap soap5 = new Soap("Santoor", "Sandal", 50.0);
			System.out.println("Soap Brand: "+soap5.brand);
			System.out.println("Soap Fragance: "+soap5.fragrance);
			System.out.println("Soap Price: Rs."+soap5.price);
			
        Soap soap6 = new Soap("Medimix", "Ayurvedic", 55.0);
			System.out.println("Soap Brand: "+soap6.brand);
			System.out.println("Soap Fragance: "+soap6.fragrance);
			System.out.println("Soap Price: Rs."+soap6.price);
			
        Soap soap7 = new Soap("Mysore Sandal", "Sandalwood", 90.0);
			System.out.println("Soap Brand: "+soap7.brand);
			System.out.println("Soap Fragance: "+soap7.fragrance);
			System.out.println("Soap Price: Rs."+soap7.price);
	}
}