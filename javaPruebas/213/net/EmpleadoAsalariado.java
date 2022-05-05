package empleado;

public class EmpleadoAsalariado extends Empleado {

	private double sueldo;

	public EmpleadoAsalariado(String nombre, String nroDoc, double sueldo) {
		super(nombre, nroDoc);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "EmpleadoAsalariado [sueldo=" + sueldo + "]";
	}

	@Override
	public double salario() {		
		return sueldo;
	}

	
	
	
	
}
