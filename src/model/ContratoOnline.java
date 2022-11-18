package model;

import java.util.HashMap;
import java.util.Map;

public class ContratoOnline extends RecuperadorContratosViagem {
	private Map<String, Contrato> bd = new HashMap<>();

	public ContratoOnline(RecuperadorContratosViagem proximoTipo) {
		super(proximoTipo);
		bd.put("c", new Contrato("c", "conteúdo c"));
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
