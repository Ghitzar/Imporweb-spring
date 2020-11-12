package pe.edu.upc.controllers;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import pe.edu.upc.models.entities.Categoria;
import pe.edu.upc.models.entities.Producto;
import pe.edu.upc.services.CategoriaService;
import pe.edu.upc.services.ProductoService;




@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	
	
	@GetMapping
	public String inicio(Model model) {
		Producto producto = new Producto();
		
		try {
			List<Producto> productos = productoService.findAll();
			List<Categoria> categorias = categoriaService.findAll();
			model.addAttribute("productos", productos);
			model.addAttribute("producto", producto);
			model.addAttribute("categorias", categorias);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "producto/inicio";
	}
	
//	@ModelAttribute("producto")
//	public Producto createModel() {
//	    return new Producto();
//	}
	
//	@PostMapping("search")
//	public String search(@ModelAttribute("producto") Producto producto, Model model) {	
//		try {
//			List<Producto> productos = productoService.findByNombreProducto(producto.getNombreProducto());
//			model.addAttribute("productos", productos);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "productos/result-search";
//	}

	@PostMapping("save")
	public String save(@ModelAttribute("producto") Producto producto,@RequestParam("file") MultipartFile image) {
		try {
				if (!image.isEmpty()) {
					
					String uniqueFileName = UUID.randomUUID().toString().concat("_").concat(image.getOriginalFilename());
					Path rootPath = Paths.get("uploads").resolve(uniqueFileName);
					Path rootAbsolutPath = rootPath.toAbsolutePath();
					try {
						Files.copy(image.getInputStream(), rootAbsolutPath);
	
						producto.setImage(uniqueFileName);
						
					} catch (IOException e) {
						e.printStackTrace();
					}
			
				}
			
			productoService.save(producto);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/productos";
	}
	
	@GetMapping("/{id}/p")
	public String view(@PathVariable("id") Integer id, Model model) {
		try {
			Optional<Producto> optional = productoService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("producto", optional.get());
				return "productos/view";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/productos";
	}
	
	@GetMapping("search")
	public String search() {
		return "producto/search";
	}
	
	@GetMapping("/buscarCategoriaZapatilla")
	public String buscarCategoria(Model model) {
		model.addAttribute("productos", productoService.findByCategoriaZapatilla());
		return "producto/buscarCategoria";
	}
	
//	@GetMapping("/agregarLista/{id}") 	
//	public String agregarLista(@PathVariable Integer id, Model model,RedirectAttributes objRedir) 
//	
//	{ 		
//		
//		Optional <Producto> productoSearch = Optional.ofNullable(productoService.findById(id)); 	
//		if (productoSearch == null) {
//			objRedir.addFlashAttribute("mensaje", "Ocurrio un rochesin");
//			return "redirect:/";
//		}
//		else {
//			model.addAttribute("productos", productoSearch);
//			return "producto/listacarrito";
//	
//		
//		}
//		}
	
	
	
	
	
	

}
