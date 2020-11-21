package pe.edu.upc.services;

import java.util.List;

import pe.edu.upc.models.entities.Transporte;

public interface TransporteService extends CrudService<Transporte, Integer> {
	List<Transporte> findByNombreTransporte(String nombreTransporte) throws Exception;
}
