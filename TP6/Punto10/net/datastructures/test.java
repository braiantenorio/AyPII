package net.datastructures;
public class test {

    static LinkedPositionalList<String> list = new LinkedPositionalList<>();
    public static void main(String[] args) {

        Position<String> p,q;

        p=list.addFirst("A");
        list.addLast("B");
        list.addLast("C");
        q=list.addLast("D");
        list.addLast("E");

        System.out.print(list.indexOf(p));

        System.out.print(list.findPosition("A")==p);

        
    }
    
}
