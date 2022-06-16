package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import net.datastructures.TreeMap;

public class Dato {

	public static TreeMap<String, Usuario> cargarUsuarios(String fileName) throws FileNotFoundException {
		Scanner read;

		TreeMap<String, Usuario> usuarios = new TreeMap<String, Usuario>();
		
			read = new Scanner(new File(fileName));
			read.useDelimiter("\\s*;\\s*");
			String codigo, nombre;
			
			while (read.hasNext()) {
				codigo = read.next();
				nombre = read.next();
				usuarios.put(codigo, new Usuario(codigo,nombre));
			}
			read.close();
		
		return usuarios;
	}

	

}
