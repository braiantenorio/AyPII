package test;

import net.datastructures.ChainHashMap;
import net.datastructures.LinkedBinaryTree;
import net.datastructures.Map;
import net.datastructures.Position;

public class Test {

	public static void main(String[] args) {
		LinkedBinaryTree<String> t = new LinkedBinaryTree<String>();
		Position<String> p, q, r, s, u, v, w, x, y, z;

		p = t.addRoot("*");
		q = t.addLeft(p, "/");
		t.addRight(p, "C");

		r = t.addLeft(q, "*");
		s = t.addRight(q, "+");

		u = t.addLeft(r, "+");
		v = t.addRight(r, "-");

		t.addLeft(u, "5");
		t.addRight(u, "A");

		t.addLeft(v, "A");
		t.addRight(v, "1");

		w = t.addLeft(s, "+");
		x = t.addRight(s, "-");

		t.addLeft(w, "A");
		t.addRight(w, "B");

		y = t.addLeft(x, "-");
		t.addLeft(y, "7");
		t.addRight(y, "A");

		z = t.addRight(x, "1");

		Map<String, Double> var = new ChainHashMap<String, Double>();
		var.put("A", 2.0);
		var.put("B", 5.0);
		var.put("C", 8.0);

		System.out.println(t.postfixExpression(var));

		var.remove("C");

		try {
			System.out.println(t.postfixExpression(var));
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
