import java.util.Scanner;
public class Sixth {
    public static void main(String[] args)
    {
    	float X;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the kilometer from home to office:");
    	X=sc.nextFloat();
    	float dailyKilometer=X*2;
    	System.out.println("Daily travel kilometer is:"+dailyKilometer);
    	System.out.println("office is open for week is 5");
    	float totalKilometer=dailyKilometer*5;
    	System.out.println("The total number of kilometers chef travels through office trips in a week is:"+totalKilometer);
    	
    	
    	
    }
}
