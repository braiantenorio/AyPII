package net.datastructures;

public class Test {
    private static SinglyLinkedList<String> l1;
    public static void main(String[] args) {
        l1 = new SinglyLinkedList<String>();

        l1.addLast("1");
        l1.addLast("2");
        l1.addLast("3");
        l1.addLast("4");
        l1.addLast("5");
        l1.addLast("6");
        l1.addLast("7");
        l1.addLast("8");
        l1.addLast("9");

        System.out.println(l1.step(0, 4));
        
    }
    
}
