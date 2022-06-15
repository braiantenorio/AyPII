package net.datastructures;
public class Test {
    static LinkedBinaryTree<String> t = new LinkedBinaryTree<>();
    public static void main(String[] args) {
        Position<String> p, q, r, i;
        p = t.addRoot("1");

        q = t.addLeft(p, "2");
        i = t.addLeft(q, "4");
        t.addRight(q, "5");

        r = t.addRight(p, "3");
        t.addLeft(r, "6");
        t.addRight(r, "7");


        for( Position<String> e : t.cousins(i))
            System.out.print(" " + e.getElement());

       
    }
     
}
