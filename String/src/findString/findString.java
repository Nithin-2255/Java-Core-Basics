package findString;

import java.util.Scanner;

public class findString 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	System.out.println("Enter the character to search");
	char find=sc.next().charAt(0);
	int a=0;
	int i=0;
	int len=str.length();
	while(i<len)
	{
	if(str.charAt(i)==find)
	{
		a++;
		System.out.println("the character is found at"+ (i));
		
	}
	i++;
	}
	System.out.println("total number of charcter in the string" +a);
}
}
