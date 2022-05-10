package net.datastructures;


public class DoublyLinkedStack<E>  implements Stack<E> {
    private DoublyLinkedList<E> list= new DoublyLinkedList<>();
    
    
   public DoublyLinkedStack(){}


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }


    @Override
    public String toString() {
        return list.toString();
    }


    
}