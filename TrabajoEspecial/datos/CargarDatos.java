package datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Graph;

public class CargarDatos {

	public static Graph<Usuario, Integer> cargarUsuarios(String fileName) throws FileNotFoundException {
		Scanner read;

		Graph<Usuario, Integer> usuarios = new AdjacencyMapGraph<>(false);

		read = new Scanner(new File(fileName));
		read.useDelimiter("\\s*;\\s*");
		String codigo, nombre, edad, genero, ciudadAct;

		while (read.hasNext()) {
			codigo = read.next();
			nombre = read.next();
			edad = read.next();
			genero = read.next();
			ciudadAct = read.next();

			usuarios.insertVertex(new Usuario(codigo, nombre, edad, genero, ciudadAct));
		}
		read.close();

		return usuarios;

	}

}
