package dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	Cuenta cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("1111.2222.12.1234567890", "Fulanito");
	}

	@Test
	void testIngresarDouble() {
		try {
			cuenta.ingresar(1000);

		} catch (Exception e) {
			fail("No debería fallar");
		}
		assertTrue(cuenta.getSaldo() == 1000.0);

	}

	@Test
	void testRetirarDouble() {
		try {
			cuenta.retirar(1000);
		} catch (Exception e) {
		}
		assertTrue(cuenta.getSaldo() == 0.0);
	}

	@Test
	void testIngresarStringDouble() {
		try {
			cuenta.ingresar("Ingreso", 1000);

		} catch (Exception e) {
			fail("No debería fallar");
		}
		assertTrue(cuenta.getSaldo() == 1000.0);
	}

	@Test
	void testRetirarStringDouble() {
		try {
			cuenta.retirar("Retirada", 1000);
		} catch (Exception e) {
		}
		assertTrue(cuenta.getSaldo() == 0.0);
	}

	@Test
	void testGetSaldo() {
		try {
			cuenta.ingresar(1000);
		} catch (Exception e) {
		}

		assertEquals(1000.0, cuenta.getSaldo());
	}

}
