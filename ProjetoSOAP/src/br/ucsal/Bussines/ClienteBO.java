package br.ucsal.Bussines;

import javax.jws.WebService;

import br.ucsal.Classes.Cliente;
import br.ucsal.DAO.ClienteDAO;

@WebService(endpointInterface = "Bussines.ClienteInterface")
public class ClienteBO implements ClienteInterface{

	private ClienteDAO clienteDAO;
	
	@Override
	public Cliente listarClientes () {
		return clienteDAO.listar();
	}

	

}
