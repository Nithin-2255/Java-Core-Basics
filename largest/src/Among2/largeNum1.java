package Among2;

import java.util.Scanner;

public class largeNum1
{
	public static void main(String[] args) 
	{
	largeNum1 ob=new largeNum1();
	ob.num();
	}
	void num()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first num");
		int a=obj.nextInt();
		System.out.println("enter the second num");
		int b=obj.nextInt();
		System.out.println("enter the third num");
		int c=obj.nextInt();
			if(a>b&&a>c)
			{
			System.out.println(a+ " Is Greater");
			}
			else if(b>c)
			{
				System.out.println(b + "is greater");
				
			}
			else
			{
				System.out.println(c + "is greater");
			}
	}
	
}
