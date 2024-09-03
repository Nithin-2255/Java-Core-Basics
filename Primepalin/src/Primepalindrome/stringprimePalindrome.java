package Primepalindrome;

import java.util.Scanner;

public class stringprimePalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String ar[]= {"27","454","181","191","535"};
		
		for(int i=0;i<ar.length;i++)
		{
			int a=Integer.parseInt(ar[i]);
		 prime(a);	
		}
	  
	}
	
	
	
	static void prime(int a)
	{
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
			palindrome(a);
		}

	}
	
	 static void palindrome(int a)
	{
		int rev=0;
		int s=a;
		while(a>0)
		{
		rev=(rev*10)+a%10;
		a=a/10;
		}
		if(rev==s)
		{
			System.out.println(s + "number is Prime palindrome");
		}
	}

}