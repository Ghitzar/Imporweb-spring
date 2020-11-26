package pe.edu.upc.services;

import java.util.List;

import pe.edu.upc.models.entities.Pedido;
import pe.edu.upc.utils.EstadoPedido;

public interface PedidoService extends CrudService<Pedido, Integer> {
	List<Pedido> findByClienteAndEstadoPedido(Integer id, EstadoPedido estadoPedido) throws Exception;
}
