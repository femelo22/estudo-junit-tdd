package runner;

import java.util.Scanner;

public class BemVindo {
	
	public static int menuOpcoes() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("SEJA BEM VINDO(A) AO BANCO SAFE\n");

		
		System.out.println("Digite (1) para depositar");
		System.out.println("Digite (2) para sacar");
		System.out.println("Digite (3) para realizar trasnferencias");
		System.out.println("Digite (4) para sair\n");
		
		int opcao = entrada.nextInt();
		
		return opcao;
	}

}
