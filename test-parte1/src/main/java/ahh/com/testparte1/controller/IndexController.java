/**
 * 
 */
package ahh.com.testparte1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adria
 *
 */

@RestController
public class IndexController {

	@PostMapping("/welcome")
	public String welcome(@RequestParam(required = false, name = "param") String[] paramArray) {
		String mensaje = "";
		int i = 0;

		if (paramArray == null) {
			mensaje = "El array está vacio";
		} else {
			for (String paramArrayItem : paramArray) {
				mensaje += "param[" + i + "]" + paramArrayItem + "\n";
				i++;
			}
		}

		return mensaje;
	}

}
