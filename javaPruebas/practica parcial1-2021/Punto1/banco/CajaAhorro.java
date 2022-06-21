package banco;

public class CajaAhorro  extends Cuenta {
    public CajaAhorro(int nroCuenta, double saldo) {
        super(nroCuenta, saldo);
    }

    @Override
    public void depositar(double importe) {
        super.setSaldo(super.getSaldo()-importe);        
    }

    @Override
    public void extraer(double importe) throws Exception {
        if((super.getSaldo()-importe)<=0)
            throw new Exception("Saldo insuficiente");
        super.setSaldo(super.getSaldo()-importe);
    }
    
}
