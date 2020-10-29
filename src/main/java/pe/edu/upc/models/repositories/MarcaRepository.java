package pe.edu.upc.models.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.models.entities.Marca;


@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>{
	List<Marca> findByNombreMarcaContaining(String nombreMarca) throws Exception;
}
