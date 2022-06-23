package presentacion;

import javax.swing.JOptionPane;

public class Pantalla {

	public static int opcion() {

		String s = JOptionPane
				.showInputDialog("1. Grado Medio\n2. Promedio\n-1. Salir");

		return Integer.valueOf(s);
	}

	public static void resultado(double d) {
		JOptionPane.showMessageDialog(null, "El resultado es: " + d);
	}
}
