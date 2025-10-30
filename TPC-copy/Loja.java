public class Loja {
    private String nome;
    private Produto produto1; // agregação: Loja "tem" produtos
    private Produto produto2;

    public Loja(String nome, Produto produto1, Produto produto2) {
        this.nome = nome;
        this.produto1 = produto1;
        this.produto2 = produto2;
    }

    public void mostrarProdutos() {
        System.out.println("Loja: " + nome);
        System.out.println("Produtos disponíveis:");
        if (produto1 != null) {
            System.out.println(" - " + produto1);
        }
        if (produto2 != null) {
            System.out.println(" - " + produto2);
        }
    }
}