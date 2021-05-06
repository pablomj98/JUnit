package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

	// private Stack<Integer> pila;

	Pila p;

	@BeforeEach
	void setUp() throws Exception {
		// pila = new Stack<Integer>();
		p = new Pila();
	}

	@Test
	void testPush() {
		p.push(1);
		assertEquals(true, p.isEmpty());
		p.push(10);
		assertEquals(false, p.isEmpty());
	}

	@Test
	void testPop() {
		assertEquals(null, p.pop());

		p.push(5);
		p.push(6);
		p.push(7);

		assertEquals(7, p.pop());
		assertEquals(6, p.pop());
		assertEquals(5, p.pop());

	}

	@Test
	void testIsEmpty() {
		assertEquals(true, p.isEmpty());

		p.push(10);
		assertEquals(false, p.isEmpty());
	}

	@Test
	void testTop() {
		assertEquals(null, p.top());

		p.push(5);
		p.push(6);
		p.push(7);

		assertEquals(7, p.top());
	}

}
