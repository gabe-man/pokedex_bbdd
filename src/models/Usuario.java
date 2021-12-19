package models;

public class Usuario {
	private String usuario;
	private String contraseña;
	
	public Usuario(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public String getUsuario() {
		return usuario;
	}
	
	private String getcontraseña() {
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
