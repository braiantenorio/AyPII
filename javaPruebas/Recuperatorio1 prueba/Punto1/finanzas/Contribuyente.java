package finanzas;

public class Contribuyente {
    public long cuit;
    private String nombre;
    public Bien bienes[];
    private int nroBienes;
    private static final int max=10;

    public Contribuyente(long cuit, String nombre) {
        super();
        this.cuit=cuit;
        this.nombre=nombre;
        bienes= new Bien[max];
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarBien(Bien bien) {
        bienes[nroBienes++]= bien;
    }

    public double totalImpueto() {
        double i= 0;
        for(Bien bien: bienes)
            i+= bien.calcularImpuesto();
        return i;
    }

    public double calcularTotal(){
        double total=0;
        for (int i=0; i<nroBienes; i++)
            total=bienes[i].calcularImpuesto();
        return total;
    }
    
    
    
    
    

    











    
}