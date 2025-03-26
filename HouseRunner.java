class HouseRunner 
{
    public static void main(String[] house) 
	{
        House house1 = new House();
        house1.displayDetails();

        House house2 = new House("Villa");
        house2.displayDetails();

        House house3 = new House("Bungalow", 5);
        house3.displayDetails();

        House house4 = new House("Cottage", 2, "Blue");
        house4.displayDetails();

        House house5 = new House("Townhouse", 4, "Red", false);
        house5.displayDetails();

        House house6 = new House("Mansion", 10, "Beige", true, "Countryside");
        house6.displayDetails();

        House house7 = new House("Penthouse", 6, "Gray", true, "City Center", 1200000);
        house7.displayDetails();
    }
}