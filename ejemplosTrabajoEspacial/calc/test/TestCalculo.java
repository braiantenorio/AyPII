package calc.test;

import calc.logica.Calculo;
import net.datastructures.ArrayList;
import net.datastructures.List;

public class TestCalculo {

	public static void main(String[] args) {
		testSumaListaVacia();
		testSumaListaDatos();
		testPromedioListaVacia();
		testPromedioListaDatos();
	}

	public static void testSumaListaVacia() {
		List<Double> lista = new ArrayList<Double>();
		Calculo c = new Calculo(lista);
		if (c.sumatoria() != 0.0)
			System.out.println("error testSumaListaVacia");
	}

	public static void testSumaListaDatos() {
		List<Double> lista = new ArrayList<Double>();
		Calculo c = new Calculo(lista);
		lista.add(0, 10.0);
		lista.add(0, 20.0);
		lista.add(0, 30.0);
		if (c.sumatoria() != 60.0)
			System.out.println("error testSumaListaDatos");
	}

	// Pasa el test?
	public static void testPromedioListaVacia() {
		List<Double> lista = new ArrayList<Double>();
		Calculo c = new Calculo(lista);
		if (c.promedio() != 0.0)
			System.out.println("error testPromedioListaVacia");
	}

	public static void testPromedioListaDatos() {
		List<Double> lista = new ArrayList<Double>();
		Calculo c = new Calculo(lista);
		lista.add(0, 10.0);
		lista.add(0, 20.0);
		lista.add(0, 30.0);
		if (c.promedio() != 20.0)
			System.out.println("error testPromedioListaVacia");
	}

}
