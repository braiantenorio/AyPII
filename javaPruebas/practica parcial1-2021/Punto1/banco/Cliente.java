package banco;


public class Cliente {
    public String nombre;
    public String dni;
    private Cuenta cuentas[];
    private final int MAX_CUENTA = 5;
    private int nroDeCuentas;

    public Cliente(String nombre, String dni) {
        super();
        this.nombre=nombre;
        this.dni=dni;
        cuentas= new Cuenta[MAX_CUENTA]; 
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public Cuenta[] getCuentas() {
        return cuentas;
    }



    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }



    public int getNroDeCuentas() {
        return nroDeCuentas;
    }



    public void setNroDeCuentas(int nroDeCuentas) {
        this.nroDeCuentas = nroDeCuentas;
    }



    public void agregarCuenta(Cuenta cuenta){
        if(nroDeCuentas>=MAX_CUENTA)
            throw new IndexOutOfBoundsException();
        cuentas[nroDeCuentas++]= cuenta;
    }

    public double calcularSaldo(){
        double saldo=0;
        for(int i=0; i<nroDeCuentas; i++){
                saldo+= cuentas[i].getSaldo();
            }            
        return saldo;
    }

    
}