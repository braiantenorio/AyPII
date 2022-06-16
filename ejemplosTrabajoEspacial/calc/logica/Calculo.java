package calc.logica;

import net.datastructures.List;

public class Calculo {

	private List<Double> datos;

	public Calculo(List<Double> d) {
		datos = d;
	}

	public double sumatoria() {
		double total = 0;
		for (double d : datos)
			total += d;
		return total;
	}

	public double promedio() {
		return sumatoria() / datos.size();
	}
}
