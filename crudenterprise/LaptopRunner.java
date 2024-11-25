package com.xworkz.crudenterprise;

import com.xworkz.crudenterprise.entity.Laptop;
import com.xworkz.crudenterprise.repository.LaptopRepository;
import com.xworkz.crudenterprise.service.LaptopService;

public class LaptopRunner {
	
	public static void main(String[] args) {
	     Laptop  laptop=new Laptop("Asus",8,250,100000,"Blue");
	     Laptop  laptop1=new Laptop("Mac",10,500,200000,"White");
	     Laptop  laptop2=new Laptop(null,7,250,4000000,"Black");
		
		LaptopRepository repo=new LaptopRepository();
		LaptopService service=new LaptopService();
		service.validatesave(laptop);
		service.validatesave(laptop1);
		service.validatesave(laptop2);
		Laptop[] result=service.readAll();
		for (int i = 0; i < result.length; i++) {
			if(result[i]!=null) {
			result[i].printDetails();
			
			
		}
		}
			service.updateByPrice(100000,"Victus");
			
			Laptop[] result1=service.readAll();
			for (int i = 0; i < result1.length; i++) {
				if(result1[i]!=null) {
				result1[i].printDetails();
				
				
			}
		
	}
			service.deleteByPrice(100000);
			Laptop[] result2=service.readAll();
			for (int i = 0; i < result2.length; i++) {
				if(result2[i]!=null) {
				result2[i].printDetails();
				
				
			}
		
	}
			Laptop findLaptop=service.findByPrice(100000);
		if(findLaptop!=null) {
		
		findLaptop.printDetails();
	
}
			
	}


}

