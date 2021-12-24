package entities;

public class Cliente {
	
	private String nome;
	
	private Double saldo;

	public Cliente(String nome, Double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	

}
