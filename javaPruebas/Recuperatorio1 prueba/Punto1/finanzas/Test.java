package finanzas;

public class Test {
    public static void main(String[] args) {

        Bien casa1 = new Inmueble(200000, 20, 2, false);
        Bien auto1 = new Vehiculo(50000., "ADA456", "Cruze");

        Bien casa2 = new Inmueble(350000, 21, 6, false);
        Bien auto2 = new Vehiculo(100000., "UKJ975", "Golf");

        Bien casa3 = new Inmueble(10000, 40, 3, true);
        Bien auto3 = new Vehiculo(20000., "PJD445", "Corsa");

        Contribuyente c1 = new Contribuyente(32541235, "Enzo Lopez");
        Contribuyente c2 = new Contribuyente(13272544, "Facundo Lopez");
        Contribuyente c3 = new Contribuyente(46456454, "Braian Tenorio");

        c1.agregarBien(casa1);
        c1.agregarBien(auto1);

        c2.agregarBien(casa2);
        c2.agregarBien(auto2);

        c3.agregarBien(casa3);
        c3.agregarBien(auto3);

        Contribuyente con[] = { c1, c2, c3 };

        double totalMunicipio = 0;
        for (Contribuyente cont : con) {
            totalMunicipio += cont.calcularTotal();
            System.out.println("Nombre: " + cont.getNombre() + ", Total de impuestos: " + cont.calcularTotal());
        }
        System.out.println("Total de impuestos que cobra al municipio: " + totalMunicipio);

    }

}
