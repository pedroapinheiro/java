package javaVariaveisEOperadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras,desconto ,salarioLiquido;
		
		System.out.println("Digite o Salario Bruto:");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno:");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite o Horas Extras:");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o Desconto:");
		desconto = leia.nextFloat();
		System.out.println("Digite o Salario Liquido:");
		salarioLiquido = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - desconto;
		
		System.out.printf("Novo salario: R$%.2f", salarioLiquido);
		
	
		
		

	}

}
