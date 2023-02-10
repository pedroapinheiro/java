package aula_3;

import java.util.Scanner;

public class Exercício_2_FOR {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		int numero, pares = 0, impares = 0;
				
		for (int contador = 1; contador <= 10 ; contador ++) {
			
			System.out.println("Informe o " + contador + "º número:");
			numero = leia.nextInt();
			
			if (numero %2 == 0) 
				pares++;
			 else 
				impares++;
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
						
		leia.close();
	}

	}
