package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Edge;
import net.datastructures.Entry;
import net.datastructures.Graph;
import net.datastructures.PositionalList;
import net.datastructures.ProbeHashMap;
import net.datastructures.TreeMap;
import net.datastructures.Vertex;
import net.datastructures.GraphAlgorithms;
import net.datastructures.Map;
import net.datastructures.Position;
import modelo.Usuario;
import modelo.Relacion;

public class Calculo<V> {

    private Graph<Usuario, Relacion> redSocial;
    private Graph<Usuario, Integer> rapido;
    private TreeMap<String, Vertex<Usuario>> vertices;
    Map<Usuario, Vertex<Usuario>> res;

    public Calculo(TreeMap<String, Usuario> usuarios, List<Relacion> relaciones) {
        redSocial = new AdjacencyMapGraph<>(false);

        vertices = new TreeMap<String, Vertex<Usuario>>();
        for (Entry<String, Usuario> usuario : usuarios.entrySet())
            vertices.put(usuario.getKey(), redSocial.insertVertex(usuario.getValue()));

        for (Relacion relacion : relaciones)
            redSocial.insertEdge(vertices.get(relacion.getUsr1().getCodigo()),
                    vertices.get(relacion.getUsr2().getCodigo()), relacion);

        // copiar grafo
        rapido = new AdjacencyMapGraph<>(false);
        res = new ProbeHashMap<>();

        for (Vertex<Usuario> result : redSocial.vertices())
            res.put(result.getElement(),
                    rapido.insertVertex(result.getElement()));

        Vertex<Usuario>[] vert;

        for (Edge<Relacion> result : redSocial.edges()) {
            vert = redSocial.endVertices(result);
            rapido.insertEdge(res.get(vert[0].getElement()), res.get(vert[1]
                    .getElement()), result.getElement().gettSiendoAmigos());

        }
    }

    /**
     * Devuelve el usuario mas influyente de la red social
     * 
     * @return Usuario con mas amigos
     */
    public List<Usuario> centralidad() {
        Map<Usuario, Integer> outEdges = new ProbeHashMap<>();
        List<Usuario> answer = new ArrayList<Usuario>();
        for (Vertex<Usuario> usr : redSocial.vertices()) {
            outEdges.put(usr.getElement(), redSocial.outDegree(usr));
            answer.add(usr.getElement());
        }
        Collections.sort(answer, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario lhs, Usuario rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return outEdges.get(lhs) > outEdges.get(rhs) ? -1 : (outEdges.get(lhs) < outEdges.get(rhs)) ? 1 : 0;
            }
        });
        return answer;
    }

    /**
     * Devuelve la cantidad de relaciones promedio por vertice.
     * 
     * @param g Grafo del cual se quiere calcular el grado medio
     * @return double Promedio de relaciones por vertice
     */
    public double gradoMedio() {
        double i = 0;
        for (Vertex<Usuario> ver : redSocial.vertices())
            i += redSocial.outDegree(ver);
        i = i / redSocial.numVertices();
        return i;
    }

    /**
     * Usando el algoritmo de Dijkstra, encuentra el camino mas corto desde un
     * vertice dado a
     * otro.
     * 
     * @param src    Vertice origen
     * @param target Vertice objetivo
     * @return PositionalList<Vertex<Usuario>> Lista con el camino de vertices
     */
    public List<Relacion> antiguedad(Usuario src, Usuario target) {

        PositionalList<Vertex<Usuario>> lista = GraphAlgorithms
                .shortestPathList(rapido, res.get(src), res.get(target));
        // List<Usuario> answer = new ArrayList<Usuario>();
        List<Relacion> answer = new ArrayList<Relacion>();

        Vertex<Usuario> v1, v2;
        Position<Vertex<Usuario>> aux = lista.first();
        while (lista.after(aux) != null) {
            v1 = aux.getElement();
            aux = lista.after(aux);
            v2 = aux.getElement();
            answer.add(redSocial.getEdge(vertices.get(v1.getElement().getCodigo()),
                    vertices.get(v2.getElement().getCodigo())).getElement());
        }
        return answer;
    }

    public List<Usuario> mostrarUsuarios() {
        List<Usuario> answer = new ArrayList<Usuario>();
        for (Vertex<Usuario> usr : redSocial.vertices())
            answer.add(usr.getElement());
        return answer;

    }

}
