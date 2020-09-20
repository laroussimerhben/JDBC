package com.formation.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoJDBC{
	public static void main (String[]args) {
		String url="jdbc:mysql://localhost:3306/entreprise?useTimezone=true&serverTimezone=UTC";
		String login = "root";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				cn = DriverManager.getConnection(url, login, passwd);
				st = cn.createStatement();
				st.executeUpdate("insert into usine values ('8', 'mercedes', 'london')");
				rs=st.executeQuery("select * from usine");
				
				while (rs.next()) {
					System.out.print(rs.getString("NU"));
					System.out.print(""+rs.getString(2));
					System.out.println(""+rs.getString(3));
					}
				st.executeUpdate("delete from usine where NU = 6");
		
				rs=st.executeQuery("select * from usine");
				System.out.println( "apres suppression ");
						while (rs.next()) {
							
							System.out.print(rs.getString("NU"));
							System.out.print(""+rs.getString(2));
							System.out.println(""+rs.getString(3));
							}
				cn.close();
				st.close();
				rs.close();
			} 
			
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			}

}
