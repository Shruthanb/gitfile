class Store
{
  static String groceries[]={"tt","yy","uu","ii","oo","pp","ww","qq","ff","gg"};
  static String perfumes[]={"rr","aa","ss","dd","ff","gg","hh","jj","kk","ll"};
  static String biscuits[]={"zz","xx","cc","vv","bb","nn","mm","qq","ee","ww"};
  static String vegtables[]={"qw","er","ty","yu","io","pa","sd","fg","hj","kl"};
  static String utensils[]={"as","df","gh","hj","kl","lz","xc","vb","nm","mk"};
    
   public static void main(String args[])
   {
	   groceries();
	   perfumes();
	   vegtables();
	   utensils();
   }   
    public static void groceries()
	{
		for( String groceries : groceries)
		{
			System.out.println(groceries);
		}
	}
	 public static void perfumes()
	{
		for( String perfumes : perfumes)
		{
			System.out.println(perfumes);
		}
	}
	public static void vegtables()
	{
		for( String vegtables : vegtables)
		{
			System.out.println(vegtables);
		}
	}
	public static void utensils()
	{
		for( String utensils : utensils)
		{
			System.out.println(utensils);
		}
	}
	
	
}