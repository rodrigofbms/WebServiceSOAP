package br.ucsal.Bussines;

import java.util.List;

import javax.jws.WebService;

import br.ucsal.Classes.Cliente;
import br.ucsal.DAO.ClienteDAO;

@WebService
public class ClienteBO {

	private ClienteDAO clienteDAO;
	
	public List<Cliente> listarClientes () {
		return clienteDAO.listar();
	}
}
