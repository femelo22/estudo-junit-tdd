package runner;

import java.util.Scanner;

import entities.Cliente;
import exceptions.OperacaoBancariaException;

public class ATM {
	
	public static void main(String[] args) throws OperacaoBancariaException {
		Scanner entrada = new Scanner(System.in);
		
		EscolhaCenario operacoes = new EscolhaCenario();
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu saldo altual:");
		Double saldoAtual = entrada.nextDouble();
		
		System.out.println("SEJA BEM VINDO(A) AO BANCO SAFE\n");
		
		System.out.println("Cliente logado: {" + nome + "} | Saldo atual: {" + saldoAtual + "}\n");
		
		System.out.println("Digite (1) para depositar");
		System.out.println("Digite (2) para sacar");
		System.out.println("Digite (3) para realizar transferencia");
		System.out.println("Digite (4) para sair\n");
		
		int opcao = entrada.nextInt();
		
		Cliente cliente = new Cliente(nome, saldoAtual);
		
		operacoes.escolhaDeCenario(opcao, cliente);
		
		
		
		//System.out.println("Sua idade é: " + idade);
		
		System.out.println("FIM");

	}

}
