package net.datastructures;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

	private double base;

	public EmpleadoBaseMasComision(String nombre, String nroDoc, double ventas, double comision, double base) {
		super(nombre, nroDoc, ventas, comision);
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "EmpleadoBaseMasComision [base=" + base + "]";
	}
	
	public double salario() {		
		return base + super.salario();
	}
}
