package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Listar
{
	static ArrayList al=new ArrayList();	
	static Scanner sc=new Scanner(System.in);

//addnum function


	static void addNum()
	{
		System.out.println("1.Add integer");
		System.out.println("2.Add string");
		System.out.println("3.Add float");
		System.out.println("Select an option ");
		int ad=sc.nextInt();
		switch(ad)
		{
			case 1: addInt();
					break;
					
			case 2: addString();
					break;
					
			case 3: addFloat();
					break;
					
			default:
		 		System.out.println("Enter valid option");
					
		}
		menu();
	}

	static void addInt()
	{
		System.out.println(" Enter the value to add ");
		al.add(sc.next());
	addNum();
	}
	static void addString()
	{	
	    System.out.println(" Enter the String ");
		String s=sc.nextLine();
		al.add(s);
		addNum();
	}
	static void addFloat()
	{
		System.out.println(" Enter the value to add ");
		al.add(sc.next());
		addNum();
	}
	
	
//view function
	 static Scanner sd=new Scanner(System.in);
	static void view()
	{
		if(al.isEmpty())
		{
			System.out.println("The List is Empty");
		}
		else
		{
		System.out.println("1.To view all elements");
		System.out.println("2.To view index at a location");
		int ab=sd.nextInt();
		switch (ab)
		{
		case 1:viewAll();
				break;
				
		case 2: viewOne();
				break;
				
			default:
				System.out.println("Invalid option");
				
		}
		}
		
		menu();
	}
	
	static void viewAll()
	{
			
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(i+"index with value" + al.get(i));
		}
		view();
	}
	static void viewOne()
	{		
		System.out.println("Enter the element index");
		int index=sc.nextInt();
		System.out.println(al.get(index));
		view();
	}
	
//	Reset function
	
	static void Reset()
	{
		al.clear();
	}
//Main function
	
	static void menu()
	{
	
		System.out.println("1.Add Elements ");
		System.out.println("2.view elements");
		System.out.println("3.Reset elements");
		Scanner sa=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
			case 1: addNum();
					break;
		
								
			case 2: view();
					break;
					
			case 3:Reset();
					break;
		
		     default:
		    	 System.out.println("emneter valid option");
		}
		}
	public static void main(String[] args) 
	{
		menu();
		
	}
}