package model;

public class TrajetoComposto implements Trajeto {
	
	private Trajeto primeiro;
	private Trajeto segundo;
	private double taxaConexao;
	
	public TrajetoComposto(Trajeto primeiro, Trajeto segundo, double taxaConexao) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.taxaConexao = taxaConexao;
		if(!primeiro.getDestino().equals(segundo.getOrigem())) {
			throw new RuntimeException("O destino do primeiro trecho não pode ser a origem do segundo!");
		}
	}

	@Override
	public String getOrigem() {
		// TODO Auto-generated method stub
		return this.primeiro.getOrigem();
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return this.segundo.getDestino();
	}

	@Override
	public double getValorTotal() {
		// TODO Auto-generated method stub
		return this.primeiro.getValorTotal() + this.segundo.getValorTotal() + this.taxaConexao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return primeiro.toString() + "\n" + segundo.toString();
	}
	
}
