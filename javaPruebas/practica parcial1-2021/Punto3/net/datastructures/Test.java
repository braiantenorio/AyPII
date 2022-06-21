package net.datastructures;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> lista = new DoublyLinkedList<String>();

        lista.addLast("n");
        lista.addLast("e");
        lista.addLast("u");
        lista.addLast("q");
        lista.addLast("u");
        lista.addLast("e");
        lista.addLast("n");

        System.out.println(lista.palindrome());
    }
    
}
