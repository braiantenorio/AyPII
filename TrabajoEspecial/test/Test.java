/*package test;

import java.io.IOException;
import datos.CargarDatos;
import datos.CargarParametros;
import junit.framework.Test;
import logica.Calculo;
import modelo.Relacion;
import modelo.Usuario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import net.datastructures.ArrayList;
import net.datastructures.List;

import net.datastructures.Graph;
import net.datastructures.Vertex;

public class Test {
    private Calculo c;
	private List<Double> lista;

	@Before
	public void setUp() throws Exception {
		lista = new ArrayList<Double>();
		c = new Calculo(lista);
	}

	@Test
	public void testSumaListaVacia() {		
		assertEquals(c.sumatoria(), 0.0, 0.01);
	}

	@Test
	public void testSumaListaDatos() {
		lista.add(0, 10.0);
		lista.add(0, 20.0);
		lista.add(0, 30.0);
		assertEquals(c.sumatoria(), 60.0, 0.01);
	}
	
	// Pasa el test?
	@Test
	public void testPromedioListaVacia() {		
		assertEquals(c.promedio(), 0.0, 0.01);
	}

	@Test
	public void testPromedioListaDatos() {
		lista.add(0, 10.0);
		lista.add(0, 20.0);
		lista.add(0, 30.0);
		assertEquals(c.promedio(), 20.0, 0.01);
	}
	

}*/
