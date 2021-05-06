package dominio;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	Debito debito;
	Cuenta cuenta;

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("1111.2222.12.1234567890", "Fulanito");

		String caducidad = "05/02/2025";
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date duracion = formato.parse(caducidad);
		Date fechaCaducidad = new Date(duracion.getTime());
		debito = new Debito("1234567890123456", "Fulanito", fechaCaducidad);

		debito.setCuenta(cuenta);
	}

	@Test
	void testRetirar() {
		
		
		try {
			debito.ingresar(2000);
			debito.retirar(1500.0);
			assertEquals(500, debito.getSaldo());
		} catch (Exception e) {
			fail("No deberia fallar");
		}
	}

	@Test
	void testIngresar() {
		try {
			debito.ingresar(1000.0);
			assertEquals(1000, debito.getSaldo());
		} catch (Exception e) {
			fail("No deberia fallar");
		}
	}

	@Test
	void testPagoEnEstablecimiento() {
		try {
			debito.ingresar(1000.0);
			debito.pagoEnEstablecimiento("fruteria", 100);
			assertEquals(900, debito.getSaldo());
		} catch (Exception e) {
			fail("No deberia fallar");
		}
	}

	@Test
	void testGetSaldo() {
		try {
			debito.ingresar(1000.0);
			assertEquals(1000.0, debito.getSaldo());
		} catch (Exception e) {
		}

		
	}

}
