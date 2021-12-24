package runner;

import java.util.Scanner;

import entities.Cliente;
import exceptions.OperacaoBancariaException;
import services.OperacoesService;

public class EscolhaCenario {
	
	OperacoesService service = new OperacoesService();
	
	Scanner entrada = new Scanner(System.in);


	public void escolhaDeCenario(int opcao, Cliente cliente) throws OperacaoBancariaException {
		switch (opcao) {
		case 1:
			System.out.println("*** DEPOSITO BANCÁRIO ***");
			
			System.out.println("Digite o valor do seu depósito:");
			
			Double valorDeposito = entrada.nextDouble();
			
			Double saldoAtual = service.depositar(cliente, valorDeposito);
			
			System.out.println("Seu novo saldo é: " + saldoAtual);
			
			break;
		case 2:
			System.out.println("*** SAQUES ***");
			
			System.out.println("Digite o valor que deseja sacar: ");
			
			Double valorSaque = entrada.nextDouble();
			
			Double saldoAtualSaque = service.sacar(cliente, valorSaque);
			
			System.out.println("Seu novo saldo é: " + saldoAtualSaque);
			break;
		case 3:
			System.out.println("*** TRASFERÊNCIAS ***");
			break;
		case 4:
			System.out.println("ENCERRANDO SESSÃO, OBRIGADO!");
			break;
		default:
			break;
		}
	}
	
}
