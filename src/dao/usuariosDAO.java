package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Usuario;

public class usuariosDAO extends AbstractDAO{
	public void Consulta() {
		final String query="SELECT usuario,password FROM usuarios";
		try (
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
			stmt.executeUpdate(INSERT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
