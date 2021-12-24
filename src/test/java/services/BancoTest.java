package services;

import static builders.ClienteBuilder.umCliente;
import static builders.ClienteBuilder.umClienteSemSaldo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import entities.Cliente;
import exceptions.OperacaoBancariaException;

public class BancoTest {
	
	
	
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void test_DeveRealizarDeposito() {
		Cliente c1 = umCliente().agora();
		
		OperacoesService pgtoService = new OperacoesService();
		
		Double saldoAtualizado = pgtoService.depositar(c1, 100.0);
		
		assertThat(saldoAtualizado, is(1100.0));
	}
	
	@Test
	public void test_DeveRealizarSaque() throws OperacaoBancariaException {
		Cliente cliente = umCliente().agora();
		
		OperacoesService pgtoService = new OperacoesService();
		
		Double saldoAtualizado = pgtoService.sacar(cliente, 100.0);
		
		assertThat(saldoAtualizado, CoreMatchers.is(900.0));
	}
	
	
	@Test
	public void test_RealizarSaqueSemSaldo() throws OperacaoBancariaException {
		Cliente cliente = umClienteSemSaldo().agora();
		OperacoesService pgtoService = new OperacoesService();
		
		exception.expect(OperacaoBancariaException.class);
		exception.expectMessage("Saldo insuficiente");
		
		pgtoService.sacar(cliente, 2000.0);
	}
	
	
	
	

}
