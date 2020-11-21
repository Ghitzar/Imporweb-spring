package pe.edu.upc.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.models.entities.Transporte;

@Repository
public interface TransporteRepository extends JpaRepository<Transporte, Integer> {
	List<Transporte> findByNombreTransporteStartingWith(String nombreTransporte) throws Exception;

}