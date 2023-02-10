package aula_3;

import java.util.Scanner;

public class Exercício_5_DO_WHILE {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Informe um número:");
			num = leitor.nextInt();
			
			if(num > 0)
				soma += num;
		
		} while (num != 0);
		
			System.out.println("A soma de todos os números é: " + soma);
		
		leitor.close();

	}

}
