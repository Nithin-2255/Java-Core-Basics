package squreofnum;

import java.util.Scanner;

public class squareNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int ar[]= {2,4,6,8,10};
		for(int i=0;i<ar.length;i++)
		{
			int m=ar[i]*ar[i];
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]==m)
				{
				System.out.println(ar[i]+"have its square in array"+m);
				}
			}
			
		}
	}
}
