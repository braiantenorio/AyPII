package net.datastructures;

public class Test {
    public static void main(String[] args) {
        List<Integer> lista1= new ArrayList<Integer>();
        List<Integer> lista2;
        lista1.add(0, 1);
        lista1.add(1, 2);
        lista1.add(2, 1);
        lista1.add(3, 5);
        lista1.add(4, 1);
        lista1.add(5, 6);
        lista1.add(6, 1); 

        lista2=lista1.posContains(1);
        System.out.println(lista2);

    }
}
