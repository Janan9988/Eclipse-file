package Programs;
import java.sql.*;

public class Adv_second_prg {

	
		private static final String  Driver_class= "oracle.jdbc.driver.OracleDriver";
		private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private static final String username="xe";
		private static final String password="xe";
		
		public static void main(String[] args) {
			try {
				Class.forName(Driver_class);
				Connection con = DriverManager.getConnection(url,username ,password );
				Statement stmt = con.createStatement();
				 int one = stmt.executeUpdate("delete from superstar where name ='Hari' ");
					System.out.println(one);
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

