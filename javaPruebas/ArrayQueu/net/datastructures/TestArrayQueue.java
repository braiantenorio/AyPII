package net.datastructures;

public class TestArrayQueue {
    private static ArrayCircularQueue<String> cola;


    public static void main(String[] args) {
        
        cola = new ArrayCircularQueue<String>();
        cola.enqueue("A");
        cola.enqueue("B");
        cola.enqueue("C");
        cola.enqueue("D");
        System.out.println(cola);
        cola.rotate();
        System.out.println(cola);




    }




}
