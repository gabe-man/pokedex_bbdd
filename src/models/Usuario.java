package models;

public class Usuario {
	private int id;
	private String usuario;
	private String contrase�a;
	
	public Usuario(int id, String usuario, String contrase�a) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}
	
	public int getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public String getcontrase�a() {
		return contrase�a;
	}
	
	public boolean comprobarContrase�a(String contrase�a)
	{
		if(contrase�a.equals(getcontrase�a()))
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
