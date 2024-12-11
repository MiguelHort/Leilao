public abstract class Pessoa {
    private String nome;
    private String contato;
    private int idade;

    public Pessoa(String nome, String contato, int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Menores de idade não podem ser registrados no leilão.");
        }
        this.nome = nome;
        this.contato = contato;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public int getIdade() {
        return idade;
    }
}
