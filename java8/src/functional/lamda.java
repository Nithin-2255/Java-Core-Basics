package functional;

interface nithin
{
	String display(String str);
}

class lamda
{
	public static void main(String[] args) 
	{
		nithin n=(str)->
		{
			return "hi"+str;
		};
		System.out.println(n.display("nithin"));
	}
}
