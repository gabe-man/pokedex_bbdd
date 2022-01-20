package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class usuariosDAO {
	final String DB_URL = "jdbc:mysql://localhost/pokedex";
	final String user="programacion";
	final String pass="paraprogramacion";
	
	public void Consulta() {
		final String query="SELECT usuario,password FROM usuarios";
		try (Connection conn = DriverManager.getConnection(DB_URL,user,pass);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			while (rs.next()) {
				System.out.print("User: " + rs.getString("usuario"));
				System.out.println(", Pass: " + rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean login(String username, String password) {
		final String query="SELECT usuario,password FROM usuarios where usuario = '"+ username + "' and password = '" + password + "'";
		try (Connection conn = DriverManager.getConnection(DB_URL,user,pass);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
