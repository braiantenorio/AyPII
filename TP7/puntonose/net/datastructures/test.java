package net.datastructures;

public class test {

    static LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();

    public static void main(String[] args) {
        Position<String> p, q, r, s, v, w, t, m,i;
        p = tree.addRoot("F");
        q = tree.addLeft(p, "B");
        tree.addLeft(q, "A");
        r = tree.addRight(q, "D");
        tree.addLeft(r, "C");
        m = tree.addRight(r, "E");
        s = tree.addRight(p, "G");
        t = tree.addRight(s, "I");//I
        v = tree.addLeft(t, "Z");//H
        w = tree.addRight(v, "Z");
        
       /* for (Position<String> pos: tree.inorder() )
         System.out.print(" "+ pos.getElement());
         
        for (Position<String> pos : tree.ancestor(m))
            System.out.print(" " + pos.getElement());
        */
        
        /*   i= tree.search("G");
        System.out.println(i==s);

        for (Position<String> pos : tree.searchAll("E"))
            System.out.print(" " + pos.getElement());
*/
        System.out.println(tree.duplicate());

        

        /*
         * System.out.print("\nNiveles: ");
         * for (Position<String> pos : tree.breadthfirst())
         * System.out.print(pos.getElement());
         * 
         * System.out.println();
         * 
         * //Iterable<Position<String>> pos = t.postorder();
         * 
         * for (Position<String> pos : tree.postorder())
         * System.out.print(" " + pos.getElement());
         * 
         * System.out.println();
         * 
         * 
         * 
         * 
         * for (Position<String> pos: tree.children(p))
         * System.out.print(pos.getElement()+ " ");
         * 
         * System.out.println();
         * System.out.println(tree.height(p));
         * System.out.println(tree.sibling(q).getElement());
         * System.out.println(tree.isRoot(p));
         * System.out.println(tree.depth(p));
         */
    }

}
