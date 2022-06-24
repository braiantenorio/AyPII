package net.datastructures;

public class Inscripto {
    public int calificacion;
    public Asistente asistente;
    public Curso curso;

    public Inscripto(int calificacion, Asistente asistente, Curso curso) {
        this.calificacion=calificacion;
        this.asistente= asistente;
        this.curso=curso;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public Asistente getAsistente() {
        return asistente;
    }
    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
