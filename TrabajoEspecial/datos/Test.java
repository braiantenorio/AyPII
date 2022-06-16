package datos;

import java.io.FileNotFoundException;

import net.datastructures.Graph;
import net.datastructures.Vertex;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Graph<Usuario, Integer> g = CargarDatos.cargarUsuarios("users.txt");
        g = CargarRelaciones.cargarRelaciones("relations.txt", g);

        for (Vertex<Usuario> user : g.vertices()) {
            System.out.println(user.getElement());
        }
        System.out.println("La cantidad promedio de amigos por persona es " + promedioDeAmigos(g));

    }

    /*
     * numero de arcos multiplicado por 2 por que es un grafo no dirigido, entonces
     * uno es amigo del otro
     * entontes todos los arcos valen 2
     */
    public static <E> double promedioDeAmigos(Graph<E, Integer> g) {
        return (g.numEdges() * 2) / g.numVertices();
    }
}