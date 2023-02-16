package aula_5;

import java.util.Scanner;
import java.util.Stack;

public class Exc_2_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		
		int opcao;
		String livro;
		
		while(true) {

			System.out.println("1 - Adicionar Livro na Biblioteca");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Estante");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");
		
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				System.out.println("Programa foi Finalizado! ");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1: 
				System.out.println("Adicionar Livro: ");
				System.out.println("Digire o nome do Livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				livros.push(livro);
				System.out.println("Livro foi adicionado!");
				break;
			case 2: 
				System.out.println("Consultar Livro da Estante");
				livros.forEach(System.out::println);
				break;
			case 3: 
				System.out.println("Retirar Livro");
				if(livros.isEmpty())
					System.out.println("A Estante está vazía!");
				else
					System.out.println("O Livro: " + livros.pop() + "retirado");
				break;
			default:
				System.out.println("Opcao Invalida!");
			}

		}
		
	}

}