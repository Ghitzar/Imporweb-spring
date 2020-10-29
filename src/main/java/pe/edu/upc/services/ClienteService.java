package pe.edu.upc.services;

import java.util.List;

import pe.edu.upc.models.entities.Cliente;

public interface ClienteService extends CrudService<Cliente, Integer>{
	List<Cliente> findBynombreCliente(String cliente) throws Exception;

}
