package TCS;
//tightly coupled
public class TCS 
{
	public static void main(String[] args) 
	{	
		Desktop hp=new Desktop();
		Laptop Dell=new Laptop();
		Developer midhun=new Developer();
		midhun.Devapp(Dell);
	}
}