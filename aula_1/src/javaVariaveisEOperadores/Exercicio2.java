package javaVariaveisEOperadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		System.out.println("Informe a nota1:");
		nota1 = leitor.nextFloat();
		System.out.println("Informe a nota2:");
		nota2 = leitor.nextFloat();
		System.out.println("Informe a nota3:");
		nota3 = leitor.nextFloat();
		System.out.println("Informe a nota4:");
		nota4 = leitor.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média final: %.1f", mediaFinal);
		
		

	}

}
