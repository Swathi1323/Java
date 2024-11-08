import java.util.Scanner;
public class Third {
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 int[] A=new int[5];
    	 System.out.println("Enter the array elements");
    	 for(int i=0;i<A.length;i++)
    	 {
    		 A[i]=sc.nextInt();
    	 }
    	 for(int i=0;i<A.length;i++)
    	 {
    		 System.out.println(A[i]);
    	 } 
    	 
    	 System.out.println("enter two numbers:");
    	 int a=sc.nextInt();
    	 int b=sc.nextInt();
    	 if(a==b)
    	 {
    		 System.out.println("invalid");
    	 }
    	 else
    	 {
    		 int sum=a+b;
    		 System.out.println("Sum is:"+sum);
    	 }
     }
}
