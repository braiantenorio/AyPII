package datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.datastructures.Graph;
import net.datastructures.Vertex;

public class CargarRelaciones {
    
    public static Graph<Usuario, Integer> cargarRelaciones(String fileName, Graph<Usuario,Integer> g) throws FileNotFoundException {
		Scanner read;

		read = new Scanner(new File(fileName));
		read.useDelimiter("\\s*;\\s*");
		String usr1, usr2;
        Vertex<Usuario> edg1= null;
        Vertex<Usuario> edg2 = null;


		while (read.hasNext()) {
            usr1 = read.next();
			usr2 = read.next();
            for (Vertex<Usuario> user : g.vertices()) {
                if (user.getElement().getCodigo()==usr1)
                    edg1=user;
                if (user.getElement().getCodigo()==usr2)
                    edg2=user;
                /* 
                if(!edg1.equals(null) && !edg2.equals(null))    
                    break;*/
            }
            g.insertEdge(edg1, edg2, 1);
		}
		read.close();

		return g;

	}

}


