package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		int quantidade = 5;
		String cor;
		
		for(int contador =0; contador < quantidade; contador++) {
			System.out.println("Digite uma cor: ");
			leia.skip("\\R?");
			cores.add(leia.nextLine());
		}
			
			System.out.println("Lista de cores: ");
			cores.forEach(System.out::println);
			
			cores.sort(null);
			System.out.println("\nOrdenar as cores: ");
			cores.forEach(System.out::println);
			cores.sort(null);
			cores.forEach(System.out::println);
		
	
		leia.close();
	}

}
