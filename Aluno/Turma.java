/**
 * Escreva uma descrição da classe Turma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Turma
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int numAlunos;
    private String nome;
    private String ano;

    /**
     * Construtor para objetos da classe Turma
     */
    public Turma()
    {
      // inicializa variáveis de instância
        
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getNumAlunos()
    {
        return this.numAlunos;
    }

    public void setNumAlunos(int numAlunos)
    {
        this.numAlunos = numAlunos;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getAno()
    {
        return this.ano;
    }

    public void setAno(String Ano)
    {
        this.ano = ano;
    }

}