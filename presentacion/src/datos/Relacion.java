package datos;

public class Relacion {

    String tInterDiaria;
    String likes;
    String tSiendoAmigos;

    public Relacion(String tInterDiaria, String likes, String tSiendoAmigos) {
        super();
        this.tInterDiaria= tInterDiaria;
        this.likes= likes;
        this.tSiendoAmigos= tSiendoAmigos;
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

    public String gettSiendoAmigos() {
        return tSiendoAmigos;
    }

    public void settSiendoAmigos(String tSiendoAmigos) {
        this.tSiendoAmigos = tSiendoAmigos;
    }

    



    
}
