package net.datastructures;

public class EmpleadoPorHora extends Empleado{
	
	private double valorHora;
	private double horas;
	
	public EmpleadoPorHora(String nombre, String nroDoc, double valorHora, double horas) {
		super(nombre, nroDoc);
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "EmpleadoPorHora [valorHora=" + valorHora + ", horas=" + horas + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return horas * valorHora;
	}
	
	

}
