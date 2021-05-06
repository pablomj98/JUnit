package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FridgeTest {

	Fridge nevera;
	private Collection<String> food = new HashSet<String>();

	@BeforeEach
	void setUp() throws Exception {
		nevera = new Fridge();
		food.add("Lentejas");
		food.add("Kinderbueno");
		food.add("Chorizo");
	}

	@Test
	void testPut() {
		nevera.put("Lentejas");
		assertEquals(true, nevera.contains("Lentejas"));
	}

	@Test
	void testContains() {
		nevera.put("Lentejas");
		assertEquals(true, nevera.contains("Lentejas"));
		assertEquals(false, nevera.contains("Chorizo"));
	}

	@Test
	void testTake() {
		try {
			nevera.put("Kinderbueno");
			assertEquals(true, nevera.contains("Kinderbueno"));
			nevera.take("Kinderbueno");
			assertEquals(false, nevera.contains("Kinderbueno"));
		} catch (Exception e) {
			fail("No debería fallar");
		}
	}
	
	@Test
	void testTakeException() {
		try {
			nevera.take("Kinderbueno");
			fail("No hay en el frigorífico");
		} catch (Exception e) {
			assertEquals(true, e.getMessage().contains("Kinderbueno"));
		}
	}

}
