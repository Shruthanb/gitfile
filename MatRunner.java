class MatRunner 
{
    public static void main(String[] args) 
	{
        Mat mat1 = new Mat("Cotton" , "Large" , 600.0);
			System.out.println("Mat Material: "+mat1.material);
			System.out.println("Mat Size: "+mat1.size);
			System.out.println("Mat Price: Rs."+mat1.price);

        Mat mat2 = new Mat("Rubber", "Medium", 400.0);
			System.out.println("Mat Material: "+mat2.material);
			System.out.println("Mat Size: "+mat2.size);
			System.out.println("Mat Price: Rs."+mat2.price);
			
        Mat mat3 = new Mat("Jute", "Small", 350.0);
			System.out.println("Mat Material: "+mat3.material);
			System.out.println("Mat Size: "+mat3.size);
			System.out.println("Mat Price: Rs."+mat3.price);
			
        Mat mat4 = new Mat("Polyester", "Extra Large", 800.0);
			System.out.println("Mat Material: "+mat4.material);
			System.out.println("Mat Size: "+mat4.size);
			System.out.println("Mat Price: Rs."+mat4.price);
			
        Mat mat5 = new Mat("Wool", "Medium", 700.0);
			System.out.println("Mat Material: "+mat5.material);
			System.out.println("Mat Size: "+mat5.size);
			System.out.println("Mat Price: Rs."+mat5.price);
			
        Mat mat6 = new Mat("Bamboo", "Large", 900.0);
			System.out.println("Mat Material: "+mat6.material);
			System.out.println("Mat Size: "+mat6.size);
			System.out.println("Mat Price: Rs."+mat6.price);
			
        Mat mat7 = new Mat("Foam", "Small", 500.0);
			System.out.println("Mat Material: "+mat7.material);
			System.out.println("Mat Size: "+mat7.size);
			System.out.println("Mat Price: Rs."+mat7.price);
	}
}