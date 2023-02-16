package aula_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exc_1_Fila {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String novoCliente;
		
		do {
			System.out.println("\n\n");
			System.out.println("*************************************************");
			System.out.println("\n");
			System.out.println("\t1. Adicionar novo cliente.");
			System.out.println("\t2. Listar todos os clientes.");
			System.out.println("\t3. Chamar cliente para atendimento.");
			System.out.println("\t0. Sair");
			System.out.println("\n");
			System.out.println("*************************************************");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
			System.out.println("\n\n");
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastro de Cliente: ");
				System.out.println("Entre com o nome do novo Cliente: ");
				leia.skip("\\R?");
				novoCliente = leia.nextLine();
				
				filaBanco.add(novoCliente);
				System.out.println("Cliente adicionado.");
				
				break;
			case 2:
				
				if(!filaBanco.isEmpty()) {
					System.out.println("Clientes na fila: ");
					for(var cliente: filaBanco)
						System.out.println(cliente + " ");
				}
				else
					System.out.println("Não há Cliente aguardando.");
				
				break;
			case 3:
				System.out.println("Próximo no atendimento: ");
				if(!filaBanco.isEmpty())
					System.out.println(filaBanco.poll());
				else
					System.out.println("Não há Cliente aguardando.");
				
				break;
			case 0:
				opcao = 0;
				System.out.println("Programa encerrado.");
				
				break;
			
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}while(opcao != 0);
		
		leia.close();
	}
}

