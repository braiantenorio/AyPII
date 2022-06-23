package test;

import java.io.IOException;
import datos.CargarDatos;
import datos.CargarParametros;
import logica.Calculo;
import modelo.Relacion;
import modelo.Usuario;

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

        Calculo<Usuario> c = new Calculo<Usuario>(g);

        System.out.println("La cantidad promedio de amigos por persona es " + c.gradoMedio());

        System.out.println("La persona mas influyente es " + c.centralidad());

        for(Usuario l :c.antiguedad(("B1998"),("P7645")))
            System.out.println(l);

    }


    

}
