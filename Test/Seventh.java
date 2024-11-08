public class Seventh {
	
	public static void main(String[] args)
	{
		int[] N= {1,2,3,7,9};
		int sum=0;
		System.out.println("The number is:");
		for(int i=0;i<N.length;i++)
		{
			System.out.print("\t"+N[i]+"\n");
		}
		for(int i=0;i<N.length;i++)
	{
		
			sum=sum+N[i];
		
	}
		System.out.println("Sum is:"+sum);
}
}
