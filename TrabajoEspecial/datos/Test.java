package datos;

import java.io.FileNotFoundException;

import net.datastructures.Graph;
import net.datastructures.Vertex;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Graph<Usuario, Relacion> g = CargarDatos.cargarUsuarios("users.txt");
        g = CargarDatos.crearRelaciones("relations.txt", g);

        for (Vertex<Usuario> user : g.vertices()) {
            System.out.println(user.getElement());
        }
        System.out.println("La cantidad promedio de amigos por persona es " + gradoMedio(g));

    }

    public static <E> double gradoMedio(Graph<E, Relacion> g) {
        int i = 0;
        for (Vertex<E> ver : g.vertices())
            i += g.outDegree(ver);
        i = i / g.numVertices();
        return i;
    }
}