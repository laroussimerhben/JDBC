package demo_JDBC_entreprise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection_entreprise {
	public static void main(String[] args) {
		//declaration des variables de connection //
		String url = "jdbc:mysql://localhost:3306/entreprise?useTimezone=true&serverTimezone=UTC";
		String login = "root";
		String passwrd = "";
		//declaration des parametres des requetes sql //
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			//charger les pilotes JDBC//
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creation de la connection//
			cn = DriverManager.getConnection(url, login, passwrd);
			//creation de la requete

			st = cn.createStatement();
			st.executeUpdate("insert into usine values ('10', 'mercedes', 'london')");
			//execution de la requete //
			rs = st.executeQuery("select * from usine");

			while (rs.next()) {
				System.out.println(rs.getString("NU"));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}

			cn.close();
			st.close();
			rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
