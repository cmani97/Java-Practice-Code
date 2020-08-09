package adv_jdbc;
import java.sql.*; 
 
public class FirstJDBC {
	public static void main(String args[])throws Exception
	{
		String url="jdbc:mysql://localhost/java";
		String user="root";
		String pass="";
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		Statement st=conn.createStatement();
		String query="select username,password from student";
		ResultSet rs=st.executeQuery(query);
		
		System.out.println("farword");
		while(rs.next())
		{
				String uname=rs.getString("username");
				String upass=rs.getString("password");
			System.out.println("username is "+uname+" and password is "+upass);
		}
		System.out.println("backword");
		while(rs.previous())
		{
				String uname=rs.getString("username");
				String upass=rs.getString("password");
			System.out.println("username is "+uname+" and password is "+upass);
		}
		System.out.println("ramdom");
		rs.absolute(2);
		String uname=rs.getString("username");
		String upass=rs.getString("password");
		System.out.println("username is "+uname+" and password is "+upass);
		
		System.out.println("first one in db");
		
		rs.first();
		String funame=rs.getString("username");
		String fupass=rs.getString("password");
		System.out.println("username is "+funame+" and password is "+fupass);
		
		System.out.println("last one in db");
		
		rs.last();
		String luname=rs.getString("username");
		String lupass=rs.getString("password");
		System.out.println("username is "+luname+" and password is "+lupass);
		
		
		st.close();
		conn.close();
	}
}
