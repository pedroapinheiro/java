package javaVariaveisEOperadores;

import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
	float salario, abono, novoSalario;
	
		System.out.println("Digite o salario:");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("Novo salario: R$%.2f", novoSalario);
		
	}
}