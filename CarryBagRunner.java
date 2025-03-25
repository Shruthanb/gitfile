class CarryBagRunner 
{
    public static void main(String[] args) 
	{
        CarryBag bag1 = new CarryBag("Cloth" , "Large" , 150.0);
			System.out.println("Carry Bag Material: "+bag1.material);
			System.out.println("Carry Bag Size: "+bag1.size);
			System.out.println("Carry Bag Price: Rs."+bag1.price);

        CarryBag bag2 = new CarryBag("Plastic", "Medium", 50.0);
			System.out.println("Carry Bag Material: "+bag2.material);
			System.out.println("Carry Bag Size: "+bag2.size);
			System.out.println("Carry Bag Price: Rs."+bag2.price);
			
        CarryBag bag3 = new CarryBag("Jute", "Small", 200.0);
			System.out.println("Carry Bag Material: "+bag3.material);
			System.out.println("Carry Bag Size: "+bag3.size);
			System.out.println("Carry Bag Price: Rs."+bag3.price);
			
        CarryBag bag4 = new CarryBag("Leather", "Large", 700.0);
			System.out.println("Carry Bag Material: "+bag4.material);
			System.out.println("Carry Bag Size: "+bag4.size);
			System.out.println("Carry Bag Price: Rs."+bag4.price);
			
        CarryBag bag5 = new CarryBag("Canvas", "Medium", 300.0);
			System.out.println("Carry Bag Material: "+bag5.material);
			System.out.println("Carry Bag Size: "+bag5.size);
			System.out.println("Carry Bag Price: Rs."+bag5.price);
			
        CarryBag bag6 = new CarryBag("Paper", "Small", 30.0);
			System.out.println("Carry Bag Material: "+bag6.material);
			System.out.println("Carry Bag Size: "+bag6.size);
			System.out.println("Carry Bag Price: Rs."+bag6.price);
			
        CarryBag bag7 = new CarryBag("Nylon", "Extra Large", 500.0);
			System.out.println("Carry Bag Material: "+bag7.material);
			System.out.println("Carry Bag Size: "+bag7.size);
			System.out.println("Carry Bag Price: Rs."+bag7.price);
	}
}