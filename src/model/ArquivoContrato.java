package model;

public class ArquivoContrato {

	private String nome;
	private String extensao;
	private Contrato contrato;
	private static ArquivoContrato arquivoContrato;
	
	private ArquivoContrato(String nome) {
		this.nome = nome;
		this.extensao = "";
		this.contrato.setConteudo("");
	}
	
	private ArquivoContrato(String nome, String extensao, Contrato contrato) {
		this.nome = nome;
		this.extensao = extensao;
		this.contrato.setConteudo("");
	}
	
	public static ArquivoContrato criarNomeArquivo(String nome) {
		if(arquivoContrato != null) {
			arquivoContrato.contrato.setNome(nome);
			return arquivoContrato;
		}
		
		if(!validarArquivo(nome)) {
			return null;
		}
		return new ArquivoContrato(nome);
	}
	
	public static ArquivoContrato criarNomeExtensao(String nome, String extensao) {
		// TODO Auto-generated method stub
		if(arquivoContrato != null) {
			arquivoContrato.setNome(nome);
			arquivoContrato.setExtensao(extensao);
			return arquivoContrato;
		}
		
		if(!validarArquivo(nome)) {
			return null;
		}
		
		if(!validarArquivo(extensao)) {
			return null;
		}
		
		return new ArquivoContrato(nome, extensao, arquivoContrato.contrato);
	}
	
	private static boolean validarArquivo(String conteudo) {
		if(conteudo.contains(" ")) {
			return false;
		} else {
			return true;
		}
	}
	
	public void setNome(String nome) {
		if(!validarArquivo(nome)) {
			return;
		}
		this.nome = nome;
	}
	
	public void setExtensao(String extensao) {
		if(!validarArquivo(extensao)) {
			return;
		}
		this.extensao = extensao;
	}
	
	public void setNomeArquivoContrato(Contrato contrato) {
		this.contrato.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getExtensao() {
		return extensao;
	}
	
	public String getNomeArquivoContrato() {
		return contrato.getNome();
	}
	
}
