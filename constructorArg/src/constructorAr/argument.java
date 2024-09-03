package constructorAr;

public class argument 
{
	private String name;
	private int age;
	public argument(String name, int age) 
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "argument [name=" + name + ", age=" + age + "]";
	}
	
}
