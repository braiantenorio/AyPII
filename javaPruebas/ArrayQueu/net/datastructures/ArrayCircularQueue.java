package net.datastructures;

/**
 * ArrayCircularQueue
 */
public class ArrayCircularQueue<E> extends ArrayQueue<E>  implements CircularQueue<E>{

    @Override
    public void rotate() {
        if (isEmpty())
        return;
        E other=dequeue();
        enqueue(other);
        
    }
}
