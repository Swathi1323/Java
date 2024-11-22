package com.xworkz.enterprisecrud.repository;

import com.xworkz.enterprisecrud.entity.Car;
import com.xworkz.enterprisecrud.service.*;

public class CarRepository {
	
	Car[] data=new Car[10];
	
	
	public boolean saveData(Car var)
	{
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==null)
			{
				data[i]=var;
				System.out.println("Car is saved");
				return true;
				
				
			}
		}
		return false;
	}
	
	public Car[] readAll() {
		
		return data;
	}


}
