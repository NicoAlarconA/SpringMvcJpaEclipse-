package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Cliente;

public interface ClienteServicio {

	Cliente findClienteByid(int id);
	List<Cliente> listarClientes();
	void agregarCliente(Cliente c);
	void eliminarCliente(int clienteid);
	void editarCliente(Cliente t);
	
}
