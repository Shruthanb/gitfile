class Kurta
{
    static String material = "Cotton Blend";
    static String  sleevetype  = "Full Sleeve";
    static String length  = "Knee Length";
    static String neckstyle = "High Neck";
    static String pattern = "Floral";
	static  int price =2100;
  public static void main(String kur[])
  {
    Kurtadetails();
    System.out.println("TYPE OF THE MATERIAL: "+material);
    System.out.println("SLEEVETYPE: "+sleevetype);
     System.out.println("LENGTH: "+length);
      System.out.println("NECKSTYLE: "+neckstyle);
      System.out.println("PATTERN OF TYHE PRODUCT: "+pattern);
      System.out.println("PRICE OF THE PRODUCT: "+price);
    }
	public static void Kurtadetails()
	 {
	  material="silk";
	  sleevetype="half sleeve";
	  length="full ";
	  neckstyle="full ";
	  pattern="tloral";
	  price=900;
	  }
	
}