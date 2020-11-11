package pe.edu.upc.services;

import java.util.List;

import pe.edu.upc.models.entities.Proveedor;

public interface ProveedorService extends CrudService<Proveedor, Integer>{
	List<Proveedor> findByNombreProveedor(String nombreProveedor) throws Exception;
}
