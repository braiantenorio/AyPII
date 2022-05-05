package net.datastructures;

/**
 * ArrayCircularQueue
 */
public class ArrayCircularQueue<E> extends ArrayQueue<E>  implements CircularQueue<E>{

    @Override
    public void rotate() {
        // TODO Auto-generated method stub
        if (isEmpty())
        return;
        E other=dequeue();
        enqueue(other);
        
    }
}
