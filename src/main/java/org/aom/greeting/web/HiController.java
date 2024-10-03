package org.aom.greeting.web;

import org.springframework.stereotype.Controller;
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
}
