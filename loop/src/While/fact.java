package While;

import java.util.Scanner;

public class fact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int fact=1;
		while(num>=1)
		{
			fact=fact*num;
			num--;
	    
		}
		System.out.println("factorial is " +fact);
	}
}
