package AdC;

public class BraianTenorio {
    /*
     * los estados van de 0 a 11, la primera columna de la matriz corresponde
     * entrada x=0 y la segunda a x=1. Puede manipular el vector input para cambiar
     * la evolucion de la secuencias
     */
    static int input[] = { 1, 0,1, 0, 1, 1, 0, 0, 1, 1 };// vector de entrada
    static int estado;
    static int matriz[][] = { { 10, 8 }, { 3, 5 }, { 6, 6 }, { 4, 10 }, { 5, 3 }, { 2, 4 }, { 7, 7 }, { 11, 1 },
            { 9, 9 }, { 0, 11 }, { 1, 0 }, { 8, 2 } };// matriz de transicion
    static String salida[] = { "11", "01", "01", "11", "01", "11", "01", "11", "11", "10", "10", "11" };// vector de salida

    public static void main(String[] args) {
        estado = 0;
        for (int i = 0; i < input.length; i++) {
            int p = matriz[estado][input[i]];
            estado = p;
            System.out.println("El siguiente estado es " + estado + " y su salida es " + salida[estado]);

        }

    }

}