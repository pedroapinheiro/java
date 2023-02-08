package javaVariaveisEOperadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, calculo;
		
		System.out.println("Digite N1:");
		n1 = leia.nextFloat();
		System.out.println("Digite N2:");
		n2 = leia.nextFloat();
		System.out.println("Digite o N3:");
		n3 = leia.nextFloat();
		System.out.println("Digite o N4:");
		n4 = leia.nextFloat();
		
		calculo = (n1 * n2) - (n3 * n4);
		System.out.printf("diferença: %.0f", calculo);
		
		

	}

}
