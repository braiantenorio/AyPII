package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.datastructures.ArrayCircularDeque;
import net.datastructures.Deque;

public class TestDequeRemoveLast {

	private Deque<String> dq1;

	@Before
	public void setUp() throws Exception {
		dq1 = new ArrayCircularDeque<String>(6);
		dq1.addLast("Juan");
		dq1.addLast("Ana");
	}
	
	// deque primer elemento
	@Test
	public void testDeque1() {
		String s = dq1.removeFirst();
		assertEquals(s, "Juan");
	}

	// deque ultimo elemento
	@Test
	public void testDeque2() {
		dq1.removeFirst();
		String s = dq1.removeFirst();
		assertEquals(s, "Ana");
	}

	// deque sin elementos
	public void testDeque3() {
		dq1.removeFirst();
		dq1.removeFirst();
		assertNull(dq1.removeFirst());
	}

}