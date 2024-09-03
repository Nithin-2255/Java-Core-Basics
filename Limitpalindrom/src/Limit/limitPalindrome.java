package Limit;

import java.util.Scanner;

public class limitPalindrome 
{
	public static void main(String[] args) 
	{
		
	Scanner  sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int limit=sc.nextInt();
	for(int i=10;i<=limit;i++)
	{
		int rev=0,temp=0;
		temp=i;
			while(temp>0)	
			{
				rev=(rev*10)+(temp%10);
				temp=temp/10;
			}
		if(rev==i)
		{
		 System.out.println(i);
		}
		
	}
}	
}
