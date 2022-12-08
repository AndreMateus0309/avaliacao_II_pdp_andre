package model;

public class PassageiroDAODecorator implements PassageiroDAOInterface {
	private static PassageiroDAOInterface passageiroDAO;
	
	private PassageiroDAOInterface getDao() {
		
		if(this.passageiroDAO == null) {
			this.passageiroDAO = new PassageiroDAOProxy();
		}
		
		return this.passageiroDAO;
	}
	
	@Override
	public void addPassageiro(String nome) throws PassageiroException {
		// TODO Auto-generated method stub
		if(nome.isBlank()) {
			throw new PassageiroException("O nome do passageiro está em branco!");
		} else {
			getDao().addPassageiro(nome);
		}
	}

	@Override
	public Passageiro getPassageiro(String nome) throws PassageiroException {
		// TODO Auto-generated method stub
		
		if(nome.isBlank()) {
			throw new PassageiroException("O nome do passageiro está em branco!");
		}
		
		Passageiro passageiro = getDao().getPassageiro(nome);
		
		if(passageiro == null) {
			throw new PassageiroException("Usuário inválido!");
		}
		
		return passageiro;
	}
}
