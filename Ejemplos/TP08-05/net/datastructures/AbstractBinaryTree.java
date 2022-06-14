package net.datastructures;
/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.List;
import java.util.ArrayList;

/**
 * An abstract base class providing some functionality of the BinaryTree
 * interface.
 *
 * The following five methods remain abstract, and must be implemented by a
 * concrete subclass: size, root, parent, left, right.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

	/**
	 * Returns the Position of p's sibling (or null if no sibling exists).
	 *
	 * @param p A valid Position within the tree
	 * @return the Position of the sibling (or null if no sibling exists)
	 * @throws IllegalArgumentException if p is not a valid Position for this tree
	 */
	@Override
	public Position<E> sibling(Position<E> p) {
		Position<E> parent = parent(p);
		if (parent == null)
			return null; // p must be the root
		if (p == left(parent)) // p is a left child
			return right(parent); // (right child might be null)
		else // p is a right child
			return left(parent); // (left child might be null)
	}

	/**
	 * Returns the number of children of Position p.
	 *
	 * @param p A valid Position within the tree
	 * @return number of children of Position p
	 * @throws IllegalArgumentException if p is not a valid Position for this tree.
	 */
	@Override
	public int numChildren(Position<E> p) {
		int count = 0;
		if (left(p) != null)
			count++;
		if (right(p) != null)
			count++;
		return count;
	}

	/**
	 * Returns an iterable collection of the Positions representing p's children.
	 *
	 * @param p A valid Position within the tree
	 * @return iterable collection of the Positions of p's children
	 * @throws IllegalArgumentException if p is not a valid Position for this tree.
	 */
	@Override
	public Iterable<Position<E>> children(Position<E> p) {
		List<Position<E>> snapshot = new ArrayList<>(2); // max capacity of 2
		if (left(p) != null)
			snapshot.add(left(p));
		if (right(p) != null)
			snapshot.add(right(p));
		return snapshot;
	}

	/**
	 * Adds positions of the subtree rooted at Position p to the given snapshot
	 * using an inorder traversal
	 * 
	 * @param p        Position serving as the root of a subtree
	 * @param snapshot a list to which results are appended
	 */
	private void inorderSubtree(Position<E> p, List<Position<E>> snapshot) {
		if (left(p) != null)
			inorderSubtree(left(p), snapshot);
		snapshot.add(p);
		if (right(p) != null)
			inorderSubtree(right(p), snapshot);
	}

	/**
	 * Returns an iterable collection of positions of the tree, reported in inorder.
	 * 
	 * @return iterable collection of the tree's positions reported in inorder
	 */
	public Iterable<Position<E>> inorder() {
		List<Position<E>> snapshot = new ArrayList<>();
		if (!isEmpty())
			inorderSubtree(root(), snapshot); // fill the snapshot recursively
		return snapshot;
	}

	/**
	 * Returns an iterable collection of the positions of the tree using inorder
	 * traversal
	 * 
	 * @return iterable collection of the tree's positions using inorder traversal
	 */
	@Override
	public Iterable<Position<E>> positions() {
		return inorder();
	}

	/**
	 * Un �rbol binario es lleno (full) si cada nodo interno tiene dos hijos o
	 * ninguno
	 * 
	 * @return retorna "true" si es un �rbol binario lleno o "false" en caso
	 *         contrario
	 */
	public boolean full() {
		for (Position<E> p : positions())
			if (numChildren(p) == 1)
				return false;
		return true;
	}

	/**
	 * Un �rbol binario de expresiones contiene en sus nodos externos operandos y en
	 * sus nodos internos operadores
	 * 
	 * @param op lista de operadores v�lidos
	 * @return retorna "true" si es �rbol binario de expresiones o "false" en caso
	 *         contrario
	 */
	public boolean validExpressionTree(List<E> op) {

		for (Position<E> p : positions()) {
			if (numChildren(p) == 1)
				return false;
			if (isExternal(p) && !isDouble(p.getElement()))
				return false;
			if (isInternal(p) && !op.contains(p.getElement()))
				return false;
		}
		return true;
	}

	private boolean isDouble(E element) {
		try {
			Double.parseDouble(element.toString());

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/**
	 * Retorna una lista con la expresi�n postfija de un �rbol de expresiones. Si el
	 * operando es una variable busca su valor en el Map v. Si la variable no existe
	 * lanza la excepci�n: ArithmeticException indicando el nombre de la variable
	 * que no existe.
	 * 
	 * @param v Map conteniendo el nombre de la variable y su valor
	 * @return lista con la expresi�n postfija de un �rbol de expresiones
	 */
	public List<String> postfixExpression(Map<String, Double> v) {
		List<String> l = new ArrayList<String>();
		int i = 0;
		String element;
		for (Position<E> n : postorder()) {
			element = n.getElement().toString();
			if (isExternal(n) && !isDouble(n.getElement()))
				if (v.get(element) == null)
					throw new ArithmeticException("Variable " + element + " no encontrada!");
				else
					element = v.get(element).toString();

			l.add(i++, element.toString());
		}
		return l;
	}
}
