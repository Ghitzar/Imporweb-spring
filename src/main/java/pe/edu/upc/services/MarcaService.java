package pe.edu.upc.services;

import java.util.List;
import pe.edu.upc.models.entities.Marca;

public interface MarcaService extends CrudService<Marca, Integer>{
	List<Marca> findByNombreMarca(String nombreMarca) throws Exception;

}
