package builders;

import entities.Cliente;

public class ClienteBuilder {
	
	private Cliente cliente;
	
	private ClienteBuilder() {}
	
	public static ClienteBuilder umCliente() {
		ClienteBuilder builder = new ClienteBuilder();
		builder.cliente = new Cliente();
		builder.cliente.setNome("Cliente");
		builder.cliente.setSaldo(1000.0);
		return builder;
	}
	
	public static ClienteBuilder umClienteSemSaldo() {
		ClienteBuilder builder = new ClienteBuilder();
		builder.cliente = new Cliente();
		builder.cliente.setNome("Cliente");
		builder.cliente.setSaldo(0.0);
		return builder;
	}
	
	public Cliente agora() {
		return cliente;
	}
	

}
