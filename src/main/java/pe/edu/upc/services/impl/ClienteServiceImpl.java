package pe.edu.upc.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.models.entities.Cliente;
import pe.edu.upc.models.repositories.ClienteRepository;
import pe.edu.upc.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ClienteRepository clienteRepostory;

	@Transactional
	@Override
	public Cliente save(Cliente entity) throws Exception {
		return clienteRepostory.save(entity);
	}

	@Transactional
	@Override
	public Cliente update(Cliente entity) throws Exception {
		return clienteRepostory.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		clienteRepostory.deleteById(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findAll() throws Exception {
		return clienteRepostory.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Cliente> findById(Integer id) throws Exception {
		return clienteRepostory.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findBynombreCliente(String cliente) throws Exception {
		return clienteRepostory.findBynombreClienteStartingWith(cliente);
		
	}

}
