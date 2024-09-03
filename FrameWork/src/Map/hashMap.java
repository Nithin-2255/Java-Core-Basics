package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap 
{
	public static void main(String[] args)
	{
	Map<Integer,String> mp=new HashMap();
	mp.put(1,"Nithin");
	mp.put(2,"Midhun");
	Set s=mp.entrySet();
	System.out.println(mp.keySet());
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
