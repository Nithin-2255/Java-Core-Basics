package While;

import java.util.Scanner;

public class whileCLass 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  int b=1;
	  while(num>0&&b<=12)
	  {
		  System.out.println( num+"*"+b+"="+(num*b));
		++b;  
	  }
	}
}
