package pe.edu.upc.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.models.entities.Proveedor;

import java.util.List;

@Repository
public interface ProveedorRepository extends JpaRepository <Proveedor, Integer>{
	List<Proveedor> findByNombreProveedorStartingWith(String nombreProveedor) throws Exception;
}
