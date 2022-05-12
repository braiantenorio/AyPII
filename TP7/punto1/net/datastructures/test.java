package net.datastructures;

public class test {

    static LinkedBinaryTree<String> t = new LinkedBinaryTree<>();

    public static void main(String[] args) {
        Position<String> p, q, r, s, u, v, w, a, b;
        p = t.addRoot("-");
        q = t.addLeft(p, "/");
        r = t.addLeft(q, "*");
        s = t.addLeft(r, "+");
        t.addLeft(s, "3");
        t.addRight(s, "1");
        t.addRight(r, "3");
        a = t.addRight(q, "+");
        b = t.addLeft(a, "-");
        t.addLeft(b, "9");
        t.addRight(b, "5");
        t.addRight(a, "2");
        u = t.addRight(p, "+");
        v = t.addLeft(u, "*");
        t.addLeft(v, "3");
        w = t.addRight(v, "-");
        t.addLeft(w, "7");
        t.addRight(w, "4");
        t.addRight(u, "6");

        Iterable<Position<String>> pos = t.postorder();

        for (Position<String> nodo : pos)
            System.out.print(" " + nodo.getElement());

    }
    
}
