package oauth.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.security.Principal;

@RestController
@RequestMapping("/rest/api/v1")
public class HomeController {

	@GetMapping("/products")
	public String home() {
		return "These are products!";
	}
}
