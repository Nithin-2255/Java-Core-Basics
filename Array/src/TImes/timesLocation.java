package TImes;

import java.util.Scanner;

public class timesLocation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int ar[]=new int [6];
	    int count=0;
	    int pos[]=new int[6];
	    System.out.println("Enter the numbers");
		for (int i=0;i<ar.length;i++)
		{
		 ar[i]=sc.nextInt();
		}
		System.out.println("please eneter the number to be located ");
		int a=sc.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			if(a==ar[i])
			{
				pos[count]=i+1;
				count++;	
			}
		}
		System.out.println("you are entered"+a+"and its found "+count+"times and locations at");
		for(int j=0;j<count;j++)
		{
			System.out.print(pos[j]);
		}
	}
}
