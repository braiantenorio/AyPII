package net.datastructures;

import java.util.Iterator;

public class Test {
    private static LinkedPositionalList<String> lista;

    
    public static void main(String[] args) {
        lista= new LinkedPositionalList<String>();
        Position<String> result;
        Position<String> j;
        Position<String> h;
        j=lista.addFirst("leon");
        lista.addLast("lucas");
        result =lista.first();
        h=lista.addAfter(result,"braian");
        lista.addAfter(j, "Mario");
        lista.addAfter(h, "Marito");
        
        //System.out.println(lista);

        Iterator<String> iter= lista.iterator();
        while(iter.hasNext()) {
            String i= iter.next();
            System.out.println(i);
        

        }

    }
        
}


