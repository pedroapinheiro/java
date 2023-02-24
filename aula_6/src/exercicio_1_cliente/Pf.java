package exercicio_1_cliente;

public class Pf extends Cliente {

    public Pf(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo) {
		super(nome, telefone, idade, email, endereco, tipo);
		// TODO Auto-generated constructor stub
	}

	private String cpf;

    public void PessoaFisica(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo, String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println(", " + cpf);
    }
}