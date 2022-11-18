package model;

import java.util.HashMap;
import java.util.Map;

public class ContratoFisico extends RecuperadorContratosViagem {
	private Map<String, Contrato> bd = new HashMap<>();

	public ContratoFisico(RecuperadorContratosViagem proximoTipo) {
		super(proximoTipo);
		bd.put("a", new Contrato("a", "conteúdo a"));
	}

	protected Contrato recuperaArquivo(String nomeContrato) {
		if (bd.containsKey(nomeContrato))
			return bd.get(nomeContrato);
		return null;
	}

	@Override
	protected Contrato recuperaContrato(String nomeContrato) {
		// TODO Auto-generated method stub	
		if (bd.containsKey(nomeContrato)) {
			return bd.get(nomeContrato);
		}
		return null;	
	}
}
