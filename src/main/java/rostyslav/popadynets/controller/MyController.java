package rostyslav.popadynets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	private String showHome() {
		return "home";
	}
	
	@GetMapping("/about")
	private String showAbout() {
		return "about";
	}
	
	@GetMapping("/login")
	private String showLogin() {
		return "login";
	}
	
	@GetMapping("/news")
	private String showNews() {
		return "news";
	}
	
	@GetMapping("/registration")
	private String showRegistration() {
		return "registration";
	}
	
	@GetMapping("/services")
	private String showServices() {
		return "services";
	}
}
