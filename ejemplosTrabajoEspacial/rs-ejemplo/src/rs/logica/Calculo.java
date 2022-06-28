package rs.logica;

import java.util.ArrayList;
import java.util.List;

import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Entry;
import net.datastructures.Graph;
import net.datastructures.TreeMap;
import net.datastructures.Vertex;
import rs.modelo.Relacion;
import rs.modelo.Usuario;

public class Calculo {

	private Graph<Usuario, Relacion> redSocial;
	private TreeMap<String, Vertex<Usuario>> vertices;

	public Calculo(TreeMap<String, Usuario> usuarios, List<Relacion> relaciones) {

		redSocial = new AdjacencyMapGraph<>(false);

		// Cargar usuarios
		vertices = new TreeMap<String, Vertex<Usuario>>();
		for (Entry<String, Usuario> usr : usuarios.entrySet())
			vertices.put(usr.getKey(), redSocial.insertVertex(usr.getValue()));

		// Cargar relaciones
		for (Relacion rel : relaciones)
			redSocial.insertEdge(vertices.get(rel.getUsuario1().getCodigo()),
					vertices.get(rel.getUsuario2().getCodigo()), rel);

	}

	// Mejorar implementación. Retornar los primeros n usuarios más influyentes
	// ordenados de mayor a menor.
	public List<Usuario> masInfluyentes() {

		List<Usuario> influyentes = new ArrayList<Usuario>();

		int max = 0;
		int arcos;
		Usuario ui = null;
		for (Vertex<Usuario> v : redSocial.vertices()) {
			arcos = redSocial.outDegree(v);
			if (max < arcos) {
				max = arcos;
				ui = v.getElement();
			}
		}
		influyentes.add(ui);
		
		return influyentes;
	}
}
