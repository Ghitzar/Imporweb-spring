package pe.edu.upc.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "proveedores")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProveedor;
	
	public Proveedor() {
		importaciones = new ArrayList<Importacion>();
	}


	public Integer getIdProveedor() {
		return idProveedor;
	}


	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}


	public String getNombreProveedor() {
		return nombreProveedor;
	}


	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public List<Importacion> getImportaciones() {
		return importaciones;
	}


	public void setImportaciones(List<Importacion> importaciones) {
		this.importaciones = importaciones;
	}


	@Column(name = "nombreProveedor", nullable = false, length = 20)
	private String nombreProveedor;
	
	@Column(name = "email", nullable = false, length = 20)
	private String email;
	
	@Column(name = "telefono", nullable = false, length = 20)
	private String telefono;
	

	@OneToMany(mappedBy = "proveedor") // paso 1, 4
	private List<Importacion> importaciones;
}
