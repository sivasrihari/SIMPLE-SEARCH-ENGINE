package in.ineuron.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public DBUtil() {
		
	}
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
//	public static Connection getConnection()
//	{
//		Connection con=null;
//		try {
//			if(con==null)
//			{con=DriverManager.getConnection("jdbc:mysql://localhost:9999/ letsgrowmore","root","root123@");}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return con;
//		
//	}
	public static Connection getConnection() throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql:///letsgrowmore","root","root123@");
		return con;
	}

}
