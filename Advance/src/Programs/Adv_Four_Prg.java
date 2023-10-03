package Programs;

import java.sql.*;
import java.sql.DriverManager;

public class Adv_Four_Prg {

	
	  private static final String Driver_Class = "oracle.jdbc.driver.OracleDriver";
	  private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	  private static final String username ="xe";
	  private static final String password = "xe";
	
	public static void main(String[] args) {
		try {
			Class.forName(Driver_Class);
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			int executeUpdate = stmt.executeUpdate("UPDATE Customers SET Contact = '7' where City = '67'");
			System.out.println(executeUpdate);
			con.close();
			}catch (Exception e) {
				System.out.println(e);
			}	
		
	}

}
