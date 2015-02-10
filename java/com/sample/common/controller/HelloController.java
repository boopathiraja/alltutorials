package com.sample.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.common.model.employee;

@Controller
@RequestMapping("/welcome")
public class HelloController {

		@RequestMapping(method = RequestMethod.GET)
		public String printWelcome(ModelMap model) {
			model.addAttribute("message", "Spring 3 MVC Hello World");
			return "hello";
		}
	
	   @RequestMapping(value = "/employee", method = RequestMethod.GET)
	   public ModelAndView employee() {
	      return new ModelAndView("employee", "command", new employee());
	   }
	   
	   @RequestMapping(value = "/addEmp", method = RequestMethod.POST)
	   public String addEmp(@ModelAttribute("SpringWeb")employee emp, ModelMap model) {
		   model.addAttribute("name", emp.getName());
		   model.addAttribute("age", emp.getAge());
		   model.addAttribute("city", emp.getCity());
		   model.addAttribute("phone", emp.getPhone());
	       return "result";
	   }
	
	
}