package com.xworkz.crudenterprise.repository;
import com.xworkz.crudenterprise.entity.Laptop;



public class LaptopRepository {
	Laptop[] data=new Laptop[10];
	
	public boolean saveData(Laptop var)
	{
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==null)
			{
				data[i]=var;
				System.out.println("Laptop is saved");
				return true;
				
				
			}
		}
		return false;
	}
	
	public Laptop[] readAll() {
		
		return data;
	}
	public boolean updateByPrice(int price,String brand)
	{
		for(int i = 0; i < data.length; i++) {
			if(data[i]!=null && data[i].getPrice()==price)
					{
				
				       data[i].setBrand(brand);
				       return true;
					}
			
			}
		System.out.println("price is not found");
		return false;
	}
	
	public boolean deleteByPrice(int price)
	{
		for (int i = 0; i < data.length; i++) {
			if(data[i]!=null && data[i].getPrice()==price)
			{
				data[i]=null;
				return true;
			}
			
		}
		System.out.println("Invalid input");
		return false;
	}
	
	public Laptop findByPrice(int price)
	{
		for(int i = 0; i < data.length; i++) {
			if(data[i]!=null && data[i].getPrice()==price)
			{
			  return data[i];
			  
		}
	}
		System.out.println("price not found");
		return null;

	}
	

}
