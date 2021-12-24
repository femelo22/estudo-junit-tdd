package services;

import entities.Cliente;
import exceptions.OperacaoBancariaException;

public class OperacoesService {
	
	public Double depositar(Cliente cliente, Double valorDeposito) {
		
		return cliente.getSaldo() + valorDeposito;
	}
	

	public Double sacar(Cliente cliente, Double valorSaque) throws OperacaoBancariaException {

		if(cliente.getSaldo() < valorSaque) {
			throw new OperacaoBancariaException("Saldo insuficiente");
		}
		
		return cliente.getSaldo() - valorSaque;
	}
	
	

}
