/**
 * 
 */
package ahh.com.testparte1.suma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author adria
 *
 */
public class SumaTest {

	Suma suma = new Suma();
	
	@BeforeEach
	public void before() {
		System.out.println("ejecución before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("ejecución after");
	}

	@Test
	public void sumaTest() {

		int resultadoSumaObtenido = suma.suma(10, 15);
		int resultadoSumaEsperado = 25;
		System.out.println("ejecución suma");

		assertEquals(resultadoSumaEsperado, resultadoSumaObtenido);

	}

}
