package net.datastructures;

public class test {
    static LinkedBinaryTree<String> t = new LinkedBinaryTree<>();
    static LinkedBinaryTree<String> sub = new LinkedBinaryTree<>();

    public static void main(String[] args) {
        Position<String> p, q, r, s;
        p = t.addRoot("1");

        q = t.addLeft(p, "2");
        t.addLeft(q, "4");
        t.addRight(q, "5");

        r = t.addRight(p, "3");
        t.addLeft(r, "6");
        t.addRight(r, "7");

        s = sub.addRoot("3");
        sub.addLeft(s, "6");
        sub.addRight(s, "7");

        System.out.println(t.isSubtree(sub));

    }

}
