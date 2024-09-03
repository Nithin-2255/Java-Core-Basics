package arithmetic;

import java.util.Scanner;

public class arithmeticExpression 
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("1: Addition");
	 System.out.println("2: substraction");
	 System.out.println("3: Multiplication");
	 System.out.println("4: Division");
	 System.out.println("Please Selct an option");
	 int num=sc.nextInt();
	 arithmeticExpression ob1=new arithmeticExpression();
	 switch(num)
	 	{
	 	case 1:ob1.add();
	 		break;
	 		
	 	case 2:ob1.sub();
	 		break;
	 		
	 	case 3:ob1.mul();
	 		break;
	 		
	 	case 4:ob1.div();
	 		break;
	 		
	 		default:
	 		System.out.println("Enter valid option");
	 		
	 	}	
	 
	}
	void add()
	{
	Scanner ab=new Scanner(System.in);	
	System.out.println("Enter the first num");
	int a=ab.nextInt();
	System.out.println("Enter the second number");
	int b=ab.nextInt();
	System.out.println("The sum is"+ (a+b));
	}
	
	void sub()
	{
	Scanner bc=new Scanner(System.in);	
	System.out.println("Enter the first num");
	int a=bc.nextInt();
	System.out.println("Enter the second number");
	int b=bc.nextInt();
	System.out.println("The Difernece is"+ (a-b));
	}
	void mul()
	{
	Scanner cd=new Scanner(System.in);	
	System.out.println("Enter the first num");
	int a=cd.nextInt();
	System.out.println("Enter the second number");
	int b=cd.nextInt();
	System.out.println("The multiplied result is "+ (a*b));
	}
	void div()
	{
	Scanner de=new Scanner(System.in);	
	System.out.println("Enter the first num");
	int a=de.nextInt();
	System.out.println("Enter the second number greater than 0");
	int b=de.nextInt();
	System.out.println("The result is"+ (a/b));
	}
}	
