package Large;

public class largeNum 
{
	public static void main(String[] args)  
	{	
		largeNum a=new largeNum();
				a.checkNum();
	}
	void checkNum()
	{
		
	int a=10;
	int b=20;
	int c=30;
		if(a>b&&a>c)
		{
			System.out.println( a+" is Greater");
		}
		else if(b>c&&b>a)
		{
			System.out.println(b +" is Greater");
		}
		else 
		{
			System.out.println(c+" is Greater");
		}
		
	}
}
