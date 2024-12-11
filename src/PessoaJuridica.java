public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String contato, int idade, String cnpj) {
        super(nome, contato, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
