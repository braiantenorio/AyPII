package calc.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.datastructures.ArrayList;
import net.datastructures.List;

public class CargarDatos {

	public static List<Double> cargarNumeros(String fileName) {
		Scanner read;

		List<Double> nro = new ArrayList<Double>();
		try {
			read = new Scanner(new File(fileName));
			read.useDelimiter("\\s*;\\s*");

			while (read.hasNext())				
				nro.add(0,read.nextDouble());

			read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return nro;
	}

}
