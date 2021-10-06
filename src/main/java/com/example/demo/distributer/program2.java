package com.example.demo.distributer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class program2 {

	@GetMapping("/go")
	public @ResponseBody String path() {
		return "I want a go KB bank";
	}
}
 