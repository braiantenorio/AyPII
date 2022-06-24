package net.datastructures;

public abstract class Asistente {
    private String nombre;
    private String email;
    public Asistente(String nombre, String email) {
        super();
        this.nombre=nombre;
        this.email=email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "nombre: "+ nombre + " email: " + email;
    }
    

    
}
