package pe.edu.upc.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.models.entities.Transporte;
import pe.edu.upc.models.repositories.ProveedorRepository;
import pe.edu.upc.models.repositories.TransporteRepository;
import pe.edu.upc.services.TransporteService;

@Service
public class TransporteServiceImpl implements TransporteService, Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private TransporteRepository TransporteRepository;
	
	@Transactional
	@Override
	public Transporte save(Transporte entity) throws Exception {
		return TransporteRepository.save(entity);
	}

	
	@Transactional
	@Override
	public Transporte update(Transporte entity) throws Exception {
		return TransporteRepository.save(entity);
	}

	
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		TransporteRepository.deleteById(id);
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<Transporte> findAll() throws Exception {
		return TransporteRepository.findAll();
	}

	
	@Transactional(readOnly = true)
	@Override
	public Optional<Transporte> findById(Integer id) throws Exception {
		return TransporteRepository.findById(id);
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<Transporte> findByNombreTransporte(String nombreTransporte) throws Exception {
		return TransporteRepository.findByNombreTransporteStartingWith(nombreTransporte);
	}
	
	
}

