package Decimaltobinary;

import java.util.Scanner;

public class decimalConversion 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the Decimal number");
	int num=sc.nextInt();
		while(num>0)
		{
			if(num%2==0)			{
				System.out.println(0);	
			}
			else 
			{
		     	System.out.println(1);
			}
			num=num/2;
		}
	}
}
