public class Livro
{
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;


    /**
     
Construtor para objetos da classe Livro
   */
  public Livro(int id, String titulo, String autor, int anoPublicacao, String isbn)
  {
      this.id = id;
      this.titulo = titulo;
      this.autor = autor;
      this.anoPublicacao = anoPublicacao;
      this.isbn = isbn;

  }

  public int getId()
  {
      return this.id;
  }

  public void setId(int id)
  {
      this.id = id;
  }

  public String getTitulo()
  {
      return this.titulo;
  }

  public void setTitulo(String titulo)
  {
      this.titulo = titulo;
  }

  public String getAutor()
  {
      return this.autor;
  }

  public void setAutor(String autor)
  {
      this.autor = autor;
  }

  public int getAnoPublicacao()
  {
      return this.anoPublicacao;
  }

  public void setAnoPublicacao(int anoPublicacao)
  {
      this.anoPublicacao = anoPublicacao;
  }

  public String getIsbn()
  {
      return this.isbn;
  }

  public void setIsbn(String isbn)
  {
      this.isbn = isbn;
  }

   public void exibirInformacoes() {
      System.out.println("Título: " + id);
      System.out.println("Título: " + titulo);
      System.out.println("Autor: " + autor);
      System.out.println("Ano de Publicação: " + anoPublicacao);
      System.out.println("ISBN: " + isbn);
      System.out.println("---------------------------");
  }

}