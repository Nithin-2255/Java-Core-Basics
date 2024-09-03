package PrimeNum;

import java.util.Scanner;

public class primeNum
{
	public static void main(String[] args) 
	{
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int flag=0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println(" prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
