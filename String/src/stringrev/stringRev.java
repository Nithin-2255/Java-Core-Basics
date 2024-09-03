package stringrev;

import java.util.Scanner;

public class stringRev 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int a=str.length()-1;
		String rev="";
	while(a>=0)
	{
		rev=rev+str.charAt(a);
		a--;
	}
	System.out.println(rev);
	}
}
