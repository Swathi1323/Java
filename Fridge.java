public class Fridge
{
	String brand;
	double price;
	String model;
	String capacity;
	String type;


	public void display()
	{
		System.out.println("Brand name:"+brand+"\nPrice:"+price+"\nModel:"+model+"\nCapacity:"+capacity+"\nType:"+type);
	}
	public void isOn()
	{
		boolean isOn=true;
		System.out.println("Fridge is on");
	}
	public void isOff()
	{
		boolean isOff=true;
		System.out.println("Fridge is off");
	}
	public void temperature()
	{
		int temp=36;
		System.out.println("Temperature is:"+temp);
	} 
}