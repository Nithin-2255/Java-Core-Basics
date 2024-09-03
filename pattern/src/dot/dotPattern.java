package dot;

public class dotPattern 
{
	public static void main(String[] args) 
	{
		pattern(6);
	}

	static void pattern(int n)
	{
		for(int row=0;row<n;row++)
		{
			for(int s=0;s<n;s++)
			{
				System.out.print(" ");
			}
			for(int col=0;col<row;col++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}	