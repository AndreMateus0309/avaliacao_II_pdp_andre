package model;

public class Role {
	private String nome;
	
	public Role nomeadoNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
