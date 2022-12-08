package model;

public class InserirTexto implements DigitalizarArquivosContrato {
	
	private String documento;
	private String adicionarTexto;

	@Override
	public String escrever() {
		// TODO Auto-generated method stub
		return documento.concat(documento + this.adicionarTexto);
	}

	@Override
	public String apagar() {
		// TODO Auto-generated method stub
		return documento;
	}

	@Override
	public String fazer() {
		// TODO Auto-generated method stub
		return this.documento.concat(adicionarTexto);
	}

	@Override
	public String desfazer() {
		// TODO Auto-generated method stub
		return this.documento;
	}

}
