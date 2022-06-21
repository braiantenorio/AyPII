package datos;


public class Usuario {

	private String codigo;
	private String nombre;
	private String edad;
	private String genero;
	private String ciudadAct;
		
	
	public Usuario(String codigo, String nombre, String edad, String genero, String ciudadAct) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad= edad;
		this.genero=genero;
		this.ciudadAct=ciudadAct;		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	@Override
	public String toString() {
		return "["+ codigo + " " + nombre + " " + edad + " " + genero + " " + ciudadAct + "]";
	}
	
	
	
	
	
}
