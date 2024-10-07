package org.aom.greeting.web;

import org.aom.greeting.domain.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		return "thymeleaf_testpage.html";
	}

	// showing the user registration page via thymeleaf
	@GetMapping("/register")
	String registerNewUser() {
		System.out.println("inside /register method");
		return "user_registration.html";
	}

	// showing a test jsp page
	@GetMapping("/showjsp")
	String showJspPage() {
		System.out.println("inside /showjsp method");
		return "test_jsp.jsp";
	}

	// binding the form input values to the Java pojo User so that the form input data reaches the controller method
	// Using @ModelAttribute in the method argument makes sure that the model named "user" will be available in the rendered confirmation page.
	//@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	String processRegistration(@ModelAttribute("user") final User userObj) {
		System.out.println("inside /processRegistration method");
		System.out.println(userObj);
		return "user_registration_confirmation.html";
	}
	
	@ModelAttribute
	void addingCommonObjects(Model model) {
		model.addAttribute("common_message", "Thymeleaf is amazing!");
	}
}