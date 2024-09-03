package stringdemo;

import java.util.Scanner;

public class stringCreation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=sc.nextLine();
		int a= name.length()-1;
	while(a>=0)
	{
	System.out.print( name.charAt(a));
	a--;
	}
	}
}
