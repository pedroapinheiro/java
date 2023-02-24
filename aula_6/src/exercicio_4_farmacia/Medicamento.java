package exercicio_4_farmacia;

public class Medicamento extends Farmacia{

	private String principioAtivo;

	public Medicamento(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			int tipo, String principioAtivo) {
		super(id, nome, nomeComercial, fabricante, foto, preco, tipo);
		this.principioAtivo = principioAtivo;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Princípio ativo: " +  this.principioAtivo);
	}

	@Override
	public void reajuste(float percentual) {
		
		this.setPreco(this.getPreco() + ((this.getPreco() * percentual) + 0.1f));
		
	}
	
}