package mtransporte;

public class Automovel extends Terrestre{
	
	private String cor;
	private int nPortas;
	private String placa;
	private int marcha;
	
	public Automovel(int capacidade, int nRodas, float velocidade, String cor, int nportas, String placa, int marcha) {
		super(capacidade, nRodas, velocidade);
		this.cor = cor;
		this.nPortas = nportas;
		this.placa = placa;
		this.marcha = marcha;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNportas() {
		return nPortas;
	}

	public void setNportas(int nportas) {
		this.nPortas = nportas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Cor: " + this.cor);
		System.out.println("Número de Portas: " + this.nPortas);
		System.out.println("Placa: " + this.placa);
		System.out.println("Marchas: " + this.marcha);
	}
	
}
