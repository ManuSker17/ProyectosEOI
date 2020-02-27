package es.eoi.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/hello")
	public String index(HttpServletRequest request) {
		System.out.println("ip"+request.getRemoteAddr());
		return "Hola desde el controller";
	}

}
