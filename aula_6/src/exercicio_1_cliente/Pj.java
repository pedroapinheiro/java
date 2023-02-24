package exercicio_1_cliente;

public class Pj extends Cliente{

	public Pj(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo) {
		super(nome, telefone, idade, email, endereco, tipo);
		// TODO Auto-generated constructor stub
	}

	private String cnpj;

    public void PessoaJuridica(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo, String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println(", " + cnpj);
    }
}