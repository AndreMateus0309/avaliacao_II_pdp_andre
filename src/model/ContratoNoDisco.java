package model;

import java.util.HashMap;
import java.util.Map;

public class ContratoNoDisco extends RecuperadorContratosViagem {
	private Map<String, Contrato> bd = new HashMap<>();

	public ContratoNoDisco(RecuperadorContratosViagem proximoTipo) {
		super(proximoTipo);
		bd.put("b", new Contrato("b", "conteúdo b"));
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
