/**
 * 
 */
package ahh.com.testparte1.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author adria
 *
 */
public class IndexControllerTest {

	@Test
	public void welcome() {
		IndexController indexController = new IndexController();

		String[] paramArray = null;
		String resultadoEsperado = "El array está vacio";
		String resultadoObtenido = indexController.welcome(paramArray);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void welcomeWithParamNull() {
		IndexController indexController = new IndexController();

		String[] paramArray = new String[3];
		String resultadoEsperado = "param[0]null\n" + "param[1]null\n" + "param[2]null\n";
		String resultadoObtenido = indexController.welcome(paramArray);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void welcomeWithParam() {
		IndexController indexController = new IndexController();

		String[] paramArray = new String[] { "Adrian", "Hernandez", "Hernandez" };
		String resultadoEsperado = "param[0]Adrian\n" + "param[1]Hernandez\n" + "param[2]Hernandez\n";
		String resultadoObtenido = indexController.welcome(paramArray);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
