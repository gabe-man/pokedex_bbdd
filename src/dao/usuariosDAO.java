package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Usuario;

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
	
	public boolean login(Usuario usuario) {
		final String query="SELECT usuario,password FROM usuarios where usuario = '"+ usuario.getUsuario() + "' and password = '" + usuario.getcontraseña() + "'";
		try {
			Connection conn = DriverManager.getConnection(DB_URL,user,pass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void register(Usuario usuario)
	{
		final String INSERT = "INSERT INTO usuarios (usuario, password)"
				+ " VALUES ('" + usuario.getUsuario() + "', '" + usuario.getcontraseña() + "');";
		try {
			Connection conn = DriverManager.getConnection(DB_URL, user, pass);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(INSERT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
