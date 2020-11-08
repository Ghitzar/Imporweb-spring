package pe.edu.upc.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.models.entities.Proveedor;
import pe.edu.upc.models.repositories.ProveedorRepository;
import pe.edu.upc.services.ProveedorService;

public class ProveedorServiceImpl implements ProveedorService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProveedorRepository ProveedorRepository;
	
	@Transactional
	@Override
	public Proveedor save(Proveedor entity) throws Exception {
		return ProveedorRepository.save(entity);
	}
	
	@Transactional
	@Override
	public Proveedor update(Proveedor entity) throws Exception {
		return ProveedorRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		ProveedorRepository.deleteById(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Proveedor> findAll() throws Exception {
		return ProveedorRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Proveedor> findById(Integer id) throws Exception {
		return ProveedorRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Proveedor> findBynombreProveedor(String nombreProveedor) throws Exception {
		return ProveedorRepository.findBynombreProveedorStartingWithList(nombreProveedor);
	}
}
