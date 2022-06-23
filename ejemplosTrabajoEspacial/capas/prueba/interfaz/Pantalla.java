package prueba.interfaz;

import java.util.Scanner;

public class Pantalla {

	static Scanner input = new Scanner(System.in);

	public static int opcion() {

		System.out.print(" 1. Sumatoria\n 2. Promedio\n-1. Salir\n");
		System.out.print("Ingrese la operación a realizar: ");
				
		return Integer.valueOf(input.next());
	}

	public static void resultado(double d) {

		System.out.print("El resultado es: " + d);
	}
}
