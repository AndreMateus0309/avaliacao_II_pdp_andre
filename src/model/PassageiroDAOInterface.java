package model;

public interface PassageiroDAOInterface {
	public void addPassageiro(String nome) throws PassageiroException;
	public Passageiro getPassageiro(String nome) throws PassageiroException;
}
