package methodoverloading;

import java.util.Scanner;

public class methodOverloading 
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("1: Area of circle");
		 System.out.println("2: Area of rectangle");
		 System.out.println("3: Area of triagle");
		 System.out.println("4: Area of square");
		 System.out.println("Please Selct an option");
		 int num=sc.nextInt();
		 methodOverloading obj=new methodOverloading();
		 switch(num)
		 	{
		 	case 1:obj.area(3);
		 		break;
		 		
		 	case 2:obj.area(2,3);
		 		break;
		 		
		 	case 3:obj.area(3);
		 		break;
		 		
		 	case 4:obj.area(4,5);
		 		break;
		 		
		 		default:
		 		System.out.println("Enter valid option");
		 		
		 	}	
		 
		}
	static void area(int r)
	{
		System.out.println("the area of circle is"+(r*r*3.14));
	}
	
	static void area(int x,int y)
	{
		System.out.println("the area of rectangle  is"+(x*y));
	}
	static void area(double x,double y)
	{
		System.out.println("the area of triangle is "+(0.5*x*y));
	}
	static void area(double x)
	{
		
		System.out.println("the area of square is "+(x*x));
	}
}
