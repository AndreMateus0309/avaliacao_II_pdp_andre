package model;

public class UsuarioSistema {
	private int id;
	private String nome;
	private String dataNascimento;
	private Role role;
	
	public UsuarioSistema identifierId(int id) {
		this.id = id;
		return this;
	}
	
	public UsuarioSistema nomeadoNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public UsuarioSistema nascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public Role getRole() {
		return role;
	}
}
