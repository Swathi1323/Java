public class Tablet
{
	String brand;
	float displaySize;
    int batteryCapacity;
    int storage;


    public static void update()
    {

    }

    public static void chargeBattery()
    {

    }

    public static void browseInternet()
    {

    }
    public Tablet(String brand,float displaySize,int batteryCapacity,int storage)
    {
    	this.brand=brand;
    	this.displaySize=displaySize;
    	this.batteryCapacity=batteryCapacity;
    	this.storage=storage;

    }
    public Tablet()
    {
    	this.brand="Google";
    	this.displaySize=11f;
    	this.batteryCapacity=7620;
    	this.storage=256;
    }
    public void printDetails()
    {
    	System.out.println("Brand:"+brand+"\nDisplay size:"+displaySize+"\nBattery Capacity:"+batteryCapacity+"\nStorage:"+storage);
    }

}