package services;

import daos.BancoDAO;
import entities.Cliente;
import exceptions.OperacaoBancariaException;

public class OperacoesService {
	
	private BancoDAO dao = new BancoDAO();
	
	public Double depositar(Cliente cliente, Double valorDeposito) throws OperacaoBancariaException {
		
		this.verificarCartao(cliente);
		
		return cliente.getSaldo() + valorDeposito;
	}
	

	public Double sacar(Cliente cliente, Double valorSaque) throws OperacaoBancariaException {
		
		this.verificarCartao(cliente);
		
		if(cliente.getSaldo() < valorSaque) {
			throw new OperacaoBancariaException("Saldo insuficiente");
		}
		
		return cliente.getSaldo() - valorSaque;
	}
	
	public void verificarCartao(Cliente cliente) throws OperacaoBancariaException {
		if(dao.cartaoBloqueado(cliente)) {
			throw new OperacaoBancariaException("Não é possivel realizar operacoes com cartao bloqueado");
		}
	}
	
	
	

}
