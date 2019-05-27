package br.ucsal.Classes;

import javax.xml.ws.Endpoint;

import br.ucsal.Bussines.ClienteBO;

public class Publicador {

	public static void main(String[] args) {
		System.out.println("Venha fazer parte dessa macumba generalizada");
		Endpoint.publish("http://locahost:8081/macumba", new ClienteBO());
		System.out.println("PUBLICADO MEU JOVEM!!!");
	}
}
