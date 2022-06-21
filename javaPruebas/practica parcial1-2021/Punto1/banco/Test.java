package banco;

public class Test {

    public static void main(String[] args) throws Exception {
        Cliente cliente1= new Cliente("Braian Tenorio", "44564878");
        Cliente cliente2= new Cliente("Marcelo Lopez", "47874658");
        Cliente cliente3= new Cliente("Lucas Lopez", "41874598");


        Cuenta c1= new CuentaCorriente(1235, 6000);
        Cuenta c2= new CajaAhorro(1240,5000.00 );

        Cuenta c3= new CuentaCorriente(1250, 6000);
        Cuenta c4= new CajaAhorro(1260,9000.00 );

        Cuenta c5= new CuentaCorriente(1270, 10000);

        cliente1.agregarCuenta(c1);
        cliente1.agregarCuenta(c2);

        cliente2.agregarCuenta(c3);
        cliente2.agregarCuenta(c4);

        cliente3.agregarCuenta(c5);

        //c1.depositar(2000);
        c1.extraer(10000);
        System.out.println(c1.getSaldo());

        Cliente clientes[]={cliente1,cliente2,cliente3};

        double totalBanco=0;
        for (Cliente cli: clientes){
            totalBanco+= cli.calcularSaldo();
            System.out.println("Nombre: "+ cli.getNombre()+ ", Saldo: "+ cli.calcularSaldo());
        }
        System.out.println(totalBanco);

    }
    
}
