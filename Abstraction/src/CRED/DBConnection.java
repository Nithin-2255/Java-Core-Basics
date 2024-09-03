package CRED;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection 
{

	public static Statement stmt=null;
	public static Statement createStmt()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","2255");
			 stmt=con.createStatement();
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		return stmt;
	}
}
