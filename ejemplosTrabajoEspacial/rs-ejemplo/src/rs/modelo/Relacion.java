package rs.modelo;

public class Relacion {

	private Usuario usuario1;
	private Usuario usuario2;
	private int interaccion;
	private int likes;
	private int tiempoAmistad;
	
	public Relacion(Usuario usuario1, Usuario usuario2, int interaccion, int likes, int tiempoAmistad) {
		super();
		this.usuario1 = usuario1;
		this.usuario2 = usuario2;
		this.interaccion = interaccion;
		this.likes = likes;
		this.tiempoAmistad = tiempoAmistad;
	}

	public Usuario getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	public Usuario getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}

	public int getInteraccion() {
		return interaccion;
	}

	public void setInteraccion(int interaccion) {
		this.interaccion = interaccion;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getTiempoAmistad() {
		return tiempoAmistad;
	}

	public void setTiempoAmistad(int tiempoAmistad) {
		this.tiempoAmistad = tiempoAmistad;
	}

	@Override
	public String toString() {
		return "Relacion ["+ usuario1 + " " + usuario2 + " " + interaccion + " "
				+ likes + " " + tiempoAmistad + "]";
	}
	
	
	
		
	
}
