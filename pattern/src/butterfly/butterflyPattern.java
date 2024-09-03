package butterfly;

public class butterflyPattern 
{
	public static void main(String[] args) 
	{
		pattern(5);
	}
	
	static void pattern(int n)
	{
//		up
		
		for(int row=0;row<n;row++)
		{
			
			for(int col=0;col<=row;col++)
			{
				System.out.print("*");
			}
			for(int s=0;s<2*n;s++)
			{
				System.out.print(" ");
			}
				for(int col=row;col<=n;col++)
				{
				System.out.print("*");
				}
			
			System.out.println();
		}
	
		
//	down	
		for(int row=0;row<n;row++)
		{
			for(int col=row;col<n;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		for(int space=0;space<n;space++)
		{
			System.out.print(" ");
		}
		
	}
}
