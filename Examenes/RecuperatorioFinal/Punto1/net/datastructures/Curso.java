package net.datastructures;

public class Curso {
    public String nombre;
    public int duracion;
    public Curso(String nombre, int duracion) {
        this.nombre=nombre;
        this.duracion=duracion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    @Override
    public String toString() {
        return "nombre: "+ nombre+ " duracion: "+ duracion;
    }

    
    
}
