package net.datastructures;


public class TestArrayStack {
    private static DoublyLinkedStack<String> lista;
    private static LinkedStack<String> lista2;
    private static ArrayStack<String> lista3;

    public static void main(String[] args) {

        lista = new DoublyLinkedStack<String>();
        lista2 = new LinkedStack<String>();
        lista3 = new ArrayStack<String>();

        long startTime = System.currentTimeMillis();
        lista.push("A");
        lista.push("B");
        lista.push("C");
        lista.push("D");

        int size = lista.size();
        //System.out.println(size);
        boolean empty = lista.isEmpty();
        //System.out.println(empty);
        String pop = lista.pop();
        String topper = lista.top();
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println(elapsed);


        long startTime2 = System.currentTimeMillis();
        lista2.push("A");
        lista2.push("B");
        lista2.push("C");
        lista2.push("D");

        int size2 = lista2.size();
        //System.out.println(size2);
        boolean empty2 = lista2.isEmpty();
        //System.out.println(empty2);
        String pop2 = lista2.pop();
        String topper2 = lista2.top();
        long endTime2 = System.currentTimeMillis();
        long elapsed2 = endTime2 - startTime2;
        System.out.println(elapsed2);
        
        long startTime3 = System.currentTimeMillis();
        lista3.push("A");
        lista3.push("B");
        lista3.push("C");
        lista3.push("D");

        int size3 = lista3.size();
        //System.out.println(size3);
        boolean empty3 = lista3.isEmpty();
        //System.out.println(empty3);
        String pop3 = lista3.pop();
        String topper3 = lista3.top();
        long endTime3 = System.currentTimeMillis();
        long elapsed3 = endTime3 - startTime3;
        System.out.println(elapsed3);
    }

}


