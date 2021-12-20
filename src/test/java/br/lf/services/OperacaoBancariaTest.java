package br.lf.services;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

import br.lf.entities.Cliente;
import br.lf.entities.Operacao;


public class OperacaoBancariaTest {
	
	@Test
	public void test_OperacaoSaque() {
		Cliente cliente = new Cliente("Luiz Fernando", 1000.0);
		
		OperacaoBancariaService banco = new OperacaoBancariaService();
		
		Operacao resultado = banco.realizarSaque(cliente, 100.0);
		
		Assert.assertEquals(resultado.getCliente().getSaldo(), is(900.0));
	}

}
