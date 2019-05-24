package br.ucsal.Classes;

public class Cliente {

	Integer id;
	String nome;
	
	public Cliente(int i, String string) {
		this.id=i;
		this.nome=string;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
