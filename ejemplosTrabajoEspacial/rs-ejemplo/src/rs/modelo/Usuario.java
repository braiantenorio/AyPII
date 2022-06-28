package rs.modelo;

public class Usuario {

	private String codigo;
	private String nombre;
	private int edad;
	private char sexo;
	private String localidad;
	private String nivelAcademico;
	
	
	public Usuario(String codigo, String nombre, int edad, char sexo, String localidad, String nivelAcademico) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.localidad = localidad;
		this.nivelAcademico = nivelAcademico;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getNivelAcademico() {
		return nivelAcademico;
	}
	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}
	
	@Override
	public String toString() {
		return "Usuario [" + codigo + " " + nombre + " " + edad + " " + sexo + " "
				+ localidad + " " + nivelAcademico + "]";
	}
	
	
	
	
	
}
