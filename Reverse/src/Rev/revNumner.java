package Rev;

import java.util.Scanner;

public class revNumner 
{
	public static void main(String[] args) 
	{
		int rev=0;
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int a=sc.nextInt();
		s=a;
		while(a>0)
		{
		rev=(rev*10)+a%10;
		a=a/10;
		}
		if(rev==s)
		{
			System.out.println("number is palindrome");
		}
		else
		{
		   System.out.println("not a palindrome");
		}
	}
}
