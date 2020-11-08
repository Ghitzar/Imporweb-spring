package pe.edu.upc.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "importaciones")
public class Importacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idImportacion;
	
	@Column(name = "fechaSolicitada")
	@Temporal(TemporalType.DATE)
	private Date fechaSolicitada;
	
	@Column(name = "fechaEntregada")
	@Temporal(TemporalType.DATE)
	private Date fechaEntregada;
	
	public Integer getIdImportacion() {
		return idImportacion;
	}

	public void setIdImportacion(Integer idImportacion) {
		this.idImportacion = idImportacion;
	}

	public Date getFechaSolicitada() {
		return fechaSolicitada;
	}

	public void setFechaSolicitada(Date fechaSolicitada) {
		this.fechaSolicitada = fechaSolicitada;
	}

	public Date getFechaEntregada() {
		return fechaEntregada;
	}

	public void setFechaEntregada(Date fechaEntregada) {
		this.fechaEntregada = fechaEntregada;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Column(name = "importe", nullable = false)
	private Float importe;
	
	@ManyToOne	// paso 2 distrito_id
	@JoinColumn(name = "proveedor_id")	//3
	private Proveedor proveedor;
}
