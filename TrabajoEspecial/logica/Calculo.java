package logica;

import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Graph;
import net.datastructures.Vertex;

public class Calculo<V, E> {
    
    private Graph<V,E> datos = new AdjacencyMapGraph<>(false);

    public Calculo(Graph<V,E> g) {
        datos= g;
    }
    
    public Vertex<V> centralidad() {
        Vertex<V> center=null;
        int i=0;
        for(Vertex<V> usr : datos.vertices()){
            if(i==0){
                center = usr;
                i++;
            }
            if(datos.outDegree(usr)>datos.outDegree(center)){
                center=usr;
            }

        System.out.println(usr.getElement() + " " + datos.outDegree(usr));

        }
        return center;
    }

}
