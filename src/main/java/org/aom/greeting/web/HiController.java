package org.aom.greeting.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiController {
	
	@GetMapping("/hi")
	@ResponseBody
	String sayHi() {
		return "hi everyone";
	}
	
	@GetMapping("/hello")
	String sayHello() {
		System.out.println("inside /hello method");
		return "hellopage";
	}
	
	@GetMapping("/admin")
	@ResponseBody
	String adminEndPoint() {
		return "hello everyone, this is admin page";
	}
	
	@GetMapping("/testthymeleaf")
	String testingThymeleaf(Model model) {
		System.out.println("inside /testthymeleaf method");
		model.addAttribute("message", "Thymeleaf rocks!!!");
		return "thymeleaf_testpage";
	}
	
	// showing the user registration page via thymeleaf
	@GetMapping("/register")
	String registerNewUser() {
		System.out.println("inside /register method");
		return "user_registration";
	}
	
}
