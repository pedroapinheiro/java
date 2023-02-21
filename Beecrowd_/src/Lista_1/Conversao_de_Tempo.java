package Lista_1;

import java.util.Scanner;

public class Conversao_de_Tempo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		int seg = n%60;
		int min = (n/60) % 60;
		int hrs = (n/60)/60;
		
		System.out.println(hrs + ":" + min + ":" + seg);
		
leia.close();
	}

}
