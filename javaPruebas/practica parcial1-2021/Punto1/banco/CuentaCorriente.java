package banco;

public class CuentaCorriente  extends Cuenta{

    private final double DESCUBIERTO= 5000.00;

    public CuentaCorriente(int nroCuenta, double saldo) {
        super(nroCuenta, saldo);
    }

    @Override
    public void depositar(double importe) {
        super.setSaldo(super.getSaldo()+importe);
    }

    @Override
    public void extraer(double importe) throws Exception {
        if((super.getSaldo()-importe)<-DESCUBIERTO)
            throw new Exception("Saldo insuficiente");
        super.setSaldo(super.getSaldo()-importe);
    }
    
}
