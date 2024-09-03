package add;

import java.util.Scanner;

public class addNumber
{
	public static void main(String[] args) 
	{
	addNumber ob=new addNumber();
	ob.add();

	}
	void add()
	{
		System.out.println("Enter first num");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("Enter the Second num");
		int b=obj.nextInt();
		System.out.println("sum is "+a+b);
		
		
	}
}
