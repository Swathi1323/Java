import java.util.Scanner;
public class Main 
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int[] arr={2,3,4,5,6};
        System.out.println("enter the number");
          int x=sc.nextInt();
          for(int i=0;i<arr.length;i++)
          {

            if(x==arr[i])
            {
              System.out.println("Yes");

            }   
            else
            {
              System.out.println("no");
            }
            }
        }
          }

