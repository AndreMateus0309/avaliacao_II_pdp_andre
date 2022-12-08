package model;

public class Contrato {
	private String nome;
	private String conteudo;
	private double preco;
	
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
	
	public void addPropriedades(RelatorioContratos rc) {
		rc.addPropriedade(PropriedadesRelatorios.FISICO, this.preco);
	}
}
