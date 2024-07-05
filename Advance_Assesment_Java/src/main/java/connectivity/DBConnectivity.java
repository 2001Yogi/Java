package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {
	public static Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
