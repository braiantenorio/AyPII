package aplicacion;

import datos.CargarDatos;
import datos.CargarParametros;
import logica.Calculo;
import modelo.Relacion;
import modelo.Usuario;
import net.datastructures.Graph;
import net.datastructures.Vertex;
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

		for (Vertex<Usuario> user : datos.vertices()) {
            System.out.println(user.getElement());
        }
	

		// C�lculo
        Calculo<Usuario> c= new Calculo<Usuario>(datos);

        System.out.println("La cantidad promedio de amigos por persona es " + c.gradoMedio());

        System.out.println("La persona mas influyente es " + c.centralidad());

		System.out.println("El camino mas corto entre 2 usuarios");
		for(Vertex<Usuario> l :c.antiguedad(("B1998"),("P7645")))
            System.out.println(l.getElement());
	}

}
