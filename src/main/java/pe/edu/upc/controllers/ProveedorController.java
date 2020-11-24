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

import pe.edu.upc.services.ProveedorService;
import pe.edu.upc.models.entities.Producto;
import pe.edu.upc.models.entities.Proveedor;


@Controller
@RequestMapping("/proveedor")
@SessionAttributes("proveedor")
public class ProveedorController {

	@Autowired
	private ProveedorService ProveedorService;
	
	@GetMapping
	public String inicio(Model model) {
		Proveedor proveedor = new Proveedor();
		try {
			List<Proveedor> proveedores = ProveedorService.findAll();
			model.addAttribute("proveedores", proveedores);
			model.addAttribute("proveedor", proveedor);
		
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "proveedor/listar";
	}
	
	@ModelAttribute("productoBusqueda")
	public Producto createModel() {
	    return new Producto();
	 	}
	
	@GetMapping("new")
	public String nuevo(Model model) {
		Proveedor proveedor =new Proveedor();
		model.addAttribute("proveedor",proveedor);
		return "proveedor/nuevo";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("proveedor") Proveedor proveedor) {
		try {
			ProveedorService.save(proveedor);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "proveedor/nuevo";
	}
	@GetMapping("/{id]/p")
	public String view(@PathVariable("id") Integer id, Model model) {
		try {
			Optional<Proveedor> optional = ProveedorService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("proveedor", optional.get());
				return "proveedor/view";
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "redirect:/proveedores";
	}
	
	@GetMapping("search")
	public String search() {
		return "proveedor/search";
	}
}
