package function;

public class Method
{
	void Nithn() 
		{
		System.out.println("Welcome day 2");	
		}
	void Add()
		{
		System.out.println("a+b=c");
		}
	void diff()
		{
		 System.out.println("a-b=d");
		}
		public static void main(String[] args) 
		{
		  Method a=new Method();
		  Method b=new Method();
		  Method c=new Method();
		  a.Nithn();
		  a.Add();
		  a.diff();
		  a.Add();
		  b.Add();
		  c.diff();
		 
		}
}
