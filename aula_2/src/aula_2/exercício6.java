package aula_2;

import java.util.Scanner;

public class exercício6 {

	public static void main(String[] args) {
		
    try (Scanner leia = new Scanner(System.in)) {
		String nome;
		float salario; 
		
		System.out.println("Cargo:");
		System.out.println("1-Gerente:");
		System.out.println("2-Vendedor:");
		System.out.println("3-Supervisor:");
		System.out.println("4-Motorista:");
		System.out.println("5-Estoquista:");
		System.out.println("6-Técnico de TI:");
		
		System.out.println("Informe o código do seu Cargo:");
		System.out.println("Informe seu seu Nome:");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Informe seu Salário:");
		salario = leia.nextFloat();
		
		int func = 0;
		int perc;
		switch (func) {
		case 1 : 
			perc=10;
			System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
			break;
		case 2:
			perc=7;
			System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
			
			break;
		case 3:
			perc=9;
			System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
			
			break;
		case 4:
			perc=6;
			System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
			
			break;
		case 5:
			perc=5;
			System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
			
			break;
		case 6: 
			perc=8;
			System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
			
			break;
			
		}
	}
   
    
	}

}
