package net.datastructures;



public class TestArrayQueue {
    private static ArrayCircularQueue<String> cola;
    private static ArrayCircularQueue<String> cola2;


    public static void main(String[] args) {
        
        cola = new ArrayCircularQueue<String>();
        cola.enqueue("A");
        cola.enqueue("B");
        cola.enqueue("C");
        cola.enqueue("D");
        System.out.println(cola);
       /* cola.rotate();
        cola.rotate();
        */
        System.out.println(cola);

        cola2 = new ArrayCircularQueue<String>();
        cola2.enqueue("A");
        cola2.dequeue();
        cola2.enqueue("A");
        cola2.enqueue("B");
        cola2.enqueue("C");
        cola2.enqueue("D");

        boolean x= cola.equals(cola2);
        System.out.println(x);

        
    }




}
