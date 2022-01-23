package models;

public class Usuario {
	private int id;
	private String usuario;
	private String contraseña;
	
	public Usuario(int id, String usuario, String contraseña) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	
	public int getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public String getcontraseña() {
		return contraseña;
	}
	
	public boolean comprobarContraseña(String contraseña)
	{
		if(contraseña.equals(getcontraseña()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + "]";
	}
	
	
	
	

}
