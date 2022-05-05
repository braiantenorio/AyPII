package datastructures;

/**
 * DoublyLinkedStack
 */
public class DoublyLinkedStack<E>  implements Stack<E> {
    private DoublyLinkedList<E> list= new DoublyLinkedList<>();
    
    
   public DoublyLinkedStack(){}


    @Override
    public int size() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return list.isEmpty();
    }

    @Override
    public void push(E element) {
        // TODO Auto-generated method stub
        list.addFirst(element);
    }

    @Override
    public E top() {
        // TODO Auto-generated method stub
        return list.first();
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        return list.removeFirst();
    }


    
}