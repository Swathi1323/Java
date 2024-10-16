public class Tablets
{
	String brand;
	float displaySize;
    int batteryCapacity;
    int storage;

    public Tablets()
    {
    System.out.println("No parametrized constructor");
    }
    public Tablets(String brand,float displaySize,int batteryCapacity,int storage)
    {
    	this.brand=brand;
    	this.displaySize=displaySize;
    	this.batteryCapacity=batteryCapacity;
    	this.storage=storage;

    }
    public void displayDetails()
    {
     System.out.println("Brand:"+brand+"\nDisplay size:"+displaySize+"\nbatteryCapacity:"+batteryCapacity+"\nStorage:"+storage);
    }
}