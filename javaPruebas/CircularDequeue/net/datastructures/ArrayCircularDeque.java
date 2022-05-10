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

    @SuppressWarnings({"unchecked"})
    public ArrayCircularDeque(int capacity){
        data= (E[]) new Object[capacity]; // safe cast;
    }


    
    /** 
     * @param e
     * @throws IllegalStateException
     */
    @Override
    public void addFirst(E e) throws IllegalStateException {
        if (sz== data.length) throw new IllegalStateException("Queue is full");
        f=(f-1+data.length) % data.length;
        data[f]= e;
        sz++;

       
    }

    
    /** 
     * @param e
     * @throws IllegalStateException
     */
    @Override
    public void addLast(E e) throws IllegalStateException{
        if (sz== data.length) throw new IllegalStateException("Queue is full");
        int avail =(f+sz) % data.length;
        data[avail]=e;
        sz++;
        
    }

    
    
    /** 
     * @return E
     */
    @Override
    public E first() {
        if( isEmpty()) return null;
        return data[f];
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return (sz == 0);
    }

    
    /** 
     * @return E
     */
    @Override
    public E last() {
        int avail= (f+sz)%data.length;
        return data[avail-1];
    }

    
    /** 
     * @return E
     */
    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = data[f];
        data[f] = null;                             // dereference to help garbage collection
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }

    
    /** 
     * @return E
     */
    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        int avail =(f+sz) % data.length;
        E answer = data[avail-1];
        data[avail-1]=null;
        sz--;
        return answer;
    }

    
    /** 
     * @return int
     */
    @Override
    public int size() {
        return sz;
    }

    
    /** 
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + sz;
        return result;
    }

    
    /** 
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArrayCircularDeque other = (ArrayCircularDeque) obj;
        if (sz != other.sz)
            return false;
            if (sz != other.sz)
            return false;
          int k=f;
          int h=other.f;
          for (int j=0; j<sz; j++)
            if (other.data[h]!=data[k]){
              h=(h+1) % data.length;
              k=(k+1) % data.length;
              return false;
            }
            return true;
        }

    
    

    
}