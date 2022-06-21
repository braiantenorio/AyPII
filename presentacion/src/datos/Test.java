package datos;

import java.io.IOException;

import net.datastructures.Graph;
import net.datastructures.Vertex;

public class Test {
    public static void main(String[] args) throws IOException {

        CargarParametros.parametros();
        Graph<Usuario, Relacion> g = CargarDatos.cargarUsuarios(CargarParametros.getArchivoUsuario());
        g = CargarDatos.crearRelaciones(CargarParametros.getArchivoRelaciones(), g);

        for (Vertex<Usuario> user : g.vertices()) {
            System.out.println(user.getElement());
        }
        System.out.println("La cantidad promedio de amigos por persona es " + gradoMedio(g));

    }

    
    /** 
     * Devuelve la cantidad de relaciones promedio de cada vertice.
     * Recorre cada vertice acumulando la cantidad de vertices en una variable tipo double
     * @param g Grafo del cual se quiere calcular el grado medio
     * @return double Promedio de relaciones por vertice
     */
    public static  double gradoMedio(Graph<Usuario, Relacion> g) {
        int i = 0;
        for (Vertex<Usuario> ver : g.vertices())
            i += g.outDegree(ver);
        i = i / g.numVertices();
        return i;
    }
}