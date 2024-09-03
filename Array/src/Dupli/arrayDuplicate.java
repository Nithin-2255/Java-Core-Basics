package Dupli;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class arrayDuplicate 
{	
	
	public static void main(String[] args) 
	{
	int ar[]= {5,1,1,1,2,3,5,4,3,5};
	Set ar1=new HashSet();
	for(int num:ar)
	{
		ar1.add(num);
	}
	Iterator itr =ar1.iterator();
	
	while(itr.hasNext())
	{
		System.out.print( itr.next());
	}
	}	
}
