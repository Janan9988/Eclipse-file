package Programs;

import java.sql.*;

public class Adv_third_prg {

	
		private static final String Driver_class="oracle.jdbc.driver.OracleDriver";
		private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private static final String username = "xe";
		private static final String password = "xe";
	
		public static void main(String[] args) {
			try {
				Class.forName(Driver_class);
				Connection con = DriverManager.getConnection(url,username ,password );
				Statement stmt = con.createStatement();
	
				int executeUpdate = stmt.executeUpdate("insert into Hari values('101','7094333003','23')"); 
				
				 System.out.println( executeUpdate);
				 con.close();
			} catch (Exception e) {
				e.printStackTrace();
				 
				 
				 
				}
              
	}

}
