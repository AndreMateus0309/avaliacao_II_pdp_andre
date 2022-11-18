package model;

public class Contrato {
	private String nome;
	private String conteudo;
	
	public Contrato(String nome, String conteudo) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.conteudo = conteudo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
