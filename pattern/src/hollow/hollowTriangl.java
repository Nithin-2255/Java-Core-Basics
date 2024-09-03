package hollow;

public class hollowTriangl 
{
	public static void main(String[] args) 
	{
		pattern(5);
	}

	static void pattern(int n)
	{
		for(int row=0;row<n;row++)
		{
			for(int s=0;s<row;s++)
			{
				System.out.print(" ");
			}
			for(int col=row;col<n;col++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
