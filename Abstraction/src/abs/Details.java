package abs;

public class Details extends Personalnfo
{

	@Override
	public void name()
	{

		System.out.println("nithin kumar s");
	}

	@Override
	public void address() 
	{
		System.out.println("Neethu sree tvm");
	}

	@Override
	public void contact()
	{
		
		System.out.println("8089163815");
	}
 public static void main(String[] args) 
 {
Details ob=new Details();
ob.name();
ob.address();
ob.contact();
 }
}
