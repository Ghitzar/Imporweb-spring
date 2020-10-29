package pe.edu.upc.models.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.models.entities.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	List<Categoria> findByNombreCategoriaStartingWith(String nombreCategoria) throws Exception;

}
