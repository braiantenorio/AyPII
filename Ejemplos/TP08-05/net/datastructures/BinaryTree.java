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

/**
 * An interface for a binary tree, in which each node has at most two children.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public interface BinaryTree<E> extends Tree<E> {

	/**
	 * Returns the Position of p's left child (or null if no child exists).
	 *
	 * @param p A valid Position within the tree
	 * @return the Position of the left child (or null if no child exists)
	 * @throws IllegalArgumentException if p is not a valid Position for this tree
	 */
	Position<E> left(Position<E> p) throws IllegalArgumentException;

	/**
	 * Returns the Position of p's right child (or null if no child exists).
	 *
	 * @param p A valid Position within the tree
	 * @return the Position of the right child (or null if no child exists)
	 * @throws IllegalArgumentException if p is not a valid Position for this tree
	 */
	Position<E> right(Position<E> p) throws IllegalArgumentException;

	/**
	 * Returns the Position of p's sibling (or null if no sibling exists).
	 *
	 * @param p A valid Position within the tree
	 * @return the Position of the sibling (or null if no sibling exists)
	 * @throws IllegalArgumentException if p is not a valid Position for this tree
	 */
	Position<E> sibling(Position<E> p) throws IllegalArgumentException;

	/**
	 * Un �rbol binario es lleno (full) si cada nodo interno tiene dos hijos o
	 * ninguno
	 * 
	 * @return retorna "true" si es un �rbol binario lleno o "false" en caso
	 *         contrario
	 */
	public boolean full();
	
	/**
	 * Un �rbol binario de expresiones contiene en sus nodos externos operandos y en
	 * sus nodos internos operadores
	 * 
	 * @param op lista de operadores v�lidos
	 * @return retorna "true" si es �rbol binario de expresiones o "false" en caso
	 *         contrario
	 */
	public boolean validExpressionTree(List<E> op);

}
