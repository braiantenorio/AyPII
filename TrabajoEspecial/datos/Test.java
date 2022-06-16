package datos;

import java.io.FileNotFoundException;

import net.datastructures.Graph;
import net.datastructures.Vertex;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Graph<Usuario, Integer> g = CargarDatos.cargarUsuarios("users.txt");
        //g = CargarRelaciones.cargarRelaciones("relations.txt", g);

        for (Vertex<Usuario> user : g.vertices()){
            System.out.println(user.getElement());
        }


        
    }
}