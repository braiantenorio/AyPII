package net.datastructures;

public abstract class Empleado {
	
	private String nombre;
	private String nroDoc;
	
	public Empleado(String nombre, String nroDoc) {
		super();
		this.nombre = nombre;
		this.nroDoc = nroDoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public abstract double salario();
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nroDoc=" + nroDoc + "]";
	}
	
	
}
