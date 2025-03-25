class Series
{
    static String kannadaseries[]={"we","qr","ty","ui","op","fg","df","as","qw","zx"};
    static String englishseries[]={"zx","cv","bn","nm","hg","ty","re","wq","as","df"};
    static String hindiseries[]={"fg","zx","cv","xz","mn","bv","vc","xz","sa","fd"};
    static String malayamseries[]={"po","iu","yt","re","fd","cx","sa","vc","fd","nb"};
    public static void main(String args[])
	{
     System.out.println("main started");
	   kannadaseries();
	   englishseries();
	   malayamseries();
     System.out.println("main ended");	 
	}	
	public static void kannadaseries()
	{
		System.out.println(" the kannadaseries are started");
		for( String kannadaseries : kannadaseries)
		{
			System.out.println(kannadaseries);
		}
		System.out.println(" the kannadaseries are ended");
	}
	public static void englishseries()
	{
		System.out.println(" the englishseries are started");
		for(String englishseries : englishseries)
		{
			System.out.println(englishseries);
		}
		System.out.println(" the englishseries are ended");
	}
	public static void hindiseries()
	{
		System.out.println(" the hindiseries are started");
		for( String hindiseries : hindiseries)
		{
			System.out.println(hindiseries);
		}
		System.out.println(" the hindiseries are ended");
	}
	public static void malayamseries()
    {
		System.out.println(" the malayamseries are started");
		for( String malayamseries : malayamseries)
		{
			System.out.println(malayamseries);
		}
		System.out.println(" the malayamseries are ended");
	}
}
