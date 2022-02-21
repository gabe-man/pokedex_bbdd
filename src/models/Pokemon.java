package models;

public class Pokemon {
	private int num;
	private String nombre;
	private double altura;
	private double peso;
	private String tipo1;
	private String tipo2;
	private String sexo;
	private boolean capturado;
	private String descripcion;
	private String imagen;
	
	public Pokemon(int num, String nombre, double altura, double peso, String tipo1, String tipo2, String sexo,
			boolean capturado, String descripcion, String imagen) {
		super();
		this.num = num;
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
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso=peso;
	}

	public String getTipo1() {
		return tipo1;
	}
	
	public void setTipo1(String tipo1) {
		this.tipo1=tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}
	
	public void setTipo2(String tipo2) {
		this.tipo2=tipo2;
	}

	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}

	public boolean isCapturado() {
		return capturado;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.nombre=nombre;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen=imagen;
	}
	
	

	@Override
	public String toString() {
		return "Pokemon [num=" + num + ", nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", tipo1="
				+ tipo1 + ", tipo2=" + tipo2 + ", sexo=" + sexo + ", capturado=" + capturado + ", descripcion="
				+ descripcion + "]";
	}

}
