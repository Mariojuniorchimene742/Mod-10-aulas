public class BibliotecaTeste
{


    public static void main(String[] args) 
    {
        Livro livro1 = new Livro(11, "Java Básico", "Maria Silva", 2020, "123-456-789");
        Livro livro2 = new Livro(12, "Programação Avançada", "João Sousa", 2018, "987-654-321");

        livro1.setTitulo("Java Básico - 2ª Edição");
        System.out.println(livro1.getTitulo());

        System.out.println("Autor do segundo livro: " + livro2.getAutor());
        System.out.println("ISBN do segundo livro: " + livro2.getIsbn());
        System.out.println();

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}