package exercicio_1_cliente;

public abstract class Cliente {

    private String nome;
    private String telefone;
    private Integer idade;
    private String email;
    private String endereco;
    private Integer tipo;

    public Cliente(String nome, String telefone,Integer idade, String email, String endereco, Integer tipo) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public void visualizar() {
        String tipo = "";
        switch (this.tipo){
            case 1 -> System.out.println("Pessoa Física");
            case 2 -> System.out.println("Pessoa Juridica");
        }
        System.out.println(nome + ", " + telefone + ", " + idade + ", " + email + ", " + endereco + ", " + tipo);
    }
}