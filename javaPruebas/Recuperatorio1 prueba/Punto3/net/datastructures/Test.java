package net.datastructures;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> d = new DoublyLinkedList<String>();

        d.addLast("A");
        d.addLast("B");
        d.addLast("C");
        d.addLast("D");
        d.addLast("A");
        d.addLast("B");
        d.addLast("C");
        d.addLast("D");

        System.out.println(d.searchPosition("D", false));


    }

}
