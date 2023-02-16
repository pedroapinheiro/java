package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<Double>();

		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("1- Cadastrar nota");
			System.out.println("2- Listar todas as notas");
			System.out.println("3- Procurar uma nota");
			System.out.println("4- Remover uma nota");
			System.out.println("5- Atualizar nova existente");
			System.out.println("6- Sair");
			System.out.println("Digite a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				if (nota <= 0 || nota > 10) {
					System.out.println("Nota inválida!");
					notas.remove(nota);
				}
				if (nota > 0 || nota < 10) {
					nota = leia.nextDouble();
					notas.add(nota);
				}
				break;
			case 2:
				System.out.println("Todas as notas");
				if (notas.isEmpty())
					System.out.println("Base de dados vazias!");
				else
					notas.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Procurar uma nota");
				System.out.println("Digite a nota");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				if (notas.contains(nota))
					System.out.println("O índice da minha nota é: " + notas.indexOf(nota));
				break;
			case 4:
				System.out.println("Digite a nota");
				nota = leia.nextDouble();
				notas.remove(nota);
				notas.remove(notas.indexOf(nota));
				break;
			case 5:
				System.out.println("Atualizar nota");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				System.out.println("Digite a nova nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.lastIndexOf(nota), notaNova);

			default:
				if (opcao > 6)
					System.out.println("Opção Inválida!");
			}
		} while (opcao != 6);

		leia.close();
	}
}