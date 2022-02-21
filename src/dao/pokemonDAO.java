package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Pokemon;

public class pokemonDAO extends AbstractDAO{
	public pokemonDAO() {
		
	}
	
	public Pokemon first() {
		final String QUERY = "Select num, nombre, altura, peso, tipo1, tipo2, sexo, capturado, descripcion, imagen from pokemon";
		try {
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				var num = rs.getInt("num");
				String nombre = rs.getString("nombre");
				double altura = rs.getDouble("altura");
				double peso = rs.getDouble("peso");
				String tipo1 = rs.getString("tipo1");
				String tipo2 = rs.getString("tipo2");
				String sexo = rs.getString("sexo");
				boolean capturado = rs.getBoolean("capturado");
				String descripcion = rs.getString("descripcion");
				String imagen = rs.getString("imagen");
				Pokemon p = new Pokemon(num, nombre, altura, peso, tipo1, tipo2, sexo, capturado, descripcion, imagen);
				return p;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Pokemon> getAll() {
		final String QUERY = "Select num, nombre, altura, peso, tipo1, tipo2, sexo, capturado, descripcion, imagen from pokemon";
		var pokemon = new ArrayList<Pokemon>();
		try {
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				var num = rs.getInt("num");
				String nombre = rs.getString("nombre");
				double altura = rs.getDouble("altura");
				double peso = rs.getDouble("peso");
				String tipo1 = rs.getString("tipo1");
				String tipo2 = rs.getString("tipo2");
				String sexo = rs.getString("sexo");
				boolean capturado = rs.getBoolean("capturado");
				String descripcion = rs.getString("descripcion");
				String imagen = rs.getString("imagen");
				Pokemon p = new Pokemon(num, nombre, altura, peso, tipo1, tipo2, sexo, capturado, descripcion, imagen);
				pokemon.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pokemon;
	}
	
	public void insert(Pokemon p) {
		final String INSERT = "INSERT INTO pokemon(num, `nombre`,`altura`,`peso`,`tipo1`"
				+ ",tipo2, sexo, capturado, descripcion, imagen)\r\n" + "VALUES(" + p.getNum() + ",'" + p.getNombre() + "',"
				+ p.getAltura() + "," + p.getPeso() + ",'" + p.getTipo1() + "','"
				+ p.getTipo2() +"','" +p.getSexo()+"',"+p.isCapturado()+",'"+p.getDescripcion()+"','"+p.getImagen()+ "');";
		try {
			stmt.executeUpdate(INSERT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Pokemon p) {
		final String DELETE = "delete from pokemon where num = " + p.getNum();
		try {
			stmt.executeUpdate(DELETE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Pokemon p) {
		final String UPDATE = "UPDATE pokemon\r\n" + "SET\r\n" + "num = " + p.getNum() + ",\r\n"
				+ "nombre = '" + p.getNombre() + "',\r\n" + "altura = " + p.getAltura() + ",\r\n"
				+ "peso = " + p.getPeso() + ",\r\n" + "tipo1 = '" + p.getTipo1() + "',\r\n"
				+ "tipo2 = '" + p.getTipo2() + "',\r\n" + "sexo = '" + p.getSexo() + "',\r\n"
				+ "capturado = " + p.isCapturado() + ",\r\n" + "descripcion = '" + p.getDescripcion() + "',\r\n"
				+ "imagen = '" + p.getImagen() + "'\r\n"
				+ "WHERE num = " + p.getNum() + ";";
		try {
			stmt.executeUpdate(UPDATE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
