package Duplicate;
public class DuplicateNum 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,3,4,5,2,3,4,1,2,3,3,1};
	    int newar[]=new int[ar.length];
	    int a=0;
	    int j=0;
		for(int i=0;i<ar.length;i++)
		{
			
			for(j=0;j<a;j++)
			{
				if(ar[i]==newar[j])
				{
					break;
				}
			}
				if(j==a)
				{
					newar[a]=ar[i];
					a++;
				}
					
			}
		for(int i:newar)
		{
			System.out.println(i);
		}
	}
}
