class TubeLightRunner 
{
    public static void main(String[] args) 
	{
        TubeLight tube1 = new TubeLight("Philips" ,  40 , 300.0);
			System.out.println("TubeLight Brand: "+tube1.brand);
			System.out.println("TubeLight Wattage: "+tube1.wattage);
			System.out.println("TubeLight Price: Rs."+tube1.price);

        TubeLight tube2 = new TubeLight("Havells", 50, 450.0);
			System.out.println("TubeLight Brand: "+tube2.brand);
			System.out.println("TubeLight Wattage: "+tube2.wattage);
			System.out.println("TubeLight Price: Rs."+tube2.price);
			
        TubeLight tube3 = new TubeLight("Syska", 30, 250.0);
			System.out.println("TubeLight Brand: "+tube3.brand);
			System.out.println("TubeLight Wattage: "+tube3.wattage);
			System.out.println("TubeLight Price: Rs."+tube3.price);
			
        TubeLight tube4 = new TubeLight("Wipro", 60, 500.0);
			System.out.println("TubeLight Brand: "+tube4.brand);
			System.out.println("TubeLight Wattage: "+tube4.wattage);
			System.out.println("TubeLight Price: Rs."+tube4.price);
			
        TubeLight tube5 = new TubeLight("Eveready", 36, 280.0);
			System.out.println("TubeLight Brand: "+tube5.brand);
			System.out.println("TubeLight Wattage: "+tube5.wattage);
			System.out.println("TubeLight Price: Rs."+tube5.price);
			
        TubeLight tube6 = new TubeLight("Surya", 48, 320.0);
			System.out.println("TubeLight Brand: "+tube6.brand);
			System.out.println("TubeLight Wattage: "+tube6.wattage);
			System.out.println("TubeLight Price: Rs."+tube6.price);
			
        TubeLight tube7 = new TubeLight("Bajaj", 42, 350.0);
			System.out.println("TubeLight Brand: "+tube7.brand);
			System.out.println("TubeLight Wattage: "+tube7.wattage);
			System.out.println("TubeLight Price: Rs."+tube7.price);
	}
}