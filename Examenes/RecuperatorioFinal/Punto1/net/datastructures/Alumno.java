package net.datastructures;

public class Alumno extends Universitario{

    public int matAprobada;
    public Alumno(String nombre, String email, String universidad, String carrera, int matAprobada) {
        super(nombre, email, universidad, carrera);
        this.matAprobada=matAprobada;
    }
    public int getMatAprobada() {
        return matAprobada;
    }
    public void setMatAprobada(int matAprobada) {
        this.matAprobada = matAprobada;
    }
    
}
