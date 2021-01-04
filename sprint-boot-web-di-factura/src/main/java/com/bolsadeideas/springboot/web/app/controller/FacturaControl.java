package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.domains.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaControl {
	
	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Ejemplo de Factura");
		return "factura/ver";
	}
	
}
