package net.datastructures;

public class Test {
    public static Inscripto ins[];

    public static void main(String[] args) {
        Curso c1= new Curso("Matematica", 50);
        Curso c2= new Curso("Informatica", 30);
        Curso c3= new Curso("Java", 40);

        Asistente a1= new Docente("Braian Tenorio", "emailbraian@gmail.com", "UNPSJB", "Informatica", 'm', 2);
        Asistente a2= new Externo("Renzo Lopez", "emailrenzo@gmail.com","Setec", "Tornero");
        Asistente a3 =new Alumno("Mario Vidal", "emailmario@gmail.com", "UTN", "Lic. en mantenimiento", 6);

        Inscripto i1= new Inscripto(10,a1,c1);
        Inscripto i2= new Inscripto(7,a2,c2);
        Inscripto i3= new Inscripto(6,a3,c3);
        Inscripto i4= new Inscripto(9,a2,c1);
        Inscripto i5= new Inscripto(4,a3,c1);
        Inscripto i6= new Inscripto(6,a1,c2);


        Inscripto ins[] = {i1,i2,i3,i4,i5,i6};

        for(Inscripto in: ins){
            if(in.getAsistente().equals(a1))
                System.out.println(in.getCurso());
        }

        System.out.println();

        for(Inscripto in: ins){
            if(in.getCurso().equals(c1))
                System.out.println(in.getAsistente());
        }
        
    }
    
}