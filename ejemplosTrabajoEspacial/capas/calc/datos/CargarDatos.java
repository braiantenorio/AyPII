package calc.datos;

import net.datastructures.ArrayList;
import net.datastructures.List;

public class CargarDatos {

	public static List<Double> cargarNumeros(String fileName) {

		double datos[] = { 10.0, 20.0, 30.0, 40.0, 50.0 };

		List<Double> nro = new ArrayList<Double>();
		for (double d : datos)
			nro.add(0, d);
		
		return nro;
	}

}
