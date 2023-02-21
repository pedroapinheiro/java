package aula_metodos;

public class TestaMetodos {

	public static void main(String[] args) {

		metodoPublico();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();

		System.out.println();

		Classe_1.metodoProtegido1();
		Classe_1.metodoFriendly1();
		Classe_1.metodoProtegido1();
		// Classe1.metodoPrivado1();

		System.out.println();

		metodoPublico();
		//metodoFriendlyPacote1();
		//metodoProtegidoPacote1();
		//metodoPrivadoPacote1();

		System.out.println();

		System.out.println(soma(2, 4));

	}

	public static void metodoPublico() {
		System.out.println("Eu sou um Método Público");
	}

	static void metodoPadrao() {
		System.out.println("Eu sou um Método Friendly");
	}

	protected static void metodoProtegido() {
		System.out.println("Eu sou um Método Protegido");
	}

	private static void metodoPrivado() {
		System.out.println("Eu sou um Método Privado");
	}

	public static int soma(int valor1, int valor2) {
		return valor1 + valor2;
	}

}