package com.sample.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		System.out.println("Calling method");
		model.addAttribute("movie", name);
		return "list";

	}
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello() {
		System.out.println("Calling hello method");
		
		//if we return a bean that will be returned as json, we need to add jackson dependency
		return "abc";

	}
	
}