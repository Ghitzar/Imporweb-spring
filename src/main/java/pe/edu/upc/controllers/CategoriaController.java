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
import pe.edu.upc.models.entities.Categoria;
import pe.edu.upc.models.entities.Marca;
import pe.edu.upc.models.entities.Producto;
import pe.edu.upc.services.CategoriaService;
import pe.edu.upc.services.MarcaService;



@Controller
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private MarcaService marcaService;
	
	@GetMapping
	public String inicio(Model model) {
		Categoria categoria = new Categoria();
		
		try {
			List<Categoria> categorias = categoriaService.findAll();
			List<Marca> marcas = marcaService.findAll();
			model.addAttribute("categorias", categorias);
			model.addAttribute("categoria", categoria);
			model.addAttribute("marcas", marcas);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "categoria/inicio";
	}

	@ModelAttribute("productoBusqueda")
	public Producto createModel() {
	    return new Producto();
	 	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("categoria") Categoria categoria) {
		try {
			categoriaService.save(categoria);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/categorias";
	}
	
	@GetMapping("/{id}/p")
	public String view(@PathVariable("id") Integer id, Model model) {
		try {
			Optional<Categoria> optional = categoriaService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("categoria", optional.get());
				return "categorias/view";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/categorias";
	}
	
	@GetMapping("search")
	public String search() {
		return "categoria/search";
	}
	
	
}
