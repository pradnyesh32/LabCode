package bankDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;




public class DBUtils {
	
	private static Connection con;
	
	
	public static void startConnection() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static Connection getCon() {
		
		
		return con;
	}

}
