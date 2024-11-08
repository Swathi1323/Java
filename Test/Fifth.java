import java.util.Scanner;
public class Fifth {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		int A=sc.nextInt();
		int B=sc.nextInt();
		float remainder=A%B;
		System.out.println(remainder);
	}

}
