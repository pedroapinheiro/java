package Lista_4;

import java.util.Scanner;

public class SelecaoEmVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numeros[] = new float[100];
		
		for (int indice = 0; indice < numeros.length; indice++) {
			numeros[indice] = leia.nextFloat();
		}
		
		for (int indice = 0; indice < numeros.length; indice++) {
			if(numeros[indice] <= 10)
				System.out.println("A[" + indice + "] = " + numeros[indice]);
		}
		
		leia.close();

	}

}