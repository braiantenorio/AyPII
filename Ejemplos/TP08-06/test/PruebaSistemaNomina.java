package test;

import empresa.Empleado;
import empresa.EmpleadoAsalariado;
import empresa.EmpleadoBaseMasComision;
import empresa.EmpleadoPorComision;
import empresa.EmpleadoPorHoras;
// Fig. 10.9: PruebaSistemaNomina.java
// Programa de prueba para la jerarquía de Empleado.
import net.datastructures.Entry;
import net.datastructures.SortedMap;
import net.datastructures.TreeMap;

public class PruebaSistemaNomina {
	public static void main(String[] args) {
		// crea objetos de las subclases
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111", 800.00);
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222", 16.75, 40);
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333", 10000, .06);
		EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444", 5000, .04,
				300);

		System.out.println("Empleados procesados por separado:\n");

		System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
		System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
		System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
		System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "ingresos",
				empleadoBaseMasComision.ingresos());

		// Map<String, Empleado> empleados = new UnsortedTableMap<String, Empleado>();
		// Map<String, Empleado> empleados = new ChainHashMap<String, Empleado>();
		SortedMap<String, Empleado> empleados = new TreeMap<String, Empleado>();

		empleados.put(empleadoAsalariado.obtenerNumeroSeguroSocial(), empleadoAsalariado);
		empleados.put(empleadoPorHoras.obtenerNumeroSeguroSocial(), empleadoPorHoras);
		empleados.put(empleadoPorComision.obtenerNumeroSeguroSocial(), empleadoPorComision);
		empleados.put(empleadoBaseMasComision.obtenerNumeroSeguroSocial(), empleadoBaseMasComision);

		Entry<String, Empleado> pos;
		
		pos = empleados.ceilingEntry("222");
		System.out.println(pos);
		pos = empleados.floorEntry("222");
		System.out.println(pos);
		pos = empleados.lowerEntry("222");
		System.out.println(pos);
		pos = empleados.higherEntry("222");
		System.out.println(pos);
		
		pos = empleados.firstEntry();
		System.out.println(pos);
		
		pos = empleados.lastEntry();
		System.out.println(pos);
		
		
	} // fin de main
} // fin de la clase PruebaSistemaNomina
