package cl.m5d12.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.m5d12.dao.Cliente;
import cl.m5d12.servicio.ClienteServicio;

@Controller
public class ClienteControlador {

	@Autowired
	ClienteServicio cs;
	
	@RequestMapping("/listarclientes")
	public String verclientes(Model m) {
		List<Cliente> listacliente = cs.listarClientes();
		m.addAttribute("lclientes",listacliente);
		return "listadoclientes";
	}
	
	
}
