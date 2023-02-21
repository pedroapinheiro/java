package Lista_2;

import java.util.Scanner;

public class Tipos_triangulos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float num1, num2, num3;

		num1 = leia.nextFloat();
		num2 = leia.nextFloat();
		num3 = leia.nextFloat();

		float a = 0, b = 0, c = 0;

		if (num1 >= num2) {
			if (num1 >= num3) {
				if (num2 >= num3) {
					a = num1;
					b = num2;
					c = num3;
				} else {
					a = num1;
					b = num3;
					c = num2;
				}
			}
		}

		if (num2 >= num1) {
			if (num2 >= num3) {
				if (num1 >= num3) {
					a = num2;
					b = num1;
					c = num3;
				} else {
					a = num2;
					b = num3;
					c = num1;
				}
			}
		}

		if (num3 >= num1) {
			if (num3 >= num2) {
				if (num1 >= num2) {
					a = num3;
					b = num1;
					c = num2;
				} else {
					a = num3;
					b = num2;
					c = num1;
				}
			}
		}

		if (a >= (b + c)) {
			System.out.println("Não forma Triangulo");
		} else if ((a * a) > ((b * b) + (c * c))) {
			System.out.println("Triangulo Obtusangulo");
		} else if ((a * a) == ((b * b) + (c * c))) {
			System.out.println("Triangulo Retangulo");
		} else if ((a * a) < ((b * b) + (c * c))) {
			System.out.println("Triangulo Acutangulo");
		}
		if (a == b && a == c && b == c) {
			System.out.println("Triangulo Equilatero");
		} else if (a == b || a == c || b == c) {
			System.out.println("Triangulo Isoceles");
		}

		leia.close();

	}

}