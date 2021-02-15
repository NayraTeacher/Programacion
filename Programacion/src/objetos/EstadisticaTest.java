package objetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EstadisticaTest {

	@Test
	@DisplayName(value = "Test media tres notas: 7, 8.2 , 4")
	void testMedia() {
		float[] notas = {7.0F, 8.2F, 4.0F};
		
		float notamedia = Estadistica.media(notas);
		assertEquals(notamedia, 6.4F);
	}
	
	@Test
	@DisplayName(value = "Test media vector vacio")
	void testMedia1() {
		float[] notas = new float[0];
		
		float notamedia = Estadistica.media(notas);
		assertEquals(notamedia, 0);
	}

	@Test
	@DisplayName(value="Test moda notas del curso: 7,7,7,8,2,6,6,4,6,5,1,6,9")
	void testModa() {
		float[] notas= {7,7,7,8,2,6,6,4,6,5,1,6,9};
		float notamoda = Estadistica.moda(notas);
		assertEquals(notamoda, 6);
	}

	@Test
	void testFactorial() {
		fail("Not yet implemented");
	}

	@Test
	void testVariacionSR() {
		fail("Not yet implemented");
	}

	@Test
	void testVariacion() {
		fail("Not yet implemented");
	}

	@Test
	void testPermutaciones() {
		fail("Not yet implemented");
	}

}
