package datos;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.datastructures.Graph;
import net.datastructures.TreeMap;
import net.datastructures.Vertex;
import net.datastructures.AdjacencyMapGraph;

public class CargarDatos {
	private static TreeMap<String, Vertex<Usuario>> usuarios;
	private static Graph<Usuario, Integer> g;

	public static Graph<Usuario, Integer> cargarUsuarios(String fileName) throws FileNotFoundException {
		Scanner read;

		usuarios = new TreeMap<String, Vertex<Usuario>>();
		g = new AdjacencyMapGraph<>(false);

		read = new Scanner(new File(fileName));
		read.useDelimiter("\\s*;\\s*");
		String codigo, nombre, edad, genero, ciudadAct;

		while (read.hasNext()) {
			codigo = read.next();
			nombre = read.next();
			edad = read.next();
			genero = read.next();
			ciudadAct = read.next();

			usuarios.put(codigo, g.insertVertex(new Usuario(codigo, nombre, edad, genero, ciudadAct)));
		}
		read.close();
		return g;

	}
	public static Graph<Usuario, Integer> crearRelaciones(String fileName, Graph<Usuario, Integer> g) throws FileNotFoundException {
		Scanner read;

		read = new Scanner(new File(fileName));
		read.useDelimiter("\\s*;\\s*");
		String usr1, usr2;

		while (read.hasNext()) {
            usr1 = read.next();
			usr2 = read.next();
			g.insertEdge(usuarios.get(usr1), usuarios.get(usr2),1);
		}
		read.close();
		return g;
	}
	


}
