package pe.edu.upc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.models.entities.Producto;



@Controller
@RequestMapping("/")
public class InicioController {
	
	@GetMapping
	public String inicio(Model model) {
		
		return "inicio2";
	}
	
	@ModelAttribute("productoBusqueda")
	public Producto createModel() {
	    return new Producto();
	 	}
	

}
