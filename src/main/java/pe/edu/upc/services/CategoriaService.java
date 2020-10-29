package pe.edu.upc.services;

import java.util.List;
import pe.edu.upc.models.entities.Categoria;

public interface CategoriaService extends CrudService<Categoria, Integer>{
	List<Categoria> findByNombreCategoria(String nombreCategoria) throws Exception;
}
