public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Computador", 899.99);
        Produto p2 = new Produto("Telemóvel", 499.50);

        // A Loja agrega produtos existentes
        Loja loja = new Loja("TechZone", p1, p2);

        loja.mostrarProdutos();
    }
}