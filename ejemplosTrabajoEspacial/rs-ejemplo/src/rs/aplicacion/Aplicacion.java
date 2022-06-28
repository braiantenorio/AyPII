package rs.aplicacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import net.datastructures.TreeMap;
import rs.datos.CargarParametros;
import rs.datos.Dato;
import rs.interfaz.Interfaz;
import rs.logica.Calculo;
import rs.modelo.Relacion;
import rs.modelo.Usuario;

public class Aplicacion {

	public static void main(String[] args) {

		// Cargar parametros
		try {
			CargarParametros.parametros();
		} catch (IOException e) {
			System.err.print("Error al cargar parámetros");
			System.exit(-1);
		}

		// Cargar datos
		TreeMap<String, Usuario> usuarios = null;

		List<Relacion> relaciones = null;
		try {
			usuarios = Dato.cargarUsuarios(CargarParametros.getArchivoUsuario());

			relaciones = Dato.cargarRelaciones(CargarParametros.getArchivoRelacion(), usuarios);

		} catch (FileNotFoundException e) {
			System.err.print("Error al cargar archivos de datos");
			System.exit(-1);
		}
		
		Calculo calculo = new Calculo(usuarios, relaciones);

		Interfaz interfaz = new Interfaz(usuarios);	

		List<Usuario> masInfluyentes = calculo.masInfluyentes();

		interfaz.mostrarMasInfluyentes(masInfluyentes);
	}
}
