package datos;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.datastructures.Graph;
import net.datastructures.Vertex;
import net.datastructures.AdjacencyMapGraph;

public class CargarDatos {

	public static Graph<Usuario, Integer> cargarUsuarios(String fileName) throws FileNotFoundException {
		Scanner read;

		Graph<Usuario, Integer> usuarios = new AdjacencyMapGraph<>(false);

		read = new Scanner(new File(fileName));
		read.useDelimiter("\\s*;\\s*");
		String codigo, nombre, edad, genero, ciudadAct;

		while (read.hasNext()) {
			codigo = read.next();
			nombre = read.next();
			edad = read.next();
			genero = read.next();
			ciudadAct = read.next();

			usuarios.insertVertex(new Usuario(codigo, nombre, edad, genero, ciudadAct));
		}
		read.close();

		return usuarios;



	}
	public static Graph<Usuario, Integer> cargarRelaciones(String fileName, Graph<Usuario,Integer> g) throws FileNotFoundException {
		Scanner read;

		read = new Scanner(new File(fileName));
		read.useDelimiter("\\s*;\\s*");
		String usr1, usr2;

		while (read.hasNext()) {
            usr1 = read.next();
			usr2 = read.next();
            Vertex<Usuario> edg1 = null;
            Vertex<Usuario> edg2= null;
            for (Vertex<Usuario> user : g.vertices()) {
                if (user.getElement().getCodigo().equals(usr1))
                    edg1=user;
                    
                if (user.getElement().getCodigo().equals(usr2))
                    edg2=user;
                
                if(!(edg1==null) && !(edg2==null))    
                    break;
            }
            g.insertEdge(edg1, edg2, 1);
          
		}
		read.close();

		return g;

	}


}
