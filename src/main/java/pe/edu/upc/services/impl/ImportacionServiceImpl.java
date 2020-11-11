package pe.edu.upc.services.impl;

import java.io.Serializable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.models.entities.Importacion;
import pe.edu.upc.models.repositories.ImportacionRepository;
import pe.edu.upc.services.ImportacionService;

@Service
public class ImportacionServiceImpl implements ImportacionService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private  ImportacionRepository ImportacionRepository;
	
	@Transactional
	@Override
	public Importacion save(Importacion entity) throws Exception {
		return ImportacionRepository.save(entity);
	}
	
	@Transactional
	@Override
	public Importacion update(Importacion entity) throws Exception {
		return ImportacionRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		ImportacionRepository.deleteById(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Importacion> findAll() throws Exception {
		return ImportacionRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Importacion> findById(Integer id) throws Exception {
		return ImportacionRepository.findById(id);
	}
}
