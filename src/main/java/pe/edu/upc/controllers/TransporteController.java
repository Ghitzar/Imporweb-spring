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
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.models.entities.Producto;
import pe.edu.upc.models.entities.Proveedor;
import pe.edu.upc.models.entities.Transporte;
import pe.edu.upc.services.TransporteService;
@Controller
@RequestMapping("/transporte")
@SessionAttributes("transporte")
public class TransporteController {

	@Autowired
	private  TransporteService TransporteService;
	
	@GetMapping
	public String inicio(Model model) {
		Transporte transporte = new Transporte();
		try {
			List<Transporte> transportes = TransporteService.findAll();
			model.addAttribute("transportes", transportes);
			model.addAttribute("transporte", transporte);
		
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "transporte/listar";
	}
	@ModelAttribute("productoBusqueda")
	public Producto createModel() {
	    return new Producto();
	 	}
	
	@GetMapping("new")
	public String nuevo(Model model) {
		Transporte transporte =new Transporte();
		model.addAttribute("transporte",transporte);
		return "transporte/nuevo";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("transporte") Transporte transporte) {
		try {
			TransporteService.save(transporte);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "transporte/nuevo";
	}
	@GetMapping("/{id]/p")
	public String view(@PathVariable("id") Integer id, Model model) {
		try {
			Optional<Transporte> optional = TransporteService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("transporte", optional.get());
				return "transporte/view";
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "redirect:/transportes";
	}
	
	@GetMapping("search")
	public String search() {
		return "transporte/search";
	}
}
