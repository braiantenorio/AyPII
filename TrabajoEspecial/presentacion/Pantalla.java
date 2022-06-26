package presentacion;

import java.security.KeyException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import modelo.Relacion;
import modelo.Usuario;

public class Pantalla {

	public static final int REPETECIONES = 5;

	public static int opcion() {

		String s = JOptionPane
				.showInputDialog(
						"1. Mostrar todos los usuarios\n2. Grado medio\n3. Centralidad\n4. Antiguedad\n-1. Salir");

		return Integer.valueOf(s);
	}

	public static String ingresarUsuario1() {
		String s = JOptionPane
				.showInputDialog("Ingrese el codigo del primer usuario");
		return s;
	}

	public static String ingresarUsuario2() {
		String s = JOptionPane
				.showInputDialog("Ingrese el codigo del segundo usuario");
		return s;
	}

	public static void despedida() {

		JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
	}

	public static void mostrarUsuarios(List<Usuario> l) {
		JTextArea outputTextArea = new JTextArea();

		outputTextArea.setText("Codigo\tNombre\tEdad\n");

		for (Usuario usr : l) {

			outputTextArea.append(usr.getCodigo() + "\t" + usr.getNombre() + "\t" + usr.getEdad() + "\n");

		}

		JOptionPane.showMessageDialog(null, outputTextArea,
				"Todos los usuarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void gradoMedio(double g) {
		JOptionPane.showMessageDialog(null, "El promedio de amigos por usuario es: " + g);

	}

	public static void centralidad(List<Usuario> l) {
		JTextArea outputTextArea = new JTextArea();

		outputTextArea.setText("Codigo\tNombre\n");

		for (int i = 0; i < REPETECIONES; i++) {

			outputTextArea.append(l.get(i).getCodigo() + "\t" + l.get(i).getNombre() + "\n");

		}

		JOptionPane.showMessageDialog(null, outputTextArea,
				"Usuarios mas influyentes", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void antiguedad(List<Relacion> r) throws KeyException{
		JTextArea outputTextArea = new JTextArea();

		outputTextArea.setText("Codigo del primer usuario\tTiempo siendo amigos\tCodigo del primer usuario\n");

		for (Relacion re : r) {

			outputTextArea.append(re.getUsr1().getCodigo() + "\t\t" + re.gettSiendoAmigos() + "\t\t"
					+ re.getUsr2().getCodigo() + "\n");

		}

		JOptionPane.showMessageDialog(null, outputTextArea,
				"Camino mas corto entre 2 usuarios", JOptionPane.INFORMATION_MESSAGE);
	}


	public static void error(String e) {
		JOptionPane.showMessageDialog(null, "Error "+ e);
		

	}
}
