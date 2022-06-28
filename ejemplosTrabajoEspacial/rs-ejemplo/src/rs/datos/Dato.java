package rs.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.datastructures.TreeMap;
import rs.modelo.Relacion;
import rs.modelo.Usuario;

public class Dato {

	public static TreeMap<String, Usuario> cargarUsuarios(String fileName) throws FileNotFoundException {
		Scanner read;

		TreeMap<String, Usuario> usuarios = new TreeMap<String, Usuario>();
		
			read = new Scanner(new File(fileName));
			read.useDelimiter("\\s*;\\s*");
			String codigo, nombre, localidad, nivelAcademico;
			int edad;
			char sexo;

			while (read.hasNext()) {
				codigo = read.next();
				nombre = read.next();
				edad = read.nextInt();
				sexo = read.next().charAt(0);
				localidad = read.next();
				nivelAcademico = read.next();
				usuarios.put(codigo, new Usuario(codigo,nombre,edad,sexo,localidad,nivelAcademico));
			}
			read.close();
		
		return usuarios;
	}

	
	public static List<Relacion> cargarRelaciones(String fileName,TreeMap<String, Usuario> usuarios) throws FileNotFoundException {
		Scanner read;
		List<Relacion> relaciones = new ArrayList<Relacion>();
		
			read = new Scanner(new File(fileName));
			read.useDelimiter("\\s*;\\s*");
			Usuario usr1, usr2;
			int interaccion,likes,tiempoAmistad;
			
			while (read.hasNext()) {
				usr1 = usuarios.get(read.next());
				usr2 = usuarios.get(read.next());
				interaccion = read.nextInt();
				likes = read.nextInt();
				tiempoAmistad = read.nextInt();
				relaciones.add(0, new Relacion(usr1, usr2,interaccion,likes,tiempoAmistad));
			}
			read.close();
		
		return relaciones;
	}

}
