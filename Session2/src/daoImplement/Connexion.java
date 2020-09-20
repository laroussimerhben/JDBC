package daoImplement;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	public Connection conn;
	{
		String url = "jdbc:mysql://localhost:3306/";
		String dbName;
		dbName = "session_formation?useTimezone=true&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "";
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("la connexion a reussie");
		} catch (Exception e) {
			System.out.println("la connexion est echou");
		}
	}

}
