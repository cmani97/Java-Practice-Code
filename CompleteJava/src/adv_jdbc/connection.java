package adv_jdbc;
import java. sql.*;


public class connection {
	private static final String url="jdbc:mysql://localhost/java";
	private static final String uname="root";
	private static final String pass="";
	static Connection conn = null;

	static
	{
		try
		{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,uname,pass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection()
	{
		return conn;
	}
}
