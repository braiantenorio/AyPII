package aplicacion;

import datos.CargarDatos;
import datos.CargarParametros;
import logica.Calculo;
import modelo.Relacion;
import modelo.Usuario;
import java.util.List;

import net.datastructures.TreeMap;
import presentacion.Pantalla;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Aplicacion {

	public static void main(String[] args) throws Exception {

		TreeMap<String, Usuario> usuarios = null;
		List<Relacion> relaciones = null;

		// Cargar datos
		try {
			CargarParametros.parametros();
		} catch (IOException e) {
			System.err.print("Error al cargar parámetros");
			System.exit(-1);
		}

		try {
			usuarios = CargarDatos.cargarUsuarios(CargarParametros.getArchivoUsuario());
			relaciones = CargarDatos.crearRelaciones(CargarParametros.getArchivoRelaciones());
		} catch (FileNotFoundException e) {
			System.err.print("Error al cargar archivos de datos");
			System.exit(-1);
		}

		// Calculo
		Calculo<Usuario> c = new Calculo<Usuario>(usuarios, relaciones);
		boolean seguir = true;
		while (seguir) {
			int opcion = Pantalla.opcion();
			switch (opcion) {
				case (Constante.SALIR):
					seguir = false;
					Pantalla.despedida();
					System.exit(-1);
					break;
				case (Constante.MOSTRAR_USUARIOS):
					Pantalla.mostrarUsuarios(c.mostrarUsuarios());
					break;
				case (Constante.GRADOMEDIO):
					Pantalla.gradoMedio(c.gradoMedio());
					break;
				case (Constante.CENTRALIDAD):
					Pantalla.centralidad(c.centralidad());
					break;
				case (Constante.ANTIGUEDAD):
					String src = Pantalla.ingresarUsuario1();
					String target = Pantalla.ingresarUsuario2();
					try {
						Pantalla.antiguedad(c.antiguedad(usuarios.get(src), usuarios.get(target)));
					} catch (NullPointerException e) {
						Pantalla.error("Codigo de usuario invalido");
					} catch (IllegalArgumentException e) {
						Pantalla.error("Usuario no tiene amistades");
					}
					break;
				default:
					Pantalla.error("Eligio una opcion incorrecta");
			}
		}
	}
}
