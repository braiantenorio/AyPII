package presentacion;

import java.security.KeyException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import modelo.Relacion;
import modelo.Usuario;

public class Pantalla {

	public static final int REPETECIONES = 5;

	/**
	 * Panel principal del sistema,
	 * 
	 * @return int opcion elegida por el usuario
	 * @throws Exception su
	 */
	public static int opcion() throws Exception {

		String s = JOptionPane
				.showInputDialog(
						"1. Mostrar todos los usuarios\n2. Grado medio\n3. Centralidad\n4. Antiguedad\n-1. Salir");
		//if(s==null)
			//Pantalla.error("Opcion invalida= null");
		return Integer.valueOf(s);
	}

	/**
	 * Recibe el primer codigo de usuario de la interfaz
	 * 
	 * @return String el primer codigo de usuario
	 */
	public static String ingresarUsuario1() {
		String s = JOptionPane
				.showInputDialog("Ingrese el codigo del primer usuario");
		return s;
	}

	/**
	 * Recibe el primer codigo de usuario de la interfaz
	 * 
	 * @return String el primer codigo de usuario
	 */
	public static String ingresarUsuario2() {
		String s = JOptionPane
				.showInputDialog("Ingrese el codigo del segundo usuario");
		return s;
	}

	public static void despedida() {

		JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
	}

	/**
	 * Imprime todos los usuarios de la red social
	 * 
	 * @param l lista de usuarios
	 */
	public static void mostrarUsuarios(List<Usuario> l) {
		JTextArea outputTextArea = new JTextArea();

		outputTextArea.setText("Codigo\tNombre\tEdad\n");

		for (Usuario usr : l) {

			outputTextArea.append(usr.getCodigo() + "\t" + usr.getNombre() + "\t" + usr.getEdad() + "\n");

		}

		JOptionPane.showMessageDialog(null, outputTextArea,
				"Todos los usuarios", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Imprime el grado medio de amigos por usuario
	 * 
	 * @param g grado medio
	 */
	public static void gradoMedio(double g) {
		JOptionPane.showMessageDialog(null, "El promedio de amigos por usuario es: " + g);

	}

	/** Imprime la lista de los usuarios mas influyentes de la Red Social
	 * 
	 * @param l lista ordenada de los usuarios mas influyentes
	 */
	public static void centralidad(List<Usuario> l) {
		JTextArea outputTextArea = new JTextArea();

		outputTextArea.setText("Codigo\tNombre\n");

		for (int i = 0; i < REPETECIONES; i++) {

			outputTextArea.append(l.get(i).getCodigo() + "\t" + l.get(i).getNombre() +"\n");

		}

		JOptionPane.showMessageDialog(null, outputTextArea,
				"Usuarios mas influyentes", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * @param r
	 * @throws KeyException
	 */
	public static void antiguedad(List<Relacion> r) throws KeyException {
		JTextArea outputTextArea = new JTextArea();

		outputTextArea.setText("Codigo del primer usuario\tTiempo siendo amigos\tCodigo del segundo usuario\n");

		for (Relacion re : r) {

			outputTextArea.append(re.getUsr1().getCodigo() + "\t\t" + re.gettSiendoAmigos() + "\t\t"
					+ re.getUsr2().getCodigo() + "\n");

		}

		JOptionPane.showMessageDialog(null, outputTextArea,
				"Camino mas corto entre 2 usuarios", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * @param e
	 */
	public static void error(String e) {
		JOptionPane.showMessageDialog(null, "Error: " + e, null, JOptionPane.ERROR_MESSAGE);

	}
}
