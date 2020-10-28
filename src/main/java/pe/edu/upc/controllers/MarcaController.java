package pe.edu.upc.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upc.models.entities.Marca;
import pe.edu.upc.services.MarcaService;


@Controller
@RequestMapping("/marca")
public class MarcaController {
	
	
	@Autowired
	private MarcaService marcaService;
	
	@RequestMapping("/Registrar") 	
	public String Registrar(Model model) { 		
		model.addAttribute("marca", new Marca()); 		
		return "marca"; 	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("marca") Marca marca) {
		try {
			marcaService.save(marca);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "marca";
	}
	
	
	
	

}
