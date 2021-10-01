package com.example.demo.distributer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class program1 {
	
	@GetMapping("/helloWorld")
	public @ResponseBody String sampleFunction1() {
		return "helloWorld2";
	}

}
