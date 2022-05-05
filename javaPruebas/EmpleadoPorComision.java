package datastructures;

public class EmpleadoPorComision extends Empleado {

	private double ventas;
	private double comision;
		
	public EmpleadoPorComision(String nombre, String nroDoc, double ventas, double comision) {
		super(nombre, nroDoc);
		this.ventas = ventas;
		this.comision = comision;
	}
	public double getVentas() {
		return ventas;
	}
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	@Override
	public String toString() {
		return "EmpleadoPorComision [ventas=" + ventas + ", comision=" + comision + "]";
	}
	@Override
	public double salario() {		
		return ventas * comision / 100;
	}
	
	
}
