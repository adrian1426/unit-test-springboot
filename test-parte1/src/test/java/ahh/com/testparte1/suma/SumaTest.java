/**
 * 
 */
package ahh.com.testparte1.suma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author adria
 *
 */
public class SumaTest {

	Suma suma = new Suma();

	@Test
	public void sumaTest() {

		int resultadoSumaObtenido = suma.suma(10, 15);
		int resultadoSumaEsperado = 25;

		assertEquals(resultadoSumaEsperado, resultadoSumaObtenido);

	}

}
