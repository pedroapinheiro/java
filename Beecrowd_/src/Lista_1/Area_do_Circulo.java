package Lista_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area_do_Circulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		DecimalFormat formatacao = new DecimalFormat(".0000");
		
		double r, a;
		String resultadoString;
		
		r = leia.nextDouble();
		a = 3.1459 * (r*r);
		
		resultadoString = formatacao.format(a);
		System.out.println("A=" + resultadoString);
		
		

	leia.close();
		
	}

}
