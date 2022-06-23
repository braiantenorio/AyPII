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

import datos.CargarDatos;
import datos.CargarParametros;

public class Aplicacion {

	public static void main(String[] args) throws IOException {

		// Cargar datos
        CargarParametros.parametros();
		Graph<Usuario, Relacion> datos = CargarDatos.cargarUsuarios(CargarParametros.getArchivoUsuario());
        datos = CargarDatos.crearRelaciones(CargarParametros.getArchivoRelaciones(), datos);

		// Opcion
		int opcion = Pantalla.opcion();

		// C�lculo
        Calculo<Usuario> c= new Calculo<Usuario>(datos);
		double resultado = 0;

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
