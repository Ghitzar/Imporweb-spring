package pe.edu.upc.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "marcas")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	
	@Column(name = "nombreMarca", nullable = false, length = 20)
	private String nombreMarca;


	@OneToMany(mappedBy = "marca")		// 1(@OneToMany), 4(mappedBy)
	private List<Categoria> categorias;


	public Marca() {
		categorias = new ArrayList<>();
	}
	
	public Integer getIdMarca() {
		return idMarca;
	}


	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}


	public String getNombreMarca() {
		return nombreMarca;
	}


	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}




	
}
