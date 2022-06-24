package net.datastructures;

public class Docente extends Universitario{
    /*char ch1 = 's';
    char ch2 = 'm';
    char ch3 = 'e';*/


    public char dedicacion;
    public int matDicta;

    public Docente(String nombre, String email, String universidad, String carrera, char dedicacion, int matDicta ) {
        super(nombre, email, universidad, carrera);
        this.dedicacion=dedicacion;
        this.matDicta=matDicta;
        
    }

    public char getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(char dedicacion) {
        this.dedicacion = dedicacion;
    }

    public int getMatDicta() {
        return matDicta;
    }

    public void setMatDicta(int matDicta) {
        this.matDicta = matDicta;
    }
  
    
    
}
