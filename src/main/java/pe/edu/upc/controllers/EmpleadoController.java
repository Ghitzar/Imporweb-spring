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


import pe.edu.upc.models.entities.Empleado;
import pe.edu.upc.services.EmpleadoService;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	
	
	@GetMapping
	public String inicio(Model model) {
		Empleado empleado = new Empleado();
		
		try {
			List<Empleado> empleados = empleadoService.findAll();
			
			model.addAttribute("empleados",empleados);
			model.addAttribute("empleado", empleado);
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "empleado/inicio";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("empleado") Empleado empleado) {
		try {
			empleadoService.save(empleado);
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "redirect:/empleados";
	}
	
	@GetMapping("/{id}/p")
	public String view(@PathVariable("id") Integer id, Model model) {
		try {
			Optional<Empleado> optional = empleadoService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("empleado", optional.get());
				return "empleados/view";
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "redirect:/empleados";
	}
	
	@GetMapping("search")
	public String search() {
		return "empleado/search";
	}
	
}

