package exercicio_4_farmacia;

public class Perfumaria extends Farmacia{

	private String fragancia;

	public Perfumaria(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			int tipo, String fragancia) {
		super(id, nome, nomeComercial, fabricante, foto, preco, tipo);
		this.fragancia = fragancia;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Fragância: " +  this.fragancia);
	}

	@Override
	public void reajuste(float percentual) {
		
		this.setPreco(this.getPreco() + (this.getPreco() * percentual));
		
	}	
}