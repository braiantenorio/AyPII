package finanzas;

public class Inmueble extends Bien{
    private int manzana;
    private int lote;
    private boolean edificado;
    private double porcValuacionEdificado=0.3;
    private double porcValuacionBaldio=0.6;


    public Inmueble(double valuacionFiscal, int manzana, int lote, boolean edificado) {
        super(valuacionFiscal);
        this.manzana= manzana;
        this.lote= lote;
        this.edificado=edificado;
    }


    public int getManzana() {
        return manzana;
    }


    public void setManzana(int manzana) {
        this.manzana = manzana;
    }


    public int getLote() {
        return lote;
    }


    public void setLote(int lote) {
        this.lote = lote;
    }


    public boolean isEdificado() {
        return edificado;
    }


    public void setEdificado(boolean edificado) {
        this.edificado = edificado;
    }

    


    @Override
    public String toString() {
        return "Valuacion Fiscal:" + this.valuacionFiscal + "Manzana:"+ this.manzana + "Lote:"+ this.lote + "Es edificado?:" + this.edificado;
    }


    @Override
    public double calcularImpuesto() {
        double total;
        if(edificado)
            total = this.valuacionFiscal*(this.porcValuacionEdificado/100);
        else
             total = this.valuacionFiscal*(this.porcValuacionBaldio/100);
        return total;
    }

    
    
}
