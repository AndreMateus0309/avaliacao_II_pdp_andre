package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelatorioContratos {
	private List<Contrato> listaContratos;
	private Map<PropriedadesRelatorios, Double> propriedades;
	
	public void addContrato(Contrato c) {
		getContratos().add(c);
		c.addPropriedades(this);
	}
	
	public void addPropriedade(PropriedadesRelatorios tipo, double preco) {
		this.getPropriedades().put(tipo, getPropriedades().get(tipo) + preco);
	}
	
	private List<Contrato> getContratos() {
		if(this.listaContratos == null) {
			listaContratos = new ArrayList<Contrato>();
		}
		return listaContratos;
	}
	
	private Map<PropriedadesRelatorios, Double> getPropriedades() {
		if(this.propriedades == null) {
			propriedades = new HashMap<PropriedadesRelatorios, Double>();
			
			for(PropriedadesRelatorios tipo : PropriedadesRelatorios.values()) {
				propriedades.put(tipo, 0.0);
			}
			
		}

		return propriedades;
	}
}
