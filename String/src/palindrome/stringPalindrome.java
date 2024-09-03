package palindrome;

import java.util.Scanner;

public class stringPalindrome
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String name=sc.nextLine();
			int a= name.length()-1;
			String rev="";
		while(a>=0)
		{
			rev=rev+name.charAt(a);
			a--;
		}
		if(name.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
