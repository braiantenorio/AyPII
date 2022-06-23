package modelo;

public class Relacion {

    String tInterDiaria;
    String likes;
    int tSiendoAmigos;

    public Relacion(String tInterDiaria, String likes, int tSiendoAmigos2) {
        super();
        this.tInterDiaria= tInterDiaria;
        this.likes= likes;
        this.tSiendoAmigos= tSiendoAmigos2;
    }

    public String gettInterDiaria() {
        return tInterDiaria;
    }

    public void settInterDiaria(String tInterDiaria) {
        this.tInterDiaria = tInterDiaria;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public int gettSiendoAmigos() {
        return tSiendoAmigos;
    }

    public void settSiendoAmigos(int tSiendoAmigos) {
        this.tSiendoAmigos = tSiendoAmigos;
    }

    @Override
    public String toString() {
        return "Tiempo de interaccion diaria: " + tInterDiaria + " Cantidad de likes:" + likes + " Tiempo siendo amigos: " + tSiendoAmigos;
    }

    
}
