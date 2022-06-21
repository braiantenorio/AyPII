package finanzas;

public class Vehiculo extends Bien{

    String patente;
    String modelo;
    private double porcValuacion= 2;

    public Vehiculo( Double valuacionFiscal, String patente, String modelo) {
        super(valuacionFiscal);
        this.patente= patente;
        this.modelo=modelo;
    }

    
    public String getPatente() {
        return patente;
    }


    public void setPatente(String patente) {
        this.patente = patente;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Valuacion Fiscal:" + this.valuacionFiscal + " Patente:" + this.patente + "Modelo:" + this.modelo;
    }


    @Override
    public double calcularImpuesto() {
        double total;
        total= this.valuacionFiscal*(this.porcValuacion/100);
        return total;
    }

    


}
