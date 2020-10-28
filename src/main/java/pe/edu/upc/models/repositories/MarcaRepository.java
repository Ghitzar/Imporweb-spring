package pe.edu.upc.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.models.entities.Marca;


@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>{

}
