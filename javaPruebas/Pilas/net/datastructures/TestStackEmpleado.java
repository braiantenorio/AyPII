package empleado;

public class TestStackEmpleado {
    private static DoublyLinkedStack<Empleado> Empleados;
    public static void main(String[] args) {
        Empleados = new DoublyLinkedList<Empleado>();
        Empleado E1 = new EmpleadoPorComision("Braian Tenorio", 41597685, 100, 45);
        Empleado E2 = new EmpleadoAsalariado("Juan", 45681987, 2000);
        Empleado E3 = new EmpleadoPorHora("Jose", 45359756, 200, 15);


        Empleados.push(E1);
        Empleados.push(E2);
        Empleados.push(E3);


    }

    
}
