package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("/home")
	public String home() {
		
		return "Home";
	}
	
	@RequestMapping("/novoEvento")
	public String novoEvento() {
		return "NovoEvento";
	}
	@RequestMapping("/novaCasa")
	public String novaCasa() {
		return "NovaCasa";
	}
}
