package aula_3;

import java.util.Scanner;

public class Exercício_3_WHILE {

	public static void main(String[] args) {
		
		
Scanner leia = new Scanner(System.in);
		
		int idade = 0, maiores = 0, menores = 0;
		
		while (idade >= 0) {
			
			System.out.println("Informe uma idade:");
			idade = leia.nextInt();
			
				if(idade > 0 && idade < 21)
					menores++;
				else if (idade > 50)
					maiores++;
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);
		
		leia.close();
	}

	}
