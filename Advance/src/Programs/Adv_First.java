package Programs;
import java.sql.*;

public class Adv_First {

	private static final String Driver_class = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String username = "xe";
	private static final String password = "xe";

	public static void main(String args[]) {
		try {
			Class.forName(Driver_class);
			Connection con = DriverManager.getConnection(url,username ,password );
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from XE.employee");
			while (rs.next()) 
				
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}