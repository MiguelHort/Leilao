public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String contato, int idade, String cpf) {
        super(nome, contato, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
