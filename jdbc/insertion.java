import java.sql.*;
import java.util.*;

class InsertMySql
{
	public static void main(String a[])throws SQLException, ClassNotFoundException
	{
		int pid, pprice;
		String pname;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
		
		if (con==null)
		{
			System.out.println("ConnectionError");
		}
		else
		{
			System.out.println("Connected to Database");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Product ID, Name, Price");
			pid=sc.nextInt();
			pname=sc.next();
			pprice=sc.nextInt();
			
			PreparedStatement ps= con.prepareStatement("INSERT INTO `product`(`pid`, `pname`, `pprice`) VALUES (?,?,?)");
			ps.setString(2,pname);
			ps.setInt(3,pprice);
			ps.setInt(1,pid);
			
			int x= ps.executeUpdate();
			if (x>0)
				System.out.println("Data Inserted Sucessfully");
			else 
				System.out.println("Error in Insertion");
		}
	}
}