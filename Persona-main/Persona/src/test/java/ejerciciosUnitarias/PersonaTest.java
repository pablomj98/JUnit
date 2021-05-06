package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p;

	@BeforeEach
	void setUp() throws Exception {
		 p = new Persona();
	}




	@Test
	void testSetNombre() {
        p.setNombre("Fulanito");
        assertEquals("Fulanito", p.getNombre());
	}

	@Test
	void testSetEdad() {
        p.setEdad(30);
        assertEquals(30, p.getEdad());
	}

	@Test
	void testSetSexo() {
        p.setSexo('H');
        assertEquals('H', p.getSexo());
	}

	@Test
	void testSetPeso() {
        p.setPeso(80);
        assertEquals(80, p.getPeso());
	}

	@Test
	void testSetAltura() {
        p.setAltura(1.70);
        assertEquals(1.70, p.getAltura());
	}

	@Test
	void testCalcularIMC() {
        p = new Persona("", 20, 'H', 40, 2.00);
        assertEquals(-1, p.calcularIMC());
        p = new Persona("", 20, 'H', 150, 2.00);
        assertEquals(1, p.calcularIMC());
        p = new Persona("", 20, 'H', 80, 2.00);
        assertEquals(0, p.calcularIMC());
	}

	@Test
	void testEsMayorDeEdad() {
        p = new Persona("", 20, 'H', 40, 2.00);
        assertEquals(true, p.esMayorDeEdad());
        p = new Persona("", 16, 'H', 40, 2.00);
        assertEquals(false, p.esMayorDeEdad());
	}

	@Test
	void testToString() {
		p = new Persona("Fulanito", 20, 'H', 40, 1.70);
		assertEquals("Informacion de la persona:\n"
                + "Nombre: " + "Fulanito" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 20 + " años\n"
                + "Peso: " + 40.0 + " kg\n"
                + "Altura: " + 1.70 + " metros\n", p.toString());
	}

}
