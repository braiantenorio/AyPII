package net.datastructures;

/**
 * TestStackEmpleado
 */
public class TestStackEmpleado {
    private static DoublyLinkedStack<Empleado> lista;

    public static void main(String[] args) {
        lista = new DoublyLinkedStack<Empleado>();
        Empleado E1;
        Empleado E2;
        Empleado E3;

        E1 = new EmpleadoAsalariado("Juan", "11111111", 25000);
        E2 = new EmpleadoPorHora("Pedro", "22222222", 150, 100);
        E3 = new EmpleadoPorComision("Ana", "33333333", 450000, 10);
        
        lista.push(E1);
        lista.push(E2);
        lista.push(E3);

        System.out.print(lista);

    }
}