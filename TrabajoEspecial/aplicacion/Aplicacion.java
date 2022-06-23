package aplicacion;

import datos.CargarDatos;
import datos.CargarParametros;
import logica.Calculo;
import modelo.Relacion;
import modelo.Usuario;
import net.datastructures.Graph;

import presentacion.Pantalla;

import java.io.FileNotFoundException;

public class Aplicacion {

	public static void main(String[] args) throws FileNotFoundException {

		// Cargar datos
		Graph<Usuario, Relacion> datos = CargarDatos.cargarUsuarios(CargarParametros.getArchivoUsuario());

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
