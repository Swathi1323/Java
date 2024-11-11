package com.Xworks.AccessSpecifiers;
import com.Xworks.AccessSpecifiers.example.Police;

public class AppRunnner extends Police {
	public static void main(String[] args)
	{
		Bank bank=new Bank();
		//Bank bank1=new Bank("Swathi",200000,3694,"Udma");
		//bank1.displayAccountDetails();
		//bank.setBalance(200000);
		bank.displayAccountDetails();
		bank.deposite(100000);
		bank.getBalance();
//		Police officer=new Police();
		AppRunnner officer = new AppRunnner();
		officer.setDepartment("Traffic");
		Police officer1=new Police();
		officer.displayInfo();
		//officer1.setBadgeNumber(1);
		
	    
	}

}
