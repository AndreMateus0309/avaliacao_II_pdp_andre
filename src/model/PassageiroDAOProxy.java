package model;

import java.util.HashMap;
import java.util.Map;

public class PassageiroDAOProxy implements PassageiroDAOInterface {
	private Map<String, Passageiro> passageiros;
	
	public PassageiroDAOProxy() {
		// TODO Auto-generated constructor stub
		super();
		this.passageiros = new HashMap<>();
	}
	
	@Override
	public void addPassageiro(String nome) throws PassageiroException {
		// TODO Auto-generated method stub
		this.passageiros.put(nome, new Passageiro(nome));
	}

	@Override
	public Passageiro getPassageiro(String nome) throws PassageiroException {
		// TODO Auto-generated method stub
		return passageiros.get(nome);
	}
	
}
