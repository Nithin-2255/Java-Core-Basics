package CRED;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class cred 
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the name ");
//		String name=sc.nextLine();
//		System.out.println("Enter the place");
//		String place=sc.nextLine();
		try 
		{
//		String sql="insert into demo(name,place)values('"+name+"','"+place+"')"	;
		String sq2="update demo set place='varkala' where name='nithin'" ;
		Statement stmt=DBConnection.createStmt();	
		int a=stmt.executeUpdate(sq2);
		if(a==1)
		{
			System.out.println("updated ");
		}
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
