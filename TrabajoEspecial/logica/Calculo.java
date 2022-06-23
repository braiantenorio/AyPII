package logica;


import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Edge;
import net.datastructures.Graph;
import net.datastructures.Map;
import net.datastructures.PositionalList;
import net.datastructures.TreeMap;
import net.datastructures.Vertex;
import net.datastructures.GraphAlgorithms;
import modelo.Usuario;
import modelo.Relacion;


public class Calculo<V> {

    private Graph<Usuario, Relacion> datos = new AdjacencyMapGraph<>(false);
    private Graph<Usuario, Integer> dijkstra = new AdjacencyMapGraph<>(false);
    public TreeMap<String, Vertex<Usuario>> mVertex;
   

    public Calculo(Graph<Usuario, Relacion> g) {
        datos = g;
        mVertex = new TreeMap<String, Vertex<Usuario>>();
        for(Vertex<Usuario> d: datos.vertices())
            mVertex.put(d.getElement().getCodigo(), dijkstra.insertVertex(d.getElement()) );
        for(Edge<Relacion> e : datos.edges())
            dijkstra.insertEdge(mVertex.get(datos.endVertices(e)[0].getElement().getCodigo()), mVertex.get(datos.endVertices(e)[1].getElement().getCodigo()), e.getElement().gettSiendoAmigos());

    }


    public Usuario centralidad() {
        Vertex<Usuario> center = null;
        int i = 0;
        for (Vertex<Usuario> usr : datos.vertices()) {
            if (i == 0) {
                center = usr;
                i++;
            }
            if (datos.outDegree(usr) > datos.outDegree(center))
                center = usr;
        }
        return center.getElement();
    }

    
    /** 
     * Devuelve la cantidad de relaciones promedio de cada vertice.
     * Recorre cada vertice acumulando la cantidad de vertices en una variable tipo double
     * @param g Grafo del cual se quiere calcular el grado medio
     * @return double Promedio de relaciones por vertice
     */
    public double gradoMedio() {
        double i = 0;
        for (Vertex<Usuario> ver : datos.vertices())
            i += datos.outDegree(ver);
        i = i / datos.numVertices();
        return i;
    }

    public PositionalList<Vertex<Usuario>> antiguedad(String src, String target){
        
       return GraphAlgorithms.shortestPathList(dijkstra, mVertex.get(src), mVertex.get(target));
    }
    
}
