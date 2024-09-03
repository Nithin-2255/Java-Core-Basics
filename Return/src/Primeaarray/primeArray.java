package Primeaarray;

public class primeArray 
{
	public static void main(String[] args) 
	{
		int ar[]= {20,3,5,1,7,9,11};
		primeArray ab=new primeArray();
		for(int i=0;i<ar.length;i++)
		{
			int a=ar[i];
			int result=ab.prime(a);
			if(result==0)
			{
				System.out.println(a + "is prime");
			}
			else
			{
				System.out.println(a+ "Not prime");
			}
		}
	}
	int prime(int a)
	{
		int flag=0;
		for(int j=2;j<a/2;j++)
		{
			if(a%j==0)
			{
				flag=1;
			}
		}
		return flag;
		
	}
}