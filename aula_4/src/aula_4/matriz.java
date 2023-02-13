package aula_4;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		float[][] matriz = new float[2][2];
		
		// Ler as linhas
		for (int indiceI = 0; indiceI < matrizInteiros.length; indiceI ++) {
			
			// Ler as colunas
			for (int indiceJ = 0; indiceJ < matrizInteiros.length; indiceJ ++) {
				
				System.out.println(matrizInteiros[indiceI][indiceJ]);
				
			}
			
		}
		
		for (int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ ++) {
				System.out.println("Digite um valor Real: ");
				matriz[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for(float[] vetor : matriz) {
			for(var elemento : vetor) {
				System.out.println(elemento);
			}
		}
	
		leia.close();
	}

	}