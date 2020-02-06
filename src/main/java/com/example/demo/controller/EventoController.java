package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.CasaShow;
import com.example.demo.model.NovoShow;
import com.example.demo.repository.Casas;
import com.example.demo.repository.Shows;

@Controller
public class EventoController {
	
	@Autowired
	private Casas casas;
	
	@Autowired
	private Shows shows;
	 
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
	
	@RequestMapping(value = "/novaCasa" , method = RequestMethod.POST)
	public String salvar(CasaShow casashow) {
		casas.save(casashow);
	 return "Home";
	}
	
	@RequestMapping(value="/novoEvento" , method = RequestMethod.POST)
	public String salvar(NovoShow novoshows) {
		shows.save(novoshows);
		return "Home";
	}
}