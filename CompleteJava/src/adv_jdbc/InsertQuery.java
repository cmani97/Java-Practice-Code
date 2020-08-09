package adv_jdbc;

import java.sql.*;


public class InsertQuery {
	public static void main(String args[])throws Exception
	{
		String url="jdbc:mysql://localhost:3306/java";
		String user="root";
		String pass="";
		
		String uname="surya";
		String upass="syam";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		Statement st=conn.createStatement();
		//String query="insert into student values('syamala','syam')";
		String query="insert into student values('"+uname+"','"+upass+"')";
		int count=st.executeUpdate(query);
		
		System.out.println("count is"+count);
//		while(rs.next())
//		{
//				String uname=rs.getString("username");
//				String upass=rs.getString("password");
//			System.out.println("username is "+uname+" and password is "+upass);
//		}
		
		
		st.close();
		conn.close();
	}
}
