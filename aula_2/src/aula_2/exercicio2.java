package aula_2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int n1;
		
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		
		if ((n1 % 2) == 0 && n1 > 0)
		System.out.println("O número " + n1 + " É par e positivo");
		
		else if ((n1 % 2) == 0 && n1 < 0)
		System.out.println("O número " + n1 + " É par e negativo");
		
		else if ((n1 % 2) != 0 && n1 > 0)
			System.out.println("O número " + n1 + " É ímpar e positivo");
		
		else if ((n1 % 2) != 0 && n1 < 0)
			System.out.println("O número " + n1 + " É ímpar e negativo");
		
	
		leia.close();
		
		
		
		
	}

}
