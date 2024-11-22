package com.xworkz.enterprisecrud;

import java.util.Iterator;

import com.xworkz.enterprisecrud.entity.Car;
import com.xworkz.enterprisecrud.service.CarService;
import com.xworkz.enterprisecrud.repository.*;


public class CarRunner {

	public static void main(String[] args) {
	     Car  car=new Car("BMW",4,1000000,"Blue");
		Car car1=new Car("Benz",4,20000,"Black");
		Car car2=new Car(null,4,20000,"Black");
		
		CarRepository repo=new CarRepository();
		CarService service=new CarService();
		service.validatesave(car);
		service.validatesave(car1);
		service.validatesave(car2);
		Car[] result=service.readAll();
		for (int i = 0; i < result.length; i++) {
			if(result[i]!=null) {
			result[i].printDetails();
			
			
		}
		
	}
	}
}
