package tupes;

import java.util.Scanner;

public class Odd 
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("1:largest of 3 Numbers");
	 System.out.println("2:odd or even");
	 System.out.println("3:multiplication Table");
	 int a=sc.nextInt();
	 Odd obj=new Odd();
	 	switch(a)
	 	{
	 	case 1:obj.large();
	 		break;
 		
	 	case 2:obj.ode();
 			break;
 		
	 	case 3:obj.mult();
	 		break;
 		
 		default:
 			System.out.println("Enter valid option");
 		
 	}	
	}
	void large()
	{
	    Scanner ab=new Scanner(System.in);
	    System.out.println("Enter the first num");
		int c=ab.nextInt();
		System.out.println("Enter the second num");
		int d=ab.nextInt();
		System.out.println("Enter the third num");
		int e=ab.nextInt();
			if(c>d&c>e)
			{
			System.out.println(c +" is greater");
			}
			else if(d>e)
			{
				System.out.println(d + " is greater");
			}
			else 
			{
				System.out.println(e +"is greater");
			}
	}
	void ode()
	{
		  Scanner bc=new Scanner(System.in);
		    System.out.println("Enter the  num");
			int c=bc.nextInt();
				if(c%2==0)
				{
				System.out.println("even number");
				}
				else 
				{
					System.out.println("odd number");
				}
	}
	void mult()
	{
		Scanner cd=new Scanner(System.in);
	    System.out.println("Enter a num greater than 0");
	    int c=cd.nextInt();
	    int f=1;
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    
	    System.out.println( c+"*"+f+"="+(c*f));
	    ++f;
	    
	    
	}
}
