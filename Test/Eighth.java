import java.util.Scanner;
public class Eighth {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int totalNumberOfChocolates=100;
		System.out.println("Daily goal to sell is:");
		int X=sc.nextInt();
		int earning=X*1;
		System.out.println("for earning daily goal is 1 rupee\n so daily he will get:"+earning);
		System.out.println("number of extra sold chocolates are:");
		int Y=sc.nextInt();
		int extraEarnings=Y*2;
		System.out.println("Total earnings for extra is"+extraEarnings);
		int totalEarnings=earning+extraEarnings;
		if(totalEarnings<=100)
		{
		System.out.println("Total earnings:"+totalEarnings);
	}
		else
		{
			System.out.println("Invalid input");
		}

}
}