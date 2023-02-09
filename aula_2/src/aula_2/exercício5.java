package aula_2;

import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int item, quantidade; 
		
		System.out.println("1 Chachorro Quente");
		System.out.println("2 X Salada");
		System.out.println("3 X Bacon");
		System.out.println("4 Bauru");
		System.out.println("5 Refrigerante");
		System.out.println("6 Suco de laranja");
		
		System.out.println("Digite código do produto (1 a 6): ");
		item = leia.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		quantidade = leia.nextInt();
		
		switch(item) {
		case 1:
			System.out.println("Produto: Cachorro quente");
			System.out.println("Valor total: " + (quantidade * 10.00));
			break;
		case 2:
			System.out.println("Produto: X Salada");
			System.out.println("Valor total: " + (quantidade * 15.00));
			break;
		case 3:
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: " + (quantidade * 12.00));
			break;
		case 4:
			System.out.println("Produto Refrigerante");
			System.out.println("Valor total: " + (quantidade * 8.00));
			break;
		case 5:
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: " + (quantidade * 13.00));
			break;
		
			default:
				System.out.println("Produto inválido: ");
				
		}
		
		leia.close();
		
		
		
		
		
	}

}
