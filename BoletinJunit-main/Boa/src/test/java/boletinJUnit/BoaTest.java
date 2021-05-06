package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoaTest {

	Boa bicha;
	Boa bicha2;

	@BeforeEach
	void setUp() throws Exception {
		bicha = new Boa("Nagini", 2, "Macarrones");
		bicha2 = new Boa("Diamantina", 5, "granola bars");
	}

	@Test
	void testIsHealthy() {
		assertEquals(false, bicha.isHealthy());
		assertEquals(true, bicha2.isHealthy());
	}

	@Test
	void testFitsInCage() {
		assertEquals(true, bicha.fitsInCage(3));
		assertEquals(false, bicha2.fitsInCage(3));
	}

}
