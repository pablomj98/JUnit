package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {

	Serie s1;
	Serie s2;
	Serie s3;

	@BeforeEach
	public void Constructor() {
		s1 = new Serie("Juego de Tronos", 8, "Fantasía", "HBO");
		s2 = new Serie("Los Simpsons", 15, "Humor", "Groening");
		s3 = new Serie();
	}

	@Test
	void testGetTitulo() {
		assertEquals("Juego de Tronos", s1.getTitulo());
	}

	@Test
	void testSetTitulo() {
		s3.setTitulo("CSI");
		assertEquals("CSI", s3.getTitulo());
	}

	@Test
	void testGetnumeroTemporadas() {
		assertEquals(8, s1.getnumeroTemporadas());
	}

	@Test
	void testSetnumeroTemporadas() {
		s3.setnumeroTemporadas(10);
		assertEquals(10, s3.getnumeroTemporadas());
	}

	@Test
	void testGetGenero() {
		assertEquals("Fantasía", s1.getGenero());
	}

	@Test
	void testSetGenero() {
		s3.setGenero("Policiaca");
		assertEquals("Policiaca", s3.getGenero());
	}

	@Test
	void testGetcreador() {
		assertEquals("HBO", s1.getcreador());
	}

	@Test
	void testSetcreador() {
		s3.setcreador("Desconocido");
		assertEquals("Desconocido", s3.getcreador());
	}

	@Test
	void testEntregar() {
		s1.entregar();
		assertEquals(true, s1.isEntregado());
	}

	@Test
	void testDevolver() {
		s1.devolver();
		assertEquals(false, s1.isEntregado());
	}

	@Test
	void testIsEntregado() {
		s1.devolver();
		assertEquals(false, s1.isEntregado());
	}

	@Test
	void testCompareTo() {
		assertEquals(Serie.MAYOR, s2.compareTo(s1));
		assertEquals(Serie.MENOR, s1.compareTo(s2));
		s3.setnumeroTemporadas(8);
		assertEquals(Serie.IGUAL, s3.compareTo(s1));
	}

	@Test
	void testToString() {
		assertEquals("Informacion de la Serie: \n" + "\tTitulo: " + s1.getTitulo() + "\n" + "\tNumero de temporadas: "
				+ s1.getnumeroTemporadas() + "\n" + "\tGenero: " + s1.getGenero() + "\n" + "\tCreador: "
				+ s1.getcreador(), s1.toString());
	}

	@Test
	void testEqualsSerie() {
		assertEquals(false, s1.equals(s2));
		s3.setTitulo("Juego de Tronos");
		s3.setcreador("HBO");
		assertEquals(true, s1.equals(s3));
	}

}
