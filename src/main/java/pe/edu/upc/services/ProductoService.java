package pe.edu.upc.services;

import java.util.List;


import pe.edu.upc.models.entities.Producto;

public interface ProductoService extends CrudService<Producto, Integer> {
	List<Producto> findByNombreProducto(String nombreProducto) throws Exception;
}
