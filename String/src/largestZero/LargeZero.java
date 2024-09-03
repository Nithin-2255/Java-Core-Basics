package largestZero;

public class LargeZero 

{
	public static void main(String[] args) 
	{
		String str="00000101000000";
		int a=0;
		int i=0,b=0;
		int len=str.length();
		int longest=0;
		while(i<len)
		{
		if(str.charAt(i)=='0')
		{
			a++;
		b=a;
		}	
		else
		{
			if(a>longest)
			{
			longest=a;
			}
			a=0;
		}
		i++;
		}
		if(longest>b)
		{
			System.out.println("large sequence"+longest);
		}
		else
		{
			System.out.println("large sequence"+b);
		}
		
	}
}