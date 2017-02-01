import java.sql.*;
public class DbInsertRecord
{
	public static void main(String args[])
	{
		try
		{
			//to register driver
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			System.out.println("DRIVERS REGISTERED...");
			
			//to create connection
			
			Connection con=DriverManager.getConnection("jdbc:odbc:employee");
			System.out.println("CONNECTION ESTABLISHED...");
			
			//to create statement object
			
			Statement st=con.createStatement();
			
			//create table
			
			st.execute("create table emp(id int,salary int,name text)");
			System.out.println("TABLE CREATED...");
			
			//insertion of records
			
			st.executeUpdate("insert into emp(id,salary,name)values(1,10000,'Bruce')");
			System.out.println("RECORD INSERTED...");
			
			//closing connections
			
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("SQL ERROR OCURRED...");
		}
	}
}