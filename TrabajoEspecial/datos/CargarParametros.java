package datos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CargarParametros {

	private static String archivoUsuario;
	private static String idiomaApp;
	private static String archivoRelaciones;


	public static void parametros() throws IOException {

		Properties prop = new Properties();
		InputStream input = new FileInputStream("config.properties");
		// load a properties file
		prop.load(input);
		// get the property value
		archivoUsuario = prop.getProperty("usuario");
		idiomaApp = prop.getProperty("language");
		archivoRelaciones = prop.getProperty("relations");
	}

	public static String getArchivoUsuario() {
		return archivoUsuario;
	}

	public static String getLanguage() {
		return idiomaApp;
	}

	public static String getArchivoRelaciones() {
		return archivoRelaciones;
	}
}
