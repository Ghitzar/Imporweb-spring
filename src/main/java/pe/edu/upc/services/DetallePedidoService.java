package pe.edu.upc.services;

import java.util.List;

import pe.edu.upc.models.entities.DetallePedido;
import pe.edu.upc.utils.EstadoPedido;

public interface DetallePedidoService extends CrudService<DetallePedido, Integer>{
	List<DetallePedido> findByProveedorAndNotEstadoPedido(Integer id, EstadoPedido estadoPedido) throws Exception;
}
