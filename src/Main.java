public class Main {
    public static void main(String[] args) {
        // Criação de participantes
        PessoaFisica p1 = new PessoaFisica("João", "joao@example.com", 30, "123.456.789-00");
        PessoaJuridica p2 = new PessoaJuridica("Empresa X", "empresa@example.com", 25, "00.123.456/0001-00");

        // Criação de produtos
        Produto produto1 = new Produto("Notebook", "Notebook Dell, 16GB RAM", 2000.0);
        Produto produto2 = new Produto("Smartphone", "iPhone 14", 4000.0);

        // Registro de lances
        if (produto1.registrarLance(p1, 2500.0)) {
            System.out.println(p1.getNome() + " venceu o leilão do produto " + produto1.getNome());
        }

        if (produto2.registrarLance(p2, 5000.0)) {
            System.out.println(p2.getNome() + " venceu o leilão do produto " + produto2.getNome());
        }

        // Exibição de informações dos produtos
        System.out.println("Produto: " + produto1.getNome() + ", Lance final: " + produto1.getLanceFinal() + ", Vencedor: " + produto1.getVencedor().getNome());
        System.out.println("Produto: " + produto2.getNome() + ", Lance final: " + produto2.getLanceFinal() + ", Vencedor: " + produto2.getVencedor().getNome());
    }
}
