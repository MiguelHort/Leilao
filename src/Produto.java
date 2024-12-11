import java.time.LocalDate;

public class Produto {
    private String nome;
    private String descricao;
    private double lanceMinimo;
    private double lanceFinal;
    private Pessoa vencedor;
    private LocalDate dataArremate;

    public Produto(String nome, String descricao, double lanceMinimo) {
        if (lanceMinimo <= 0) {
            throw new IllegalArgumentException("O valor do lance mínimo deve ser maior que zero.");
        }
        this.nome = nome;
        this.descricao = descricao;
        this.lanceMinimo = lanceMinimo;
        this.lanceFinal = 0.0;
    }

    public boolean registrarLance(Pessoa pessoa, double valor) {
        if (valor > lanceMinimo && valor > lanceFinal) {
            lanceFinal = valor;
            vencedor = pessoa;
            dataArremate = LocalDate.now();
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getLanceFinal() {
        return lanceFinal;
    }

    public Pessoa getVencedor() {
        return vencedor;
    }

    public LocalDate getDataArremate() {
        return dataArremate;
    }
}
