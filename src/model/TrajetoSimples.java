
package model;

public class TrajetoSimples implements Trajeto {
	
	public String origem;
	public String destino;
	public double valorTotal;
	
	public TrajetoSimples(String origem, String destino, double valorTotal) {
		this.origem = origem;
		this.destino = destino;
		this.valorTotal = valorTotal;
	}

	@Override
	public String getOrigem() {
		// TODO Auto-generated method stub
		return this.origem;
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return this.destino;
	}

	@Override
	public double getValorTotal() {
		// TODO Auto-generated method stub
		return this.valorTotal;
	}

	@Override
	public String toString() {
		return "TrajetoSimples [origem=" + origem + ", destino=" + destino + ", valorTotal=" + valorTotal + "]";
	}

	
}
