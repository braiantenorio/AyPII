package aplicacion;

import datos.CargarDatos;
import datos.CargarParametros;
import logica.Calculo;
import modelo.Relacion;
import modelo.Usuario;
import net.datastructures.Graph;

import presentacion.Pantalla;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Aplicacion {

	public static void main(String[] args) throws IOException {

		Graph<Usuario, Relacion> datos=null;

		// Cargar datos
		try{
        CargarParametros.parametros();
		} catch(IOException e) {
			System.err.print("Error al cargar par�metros");
			System.exit(-1);
		}

		try {
			datos = CargarDatos.cargarUsuarios(CargarParametros.getArchivoUsuario());
        	datos = CargarDatos.crearRelaciones(CargarParametros.getArchivoRelaciones(), datos);
		} catch (FileNotFoundException e) {
			System.err.print("Error al cargar archivos de datos");
			System.exit(-1);
		}
		

		// Opcion
		int opcion = Pantalla.opcion();

		// C�lculo
        Calculo<Usuario> c= new Calculo<Usuario>(datos);
		double resultado = 0;

		System.out.println(datos);

		if (opcion == Constante.SALIR)
			System.exit(0);
		
		if (opcion == Constante.GRADOMEDIO)
			resultado = c.gradoMedio();

		if (opcion == Constante.CENTRALIDAD)
			/*resultado =*/ c.centralidad().getCodigo();
		// Resultado
		Pantalla.resultado(resultado);


	}

}
