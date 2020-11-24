package pe.edu.upc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import pe.edu.upc.models.entities.Marca;
import pe.edu.upc.models.entities.Producto;
import pe.edu.upc.services.MarcaService;

@Controller
@RequestMapping("/marcas")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	
	
	@GetMapping
	public String inicio(Model model) {
		Marca marca = new Marca();
		
		try {
			List<Marca> marcas = marcaService.findAll();
			
			model.addAttribute("marcas", marcas);
			model.addAttribute("marca", marca);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "marca/inicio";
	}

	@ModelAttribute("productoBusqueda")
	public Producto createModel() {
	    return new Producto();
	 	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("marca") Marca marca) {
		try {
			marcaService.save(marca);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/marcas";
	}
	
	@GetMapping("/{id}/p")
	public String view(@PathVariable("id") Integer id, Model model) {
		try {
			Optional<Marca> optional = marcaService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("marca", optional.get());
				return "marcas/view";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/marcas";
	}
	
	@GetMapping("search")
	public String search() {
		return "marca/search";
	}
	
}
