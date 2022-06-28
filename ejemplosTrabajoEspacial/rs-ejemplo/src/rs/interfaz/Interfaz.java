package rs.interfaz;

import java.util.List;

import net.datastructures.TreeMap;
import net.datastructures.Vertex;
import rs.aplicacion.Constante;
import rs.modelo.Relacion;
import rs.modelo.Usuario;

public class Interfaz {

	private static TreeMap<String, Usuario> usuarios;
	
	public Interfaz(TreeMap<String, Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void mostrarMasInfluyentes(List<Usuario> usuarios){
		System.out.println("Usuarios más influyentes\n");
		for (Usuario u: usuarios)
			System.out.println(u);
	}
	

}
