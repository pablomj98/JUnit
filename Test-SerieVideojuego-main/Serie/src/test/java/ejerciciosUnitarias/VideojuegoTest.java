package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegoTest {

	Videojuego v1;
	Videojuego v2;
	Videojuego v3;

	@BeforeEach
	public void Constructor() {
		v1 = new Videojuego("Final Fantasy", 200, "Rol", "Enix");
		v2 = new Videojuego("Bandicoot", 100, "Plataforma", "Desconocido");
		v3 = new Videojuego();
	}

	@Test
	public void testGetTitulo() {

		assertEquals("Final Fantasy", v1.getTitulo());
	}

	@Test
	public void testSetTitulo() {

		v3.setTitulo("Peter Pan");
		assertEquals("Peter Pan", v3.getTitulo());
	}

	@Test
	public void testGetHorasEstimadas() {

		assertEquals(200, v1.getHorasEstimadas());
	}

	@Test
	public void testSetHorasEstimadas() {

		v3.setHorasEstimadas(150);
		assertEquals(150, v3.getHorasEstimadas());
	}

	@Test
	public void testGetGenero() {

		assertEquals("Rol", v1.getGenero());
	}

	@Test
	public void testSetGenero() {

		v3.setGenero("Infantil");
		assertEquals("Infantil", v3.getGenero());
	}

	@Test
	public void testGetcompañia() {

		assertEquals("Enix", v1.getcompañia());
	}

	@Test
	public void testSetcompañia() {

		v3.setcompañia("Disney");
		assertEquals("Disney", v3.getcompañia());
	}

	@Test
	public void testEntregar() {

		v1.entregar();
		assertEquals(true, v1.isEntregado());
	}

	@Test
	public void testDevolver() {

		v1.devolver();
		assertEquals(false, v1.isEntregado());
	}

	@Test
	public void testIsEntregado() {

		v1.devolver();
		assertEquals(false, v1.isEntregado());
	}

	@Test
	public void testCompareTo() {

		assertEquals(Serie.MAYOR, v1.compareTo(v2));
		assertEquals(Serie.MENOR, v2.compareTo(v1));
		v3.setHorasEstimadas(200);
		assertEquals(Serie.IGUAL, v3.compareTo(v1));
	}

	@Test
	public void testToString() {

		assertEquals("Informacion del videojuego: \n" + "\tTitulo: " + v1.getTitulo() + "\n" + "\tHoras estimadas: "
				+ v1.getHorasEstimadas() + "\n" + "\tGenero: " + v1.getGenero() + "\n" + "\tcompañia: "
				+ v1.getcompañia(), v1.toString());
	}

	@Test
	public void testEquals() {

		assertEquals(false, v1.equals(v2));
		v3.setTitulo("Final Fantasy");
		v3.setcompañia("Enix");
		assertEquals(true, v1.equals(v3));
	}
}
