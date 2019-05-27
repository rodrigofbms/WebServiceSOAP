package br.ucsal.DAO;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.Classes.Cliente;

public class ClienteDAO {

	static List<Cliente> lista = new ArrayList<>();
	
	public Cliente listar() {
		
		lista.add(new Cliente(1, "Rodrigo"));
		lista.add(new Cliente(2, "Rafael"));
		return lista.get(0);
	}
}
