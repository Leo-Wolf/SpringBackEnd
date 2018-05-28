package com.generation.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class indexController {
	@RequestMapping("/")
		public String getIndexPage() {
			return"index";		
		}
}
