package ru.kouzma.englazavr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class MainController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String get(Model model) {
		System.out.print("2");
		return "index";
	}
	
}
