package net.datastructures;


/**
 * ArrayCircularDeque
 */
public class ArrayCircularDeque<E> implements Deque<E>{
    public static final int CAPACITY=50;

    private E[] data;

    private int f =0;

    private int sz =0;
    
    public ArrayCircularDeque(){
        this(CAPACITY);
    }

    public ArrayCircularDeque(int capacity){
        data= (E[]) new Object[capacity]; // safe cast;
    }


    @Override
    public void addFirst(E e) throws IllegalStateException {
       
    }

    @Override
    public void addLast(E e) throws IllegalStateException{
        if (sz== data.length) throw new IllegalStateException("Queue is full");
        int avail =(f+sz) % data.length;
        data[avail]=e;
        sz++;
        
    }

    @Override
    public E first() {
        if( isEmpty()) return null;
        return data[f];
    }

    @Override
    public boolean isEmpty() {
        return (sz == 0);
    }

    @Override
    public E last() {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public int size() {
        return sz;
    }
    

    
}