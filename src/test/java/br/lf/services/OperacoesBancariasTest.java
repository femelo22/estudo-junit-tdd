package br.lf.services;

import static org.hamcrest.CoreMatchers.is;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class OperacoesBancariasTest {
	
	@Test
	public void test_sacar() {
		Cliente cliente = new Cliente("Luiz Fernando", 1000.0);
		
		Double resultado = banco.realizaSaque(100.0);
		
		Assert.assertEquals(resultado, is(900.0));
	}

}
