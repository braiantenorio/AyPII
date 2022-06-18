package test;

import java.io.IOException;

import datos.CargarDatos;
import datos.CargarParametros;
import datos.Relacion;
import datos.Usuario;
import logica.Calculo;
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

        Calculo<Usuario,Relacion> c= new Calculo<Usuario, Relacion>(g);


        c.centralidad().getElement();
        
        //System.out.println(c.centralidad().getElement().getCodigo());



    }

    
    /** 
     * Devuelve la cantidad de relaciones promedio de cada vertice.
     * Recorre cada vertice acumulando la cantidad de vertices en una variable tipo double
     * @param g Grafo del cual se quiere calcular el grado medio
     * @return double Promedio de relaciones por vertice
     */
    public static  double gradoMedio(Graph<Usuario, Relacion> g) {
        double i = 0;
        for (Vertex<Usuario> ver : g.vertices())
            i += g.outDegree(ver);
        i = i / g.numVertices();
        return i;
    }
}