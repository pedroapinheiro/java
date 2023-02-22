package exercicio_6_curso;

public class Curso {
	private String nome;
	private int horasDuracao;
	private String professor;
	private String trilha;
	private String nivel;
	
	public Curso(String nome, int horasDuracao, String professor, String trilha, String nivel) {
		this.nome = nome;
		this.horasDuracao = horasDuracao;
		this.professor = professor;
		this.trilha = trilha;
		this.nivel = nivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasDuracao() {
		return horasDuracao;
	}

	public void setHorasDuracao(int horasDuracao) {
		this.horasDuracao = horasDuracao;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getTrilha() {
		return trilha;
	}

	public void setTrilha(String trilha) {
		this.trilha = trilha;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	public void visualizar() {
		System.out.println("=====================");
		System.out.println("   JAVA PARA TODES   ");
		System.out.println("=====================");
		System.out.println("Nome:             " + this.nome);
		System.out.println("Professor:        " + this.professor);
		System.out.println("Tempo de duração: " + this.horasDuracao + " Horas");
		System.out.println("Nível:            " + this.nivel);
		System.out.println("Trilha:           " + this.trilha);
		System.out.println("");	
	}
}