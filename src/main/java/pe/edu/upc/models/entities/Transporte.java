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
@Table(name = "transportes")
public class Transporte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransporte;
	
	@Column(name = "nombreTransporte", nullable = false, length = 20)
	private String nombreTransporte;

	@Column(name = "nombreAgencia", nullable = false, length = 20)
	private String nombreAgencia;
	
	@Column(name = "tipo", nullable = false, length = 20)
	private String tipo;

	@OneToMany(mappedBy = "transporte")		// 1(@OneToMany), 4(mappedBy)
	private List<Categoria> pedidos;

	@OneToMany(mappedBy = "transporte")		// 1(@OneToMany), 4(mappedBy)
	private List<Categoria> importaciones;
	
	public Transporte() {
		pedidos = new ArrayList<>();
		importaciones = new ArrayList<>();
	}

	public Integer getIdTransporte() {
		return idTransporte;
	}

	public void setIdTransporte(Integer idTransporte) {
		this.idTransporte = idTransporte;
	}

	public String getNombreTransporte() {
		return nombreTransporte;
	}

	public void setNombreTransporte(String nombreTransporte) {
		this.nombreTransporte = nombreTransporte;
	}

	public String getNombreAgencia() {
		return nombreAgencia;
	}

	public void setNombreAgencia(String nombreAgencia) {
		this.nombreAgencia = nombreAgencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Categoria> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Categoria> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Categoria> getImportaciones() {
		return importaciones;
	}

	public void setImportaciones(List<Categoria> importaciones) {
		this.importaciones = importaciones;
	}
	
	
}
