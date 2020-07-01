package prevreg.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

	private static Connection conn = null;
	private String driver;
	private String url;
	private String usuario;
	private String password;
	
	private Conexion() {
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		driver = "oracle.jdbc.driver.OracleDriver";
		usuario = "system";
		password = "paula";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);	
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if (conn == null) {
			new Conexion();
		}
		return conn;
	}
	
	
}
