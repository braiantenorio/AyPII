package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.datastructures.ArrayCircularDeque;
import net.datastructures.Deque;

public class TestDequeAddFirst {

	private Deque<String> dq1 = new ArrayCircularDeque<String>(6);
	private Deque<String> dq2 = new ArrayCircularDeque<String>(6);

	// deque vac�a
	@Test
	public void testDeque1() {
		dq1.addLast("Juan");
			
		dq2.addFirst("Juan");
		assertEquals(dq1, dq2);
	}

	// deque con datos
	@Test
	public void testDeque2() {
		dq1.addLast("Juan");
		dq1.addLast("Pedro");

		dq2.addFirst("Pedro");
		dq2.addFirst("Juan");
		assertEquals(dq1, dq2);
	}

	// deque sin espacio
	@Test(expected = IllegalStateException.class)
	public void testDeque3() {
		dq2.addFirst("Pedro");
		dq2.addFirst("Juan");
		dq2.addFirst("Ana");
		dq2.addFirst("Pablo");
		dq2.addFirst("Maria");
		dq2.addFirst("Jorge");
		dq2.addFirst("Analia");
	}

}