package calc.aplicacion;

import calc.datos.CargarDatos;
import calc.interfaz.Pantalla;
import calc.logica.Calculo;
import net.datastructures.List;

public class Aplicacion {

	public static void main(String[] args) {

		// Cargar datos
		List<Double> datos = CargarDatos.cargarNumeros("datos.txt");

		// Opcion
		int opcion = Pantalla.opcion();

		// Cálculo
		Calculo c = new Calculo(datos);
		double resultado = 0;

		if (opcion == Constante.SALIR)
			System.exit(0);
		
		if (opcion == Constante.SUMATORIA)
			resultado = c.sumatoria();

		if (opcion == Constante.PROMEDIO)
			resultado = c.promedio();

		// Resultado
		Pantalla.resultado(resultado);
	}

}
