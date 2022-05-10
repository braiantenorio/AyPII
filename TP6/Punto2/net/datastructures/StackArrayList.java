package net.datastructures;


public class StackArrayList<E>  implements Stack<E> {
    private ArrayList<E> list= new ArrayList<>();

    public StackArrayList(){};

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public void push(E e) {
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public E top() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
