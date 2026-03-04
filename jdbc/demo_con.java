import java.sql.*;

class ConnectMysql
{
	public static void main(String a[])throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
		if(con==null)
			System.out.println("Connection Error");
		else 
			System.out.println("Connection Established");
	}
}