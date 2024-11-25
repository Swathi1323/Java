package com.xworkz.crudenterprise.service;

import com.xworkz.crudenterprise.entity.Laptop;
import com.xworkz.crudenterprise.repository.LaptopRepository;



public class LaptopService {
	LaptopRepository repo=new LaptopRepository();
	
	public boolean validatesave(Laptop ref)
	{
			if(ref.getBrand()!=null && ref.getBrand().length()>1)
			{
				if(ref.getStorage()>100)
				{
					if(ref.getPrice()>5000)
					{
						System.out.println("Laptop is valid");
						return repo.saveData(ref);
					}
				}
				return false;
				
			}
			
		System.err.println("Laptop is not valid");
		return false;
	

}
	public Laptop[] readAll()
	{
		return repo.readAll();
	}
	
	public boolean updateByPrice(int price,String brand)
	{
		if(price!=0 && price>0)
		{
			return repo.updateByPrice(price,brand);
		}
	
	System.out.println("Input invalid");
	return false;
	
}
	
	public boolean deleteByPrice(int price)
	{
		if(price!=0&&price>0)
		{
			return repo.deleteByPrice(price);
		}
	System.out.println("price is not found");
	return false;
}
	public Laptop findByPrice(int price)
	{
		if(price!=0 && price>0)
		{
			return repo.findByPrice(price);
		}
	
	System.out.println("Invalid input");
	return null;
}
}
