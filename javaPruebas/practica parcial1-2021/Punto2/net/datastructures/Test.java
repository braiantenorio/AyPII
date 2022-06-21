package net.datastructures;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<String> lista= new SinglyLinkedList<String>();
        
        lista.addLast("Juan");
        lista.addLast("Pedro");
        lista.addLast("Juan");
        lista.addLast("Ana");
        lista.addLast("Juan");
        lista.addLast("Pedro");
        lista.addLast("Pedro");
        lista.addLast("Braian");

       System.out.println(lista.noDuplicate());

    }
    
}
