package pe.edu.upc.models.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(name = "nombreCliente", nullable = false, length = 20)
	private String nombreCliente;
	
	@Column(name = "dni", nullable = false, length = 8)
	private String dni;

	@Column(name = "direccion", nullable = false, length = 20)
	private String direccion;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;
	

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente(Integer idCliente, String nombreCliente, String dni, String direccion) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.direccion = direccion;
	}

	public Cliente() {
		super();
		
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	
	
	
}
