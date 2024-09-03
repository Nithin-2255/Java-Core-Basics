package oddev;

import java.util.Scanner;

public class sortNumber 

{
  void oe(int x)
  {
	  if(x%2==0)
	  {
		  System.out.println(x + "even number");
	  }
	  else
	  {
		  System.out.println(x + "odd number");
	  }
  }
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num");
    int num=sc.nextInt();
    sortNumber obj=new sortNumber();
    int rem;
    while(num>0)
    {
    	rem=num%10;
    	obj.oe(rem);
    	num=num/10;
    }
    	
  } 
}
