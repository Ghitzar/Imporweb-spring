package pe.edu.upc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class InicioController {
	
	@GetMapping
	public String inicio(Model model) {
		
		return "inicio";
	}
	
	

}
