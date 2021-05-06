package ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

	Product p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Product("Trasto", 30.5);
	}


	@Test
	void testGetTitle() {
		assertEquals("Trasto", p.getTitle());
	}

	@Test
	void testGetPrice() {
		assertEquals(30.5, p.getPrice());
	}

	
	//Este no se hacerlo
//	@Test
//	void testEqualsObject() {
//		fail("Not yet implemented");
//	}

}
