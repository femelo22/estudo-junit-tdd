package br.lf.services;

import java.util.Date;

import br.lf.entities.Cliente;
import br.lf.entities.Operacao;
import br.lf.enums.TipoOperacao;

public class OperacaoBancariaService {

	public Operacao realizarSaque(Cliente cliente, Double valorSaque) {
		
		Double saldoAtual = cliente.getSaldo()  - valorSaque;
		
		Operacao operacaoBancaria = new Operacao();
		
		cliente.setSaldo(saldoAtual);
		
		operacaoBancaria.setCliente(cliente);
		operacaoBancaria.setDataOperacao(new Date());
		operacaoBancaria.setTipo(TipoOperacao.SAQUE);
		operacaoBancaria.setValorOperacao(valorSaque);
		
		System.out.println("Passou");
		
		return operacaoBancaria;
		
	}

}
