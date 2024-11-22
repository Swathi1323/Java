package com.xworkz.enterprisecrud.service;

import com.xworkz.enterprisecrud.entity.Car;
import com.xworkz.enterprisecrud.repository.CarRepository;

public class CarService {
	//Car[] car=new Car[10];
	CarRepository repo=new CarRepository();
	
	
	public boolean validatesave(Car ref)
	{
			if(ref.getBrand()!=null && ref.getBrand().length()>1)
			{
				if(ref.getNoOfWheels()>2)
				{
					if(ref.getPrice()>5000)
					{
						System.out.println("Car is valid");
						return repo.saveData(ref);
					}
				}
				return false;
				
			}
			
		System.err.println("Car is not valid");
		return false;
	

}
	public Car[] readAll()
	{
		return repo.readAll();
	}
	
}
