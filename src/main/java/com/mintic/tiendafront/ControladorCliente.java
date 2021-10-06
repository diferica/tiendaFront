package com.mintic.tiendafront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mintic.tiendafront.client.ICliente;

@Controller
public class ControladorCliente {
	
	@Autowired
	ICliente icliente;
	
	
	@GetMapping("/cliente")
	public String cliente(Model model) {
		
		model.addAttribute("clientes", icliente.getCliente());
		return "cliente";
	}
}
