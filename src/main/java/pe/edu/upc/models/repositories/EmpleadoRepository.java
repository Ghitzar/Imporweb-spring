package pe.edu.upc.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.models.entities.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
	List<Empleado> findBynombreEmpleadoStartingWith(String empleado) throws Exception;
}
