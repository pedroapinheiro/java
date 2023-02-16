package aula_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int valor;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com um número para adicioná-lo no Set: ");
			valor = leia.nextInt();
			numeros.add(valor);
		}
		leia.close();
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("Os valores disponíveis são os seguintes: ");
		while(iNumeros.hasNext())
			System.out.println(iNumeros.next());
	}
}