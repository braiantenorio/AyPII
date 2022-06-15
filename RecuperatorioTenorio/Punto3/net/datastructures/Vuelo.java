package net.datastructures;

public class Vuelo {
    private int nroVuelo;
    private String codigoOrigen;
    private String codigoDestino;
    private double precio;  
    
    public Vuelo(int nroVuelo,String codigoOrigen,String codigoDestino,double precio){
        this.codigoDestino=codigoDestino;
        this.codigoOrigen=codigoOrigen;
        this.nroVuelo= nroVuelo;
        this.precio=precio;

    }

    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public String getCodigoOrigen() {
        return codigoOrigen;
    }

    public void setCodigoOrigen(String codigoOrigen) {
        this.codigoOrigen = codigoOrigen;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(String codigoDestino) {
        this.codigoDestino = codigoDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    


}
