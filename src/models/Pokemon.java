package models;

import tipos.sexopokemon;
import tipos.tipospokemon;

public class Pokemon {
	private int num;
	private String nombre;
	private double altura;
	private double peso;
	private tipospokemon tipo1;
	private tipospokemon tipo2;
	private sexopokemon sexo;
	private boolean capturado;
	private String descripcion;
	private String imagen;
	
	public Pokemon(String nombre, double altura, double peso, tipospokemon tipo1, tipospokemon tipo2, sexopokemon sexo,
			boolean capturado, String descripcion, String imagen) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.sexo = sexo;
		this.capturado = capturado;
		this.descripcion = descripcion;
		this.imagen=imagen;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public tipospokemon getTipo1() {
		return tipo1;
	}

	public tipospokemon getTipo2() {
		return tipo2;
	}

	public sexopokemon getSexo() {
		return sexo;
	}

	public boolean isCapturado() {
		return capturado;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public String getImagen() {
		return imagen;
	}

	@Override
	public String toString() {
		return "Pokemon [num=" + num + ", nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", tipo1="
				+ tipo1 + ", tipo2=" + tipo2 + ", sexo=" + sexo + ", capturado=" + capturado + ", descripcion="
				+ descripcion + "]";
	}

}
