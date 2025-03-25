class BellRunner 
{
    public static void main(String[] args) 
	{
		// parameteriesd constructor
        Bell bell1 = new Bell("Temple Bell" , "Brass" , 1200.0);
			System.out.println("Bell Type: "+bell1.type);
			System.out.println("Bell Material: "+bell1.material);
			System.out.println("Bell Price: Rs."+bell1.price);
			
			//  non argumented constructor
			//Bell bell1 = new Bell();
			// bell1.String="Temple Bell";
			//bell1.String="Brass";
			//bell1.double=1200.00;
			//System.out.println("Bell Type: "+bell1.type);
			//System.out.println("Bell Material: "+bell1.material);
			//System.out.println("Bell Price: Rs."+bell1.price);

        Bell bell2 = new Bell("Door Bell", "Steel", 500.0);
			System.out.println("Bell Type: "+bell2.type);
			System.out.println("Bell Material: "+bell2.material);
			System.out.println("Bell Price: Rs."+bell2.price);
			
        Bell bell3 = new Bell("Hand Bell", "Bronze", 800.0);
			System.out.println("Bell Type: "+bell3.type);
			System.out.println("Bell Material: "+bell3.material);
			System.out.println("Bell Price: Rs."+bell3.price);
			
        Bell bell4 = new Bell("Bicycle Bell", "Aluminum", 250.0);
			System.out.println("Bell Type: "+bell4.type);
			System.out.println("Bell Material: "+bell4.material);
			System.out.println("Bell Price: Rs."+bell4.price);
			
        Bell bell5 = new Bell("School Bell", "Iron", 1500.0);
			System.out.println("Bell Type: "+bell5.type);
			System.out.println("Bell Material: "+bell5.material);
			System.out.println("Bell Price: Rs."+bell5.price);
			
        Bell bell6 = new Bell("Church Bell", "Copper", 4000.0);
			System.out.println("Bell Type: "+bell6.type);
			System.out.println("Bell Material: "+bell6.material);
			System.out.println("Bell Price: Rs."+bell6.price);
			
        Bell bell7 = new Bell("Wind Chime Bell", "Glass", 700.0);
			System.out.println("Bell Type: "+bell7.type);
			System.out.println("Bell Material: "+bell7.material);
			System.out.println("Bell Price: Rs."+bell7.price);
	}
}