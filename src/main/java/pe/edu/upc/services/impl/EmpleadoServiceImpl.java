package pe.edu.upc.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.models.entities.Empleado;
import pe.edu.upc.models.repositories.EmpleadoRepository;
import pe.edu.upc.services.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EmpleadoRepository empleadoRepostory;

	@Transactional
	@Override
	public Empleado save(Empleado entity) throws Exception {
		return empleadoRepostory.save(entity);
	}

	@Transactional
	@Override
	public Empleado update(Empleado entity) throws Exception {
		return empleadoRepostory.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		empleadoRepostory.deleteById(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public List<Empleado> findAll() throws Exception {
		return empleadoRepostory.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Empleado> findById(Integer id) throws Exception {
		return empleadoRepostory.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Empleado> findBynombreEmpleado(String empleado) throws Exception {
		return empleadoRepostory.findBynombreEmpleadoStartingWith(empleado);
	}
	
}
