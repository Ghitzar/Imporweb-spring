package pe.edu.upc.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.models.entities.Producto;



@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	List<Producto> findByNombreProductoStartingWith(String nombreProducto) throws Exception;

}
