class PaperRunner
{
	public static void main(String paper[])
	{
		Paper paper1 = new Paper();
		paper1.displayDetails();
		
        Paper paper2 = new Paper("Letter");
		paper2.displayDetails();
		
        Paper paper3 = new Paper("Legal", 80);
		paper3.displayDetails();
		
        Paper paper4 = new Paper("Glossy", 100, "Blue");
		paper4.displayDetails();
		
        Paper paper5 = new Paper("Newsprint", 50, "Gray", false);
		paper5.displayDetails();
		
        Paper paper6 = new Paper("Cardstock", 200, "Red", true, "A3");
		paper6.displayDetails();
		
        Paper paper7 = new Paper("Poster", 300, "Black", false, "A2", 15);
		paper7.displayDetails();
    
	}
}