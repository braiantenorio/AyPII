package datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import modelo.Relacion;
import modelo.Usuario;
import java.util.List;

import net.datastructures.TreeMap;
import java.util.ArrayList;

public class CargarDatos {
	public static TreeMap<String, Usuario> usuarios;

	/**
	 * Carga las usuarios desde un archivo de texto a un grafo y guarda en un mapa
	 * los vertices, donde la
	 * clave es el codigo del usuario;
	 * 
	 * @param fileName Nombre del archivo fuente de usuarios
	 * @return Graph<Usuario, Relacion> grafo no dirigido con
	 * @throws FileNotFoundException
	 */
	public static TreeMap<String, Usuario> cargarUsuarios(String fileName) throws FileNotFoundException {
		Scanner read = null;

		usuarios = new TreeMap<String, Usuario>();
		try {
			read = new Scanner(new File(fileName));

		} catch (FileNotFoundException e) {
			System.out.printf("Error archivo no encontrado");

		}
		read.useDelimiter("\\s*;\\s*");
		String codigo, nombre, edad, genero, ciudadAct;

		while (read.hasNext()) {
			codigo = read.next();
			nombre = read.next();
			edad = read.next();
			genero = read.next();
			ciudadAct = read.next();

			usuarios.put(codigo, new Usuario(codigo, nombre, edad, genero, ciudadAct));
		}
		read.close();
		return usuarios;

	}

	/**
	 * @param fileName
	 * @param g
	 * @return Graph<Usuario, Relacion>
	 * @throws FileNotFoundException
	 */
	public static List<Relacion> crearRelaciones(String fileName, TreeMap<String, Usuario> usuarios)
			throws FileNotFoundException {
		Scanner read = null;
		List<Relacion> relaciones = new ArrayList<Relacion>();
		try {
			read = new Scanner(new File(fileName));

		} catch (FileNotFoundException e) {
			System.out.printf("Error archivo no encontrado");
		}
		read.useDelimiter("\\s*;\\s*");
		Usuario usr1, usr2;
		int tSiendoAmigos, likes, tInterDiaria;
		while (read.hasNext()) {
			usr1 = usuarios.get(read.next());
			usr2 = usuarios.get(read.next());
			tInterDiaria = read.nextInt();
			likes = read.nextInt();
			tSiendoAmigos = read.nextInt();
			relaciones.add(0, new Relacion(usr1, usr2, tInterDiaria, likes, tSiendoAmigos));
		}
		read.close();
		return relaciones;
	}

}
