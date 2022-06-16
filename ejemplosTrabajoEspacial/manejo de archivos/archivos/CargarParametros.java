package archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CargarParametros {

	private static String archivoUsuario;
	private static String idiomaApp;

	public static void parametros() throws IOException {

		Properties prop = new Properties();
		//"C:\\Users\\USUARIO\\eclipse-workspace\\TP9-2022\\config.properties
		InputStream input = new FileInputStream("config.properties");
		// load a properties file
		prop.load(input);
		// get the property value
		archivoUsuario = prop.getProperty("usuario");
		idiomaApp = prop.getProperty("language");
	}

	public static String getArchivoUsuario() {
		return archivoUsuario;
	}

	public static String getLanguage() {
		return idiomaApp;
	}

}
