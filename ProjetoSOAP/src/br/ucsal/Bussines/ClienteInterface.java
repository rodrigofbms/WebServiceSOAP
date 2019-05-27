package br.ucsal.Bussines;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.ucsal.Classes.Cliente;


@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ClienteInterface {

	
@WebMethod
public  Cliente listarClientes ();
	
}
