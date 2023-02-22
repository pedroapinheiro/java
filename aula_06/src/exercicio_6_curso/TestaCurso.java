package exercicio_6_curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso("JAVA - Para iniciantes. ", 30, "Diogo ", "Java para Mobile ", "Iniciante ");
		
		curso1.visualizar();
		
		Curso curso2 = new Curso("Javascript Senior. ", 90, "Rafael ", "Java para Web ", "Avançado ");
		
		curso2.visualizar();
	}

}