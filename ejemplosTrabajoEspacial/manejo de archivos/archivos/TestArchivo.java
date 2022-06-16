package archivos;

import java.io.FileNotFoundException;
import java.io.IOException;

import net.datastructures.Entry;
import net.datastructures.TreeMap;

public class TestArchivo {

	public static void main(String[] args) {

		TreeMap<String, Usuario> usuarios = null;
		String languageApp = null ;

		// leo del archivo de configuraciones los parametros usados al iniciar la aplicacion
		try {
			CargarParametros.parametros();
		} catch (IOException e) {
			System.err.print("Error al cargar parámetros");
			System.exit(-1);
		}
		
		//cargo el contenido del archivo al mapa "usuarios"

		try {
			usuarios = Dato.cargarUsuarios(CargarParametros.getArchivoUsuario());
			languageApp = CargarParametros.getLanguage();


		} catch (FileNotFoundException e) {
			System.err.print("Error al cargar archivos de datos");
			System.exit(-1);
		}
		
		System.out.println("App seteada en: "+languageApp);
		
		// imprimo los usuarios extraidos del archivo
		for (Entry<String, Usuario> users : usuarios.entrySet())
			System.out.println(users.getValue());

	}

}
