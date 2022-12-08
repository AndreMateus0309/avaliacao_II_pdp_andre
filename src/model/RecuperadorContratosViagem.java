package model;

public abstract class RecuperadorContratosViagem {
	private RecuperadorContratosViagem proximoTipo;
	
	public RecuperadorContratosViagem(RecuperadorContratosViagem proximoTipo) {
		// TODO Auto-generated constructor stub
		this.proximoTipo = proximoTipo;
	}
	
	public Contrato recuperarContrato(String nomeContrato) {
		Contrato contrato = recuperaContrato(nomeContrato);
		if(contrato == null) {
			return chamarProximo(nomeContrato);
		} else {
			return contrato;
		}
	}
	
	private Contrato chamarProximo(String nomeContrato) {
		if(proximoTipo == null) {
			throw new RuntimeException("Não foi possível recuperar o contrato:" + nomeContrato);
		}
		return proximoTipo.recuperarContrato(nomeContrato);
	}
	
	protected abstract Contrato recuperaContrato(String nome);
}
