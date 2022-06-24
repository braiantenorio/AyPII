package net.datastructures;

public abstract class Universitario extends Asistente {
    public String universidad;
    public String carrera;
    public Universitario(String nombre, String email,String universidad, String carrera) {
        super(nombre, email);
        this.universidad= universidad;
        this.carrera=carrera;
    }
    public String getUniversidad() {
        return universidad;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
}   

