package finanzas;

public abstract class Bien {
    double valuacionFiscal;

    public Bien(double valuacionFiscal) {
        super();
        this.valuacionFiscal= valuacionFiscal;
    }

    

    public double getValuacionFiscal() {
        return valuacionFiscal;
    }



    public void setValuacionFiscal(double valuacionFiscal) {
        this.valuacionFiscal = valuacionFiscal;
    }



    public abstract double calcularImpuesto();




    
}