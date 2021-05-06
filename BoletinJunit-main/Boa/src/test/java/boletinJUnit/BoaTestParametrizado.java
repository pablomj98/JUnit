package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BoaTestParametrizado {

	Boa bicha;
	Boa bicha2;

	@BeforeEach
	void setUp() throws Exception {
		bicha = new Boa("Nagini", 2, "Macarrones");
		bicha2 = new Boa("Diamantina", 5, "granola bars");
	}

	@ParameterizedTest(name = "Test IsHealthy")
	@CsvSource({
			"Nagini1,    	 7,   chocolate,   	  false",
			"Diamantina1,    5,   granola bars,   true",
			"Nagini2,        7,   chuches,        false",
			"Diamantina2,    5,   chocolate,      false",
			"Nagini3,        7,   granola bars,   true",
			"Diamantina3,    5,   chuches,        false",
			"Nagini4,        7,   chuches,        false",
			"Diamantina4,    5,   granola bars,   true"
			
	})
	
	void testIsHealthy1(String nombre,int medidas,String comida, boolean expectedResult) throws Exception {
		bicha = new Boa(nombre,medidas,comida);
		
		assertEquals(expectedResult, bicha.isHealthy());
	}
	

	@ParameterizedTest(name = "Test FitsInCage")
	@CsvSource({
			"Nagini,    	2,    3,     Macarrones,    true",
			"Diamantina,    5,   3,   granola bars,   false"
			
	})
	void testFitsInCage2(String nombre,int medidas,int cageLength,String comida, boolean expectedResult) throws Exception {
		bicha = new Boa(nombre,medidas,comida);
		
		assertEquals(expectedResult, bicha.fitsInCage(cageLength));
	}

}
